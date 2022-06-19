package com.isec.webcrawler.services.mappers;

import com.isec.webcrawler.network.models.*;
import com.isec.webcrawler.network.models.Character;

import java.util.*;
import java.util.stream.Collectors;

public class LordOfTheRingsApiToInfographicsMapper {

    public static InfographicRequest getInfographicRequest(final GetBooksResponse getBooksResponse,
                                                           final GetChaptersResponse getChaptersResponse,
                                                           final GetMoviesResponse getMoviesResponse,
                                                           final GetQuotesResponse getQuotesResponse,
                                                           final GetCharactersResponse getCharactersResponse) {
        final InfographicRequest request = new InfographicRequest();
        request.setNumberBooks(getBooksResponse.getDocs().size());
        request.setNumberCharacters(getCharactersResponse.getDocs().size());
        request.setNumberMovies(getMoviesResponse.getDocs().size());
        request.setNumberQuotes(getQuotesResponse.getDocs().size());
        request.setCreatedAt(new Date());
        request.setMovies(createMoviesList(getMoviesResponse));
        request.setBooks(createBooksList(getBooksResponse, getChaptersResponse));
        request.setCharacters(createCharactersMap(getCharactersResponse, getQuotesResponse));
        request.setMostTalkativeCharacters(createMostTalkativeCharacters(getCharactersResponse, getQuotesResponse));
        request.setMostSuccessMovies(createMostSuccessMovies(getMoviesResponse));
        return request;
    }

    private static List<InfographicMostSuccessMovies> createMostSuccessMovies(final GetMoviesResponse getMoviesResponse) {
        return getMoviesResponse.getDocs().stream().map(movie -> {
            final InfographicMostSuccessMovies mostSuccessMovie = new InfographicMostSuccessMovies();
            mostSuccessMovie.setName(movie.getName());
            mostSuccessMovie.setRatio(movie.getRottenTomatoesScore());
            return mostSuccessMovie;
        }).collect(Collectors.toList());
    }

    private static Map<String, List<InfographicCharacter>> createCharactersMap(final GetCharactersResponse getCharactersResponse,
                                                                             final GetQuotesResponse getQuotesResponse) {
        final Map<String, List<InfographicCharacter>> result = new HashMap<>();
        for (var character : getCharactersResponse.getDocs()) {
            final InfographicCharacter infographicCharacter = new InfographicCharacter();
            infographicCharacter.setName(character.getName());
            infographicCharacter.setBirth(character.getBirth());
            infographicCharacter.setQuotes(getQuotesResponse.getDocs().stream()
                    .filter(quote -> quote.getCharacter().equals(character.getId()))
                    .map(Quote::getDialog)
                    .collect(Collectors.toList()));
            final List<InfographicCharacter> characters = result.get(character.getRace());
            if (characters == null) {
                final List<InfographicCharacter> newCharacters = new ArrayList<>();
                newCharacters.add(infographicCharacter);
                result.put(character.getRace(), newCharacters);
            } else {
                characters.add(infographicCharacter);
            }
        }
        return result;
    }

    private static List<InfographicMostTalkativeCharacters> createMostTalkativeCharacters(GetCharactersResponse getCharactersResponse, GetQuotesResponse getQuotesResponse) {
        final List<InfographicMostTalkativeCharacters> result = new ArrayList<>();
        for (final var character : getCharactersResponse.getDocs()) {
            final InfographicMostTalkativeCharacters infographicMostTalkativeCharacters = new InfographicMostTalkativeCharacters();
            infographicMostTalkativeCharacters.setName(character.getName());
            final int numberOfQuotes = (int) getQuotesResponse.getDocs().stream().filter(quote -> quote.getCharacter().equals(character.getId())).count();
            infographicMostTalkativeCharacters.setQuotes(numberOfQuotes);
            if (numberOfQuotes > 0) {
                result.add(infographicMostTalkativeCharacters);
            }
        }
        return result;
    }

    private static List<InfographicMovie> createMoviesList(final GetMoviesResponse getMoviesResponse) {
        final List<InfographicMovie> result = new ArrayList<>();
        for (final var movie : getMoviesResponse.getDocs()) {
            final InfographicMovie infographicMovie = new InfographicMovie();
            infographicMovie.setName(movie.getName());
            infographicMovie.setAcademyAwardNominations(movie.getAcademyAwardNominations());
            infographicMovie.setAcademyAwardWins(movie.getAcademyAwardWins());
            infographicMovie.setBoxOfficeRevenueInMillions(movie.getBoxOfficeRevenueInMillions());
            infographicMovie.setBudgetInMillions(movie.getBudgetInMillions());
            infographicMovie.setRuntimeInMinutes(movie.getRuntimeInMinutes());
            infographicMovie.setRottenTomatoesScore(movie.getRottenTomatoesScore());
            result.add(infographicMovie);
        }
        return result;
    }

    private static List<InfographicBook> createBooksList(final GetBooksResponse getBooksResponse,
                                                         final GetChaptersResponse getChaptersResponse) {
        final List<InfographicBook> result = new ArrayList<>();
        for (final var book : getBooksResponse.getDocs()) {
            final InfographicBook infographicBook = new InfographicBook();
            final List<String> chapters = getChaptersResponse.getDocs().stream()
                    .filter(chapter -> chapter.getBook().equals(book.getId()))
                    .map(Chapter::getChapterName)
                    .collect(Collectors.toList());
            infographicBook.setName(book.getName());
            infographicBook.setChapters(chapters);
            result.add(infographicBook);
        }
        return result;
    }
}

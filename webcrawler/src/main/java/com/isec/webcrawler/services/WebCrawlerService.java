package com.isec.webcrawler.services;

import com.isec.webcrawler.network.InfographicsApiController;
import com.isec.webcrawler.network.LordOfTheRingsApiController;
import com.isec.webcrawler.network.models.*;
import com.isec.webcrawler.services.mappers.LordOfTheRingsApiToInfographicsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebCrawlerService implements IWebCrawlerService {

    private static final Logger logger = LoggerFactory.getLogger(WebCrawlerService.class);

    private final InfographicsApiController infographicsApiController;
    private final LordOfTheRingsApiController lordOfTheRingsApiController;

    @Autowired
    public WebCrawlerService(final InfographicsApiController infographicsApiController,
                             final LordOfTheRingsApiController lordOfTheRingsApiController) {
        this.infographicsApiController = infographicsApiController;
        this.lordOfTheRingsApiController = lordOfTheRingsApiController;
    }

    @Override
    public void getLordOfTheRingsData() {
        logger.info("Getting lord of the rings data");

        try {
            final GetBooksResponse getBooksResponse = lordOfTheRingsApiController.getBooks();
            final GetChaptersResponse getChaptersResponse = lordOfTheRingsApiController.getChapters();
            final GetMoviesResponse getMoviesResponse = lordOfTheRingsApiController.getMovies();
            final GetQuotesResponse getQuotesResponse = lordOfTheRingsApiController.getQuotes();
            final GetCharactersResponse getCharactersResponse = lordOfTheRingsApiController.getCharacters();

            final InfographicRequest infographicRequest =
                    LordOfTheRingsApiToInfographicsMapper.getInfographicRequest(
                            getBooksResponse,
                            getChaptersResponse,
                            getMoviesResponse,
                            getQuotesResponse,
                            getCharactersResponse);

            infographicsApiController.createInfographic(infographicRequest);
        } finally {
            logger.info("Finished send data to infographic!");
        }
    }
}

package com.isec.webcrawler.network;

import com.isec.webcrawler.network.models.*;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import io.netty.resolver.DefaultAddressResolverGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Component
public class LordOfTheRingsApiController {

    private static Logger logger = LoggerFactory.getLogger(LordOfTheRingsApiController.class);
    private static final String BOOKS_ENDPOINT = "/book";
    private static final String CHAPTERS_ENDPOINT = "/chapter";
    private static final String CHARACTERS_ENDPOINT = "/character";
    private static final String QUOTES_ENDPOINT = "/quote";
    private static final String MOVIES_ENDPOINT = "/movie";
    @Value("${webcrawler.lotrapi.url}")
    private String baseUrl;
    @Value("${webcrawler.lotrapi.secret}")
    private String secret;
    @Value("${webcrawler.lotrapi.timeout}")
    private int timeout;

    private final WebClient client;

    public LordOfTheRingsApiController() {
        HttpClient httpClient = HttpClient.create()
                .resolver(DefaultAddressResolverGroup.INSTANCE)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, timeout)
                .responseTimeout(Duration.ofMillis(timeout))
                .doOnConnected(conn ->
                        conn.addHandlerLast(new ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS))
                                .addHandlerLast(new WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS)));

        client = WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();
    }

    public GetBooksResponse getBooks() {
        logger.info("Started to request for all the lord of the rings books!");

        GetBooksResponse result = null;
        try {
            WebClient.ResponseSpec responseSpec = client.get()
                    .uri(baseUrl + BOOKS_ENDPOINT)
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + secret)
                    .retrieve();

            result = responseSpec.bodyToMono(GetBooksResponse.class).block();

            return result;
        } finally {
            logger.info("Finished the request for all lord of the rings books!");
        }
    }

    public GetChaptersResponse getChapters() {
        logger.info("Started to request for all the lord of the rings chapters!");

        GetChaptersResponse result = null;
        try {
            WebClient.ResponseSpec responseSpec = client.get()
                    .uri(baseUrl + CHAPTERS_ENDPOINT)
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + secret)
                    .retrieve();

            result = responseSpec.bodyToMono(GetChaptersResponse.class).block();

            return result;
        } finally {
            logger.info("Finished the request for all lord of the rings chapters!");
        }
    }

    public GetMoviesResponse getMovies() {
        logger.info("Started to request for all the lord of the rings movies!");

        GetMoviesResponse result = null;
        try {
            WebClient.ResponseSpec responseSpec = client.get()
                    .uri(baseUrl + MOVIES_ENDPOINT)
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + secret)
                    .retrieve();

            result = responseSpec.bodyToMono(GetMoviesResponse.class).block();

            return result;
        } finally {
            logger.info("Finished the request for all lord of the rings movies!");
        }
    }

    public GetQuotesResponse getQuotes() {
        logger.info("Started to request for all the lord of the rings quotes!");

        GetQuotesResponse result = null;
        try {
            WebClient.ResponseSpec responseSpec = client.get()
                    .uri(baseUrl + QUOTES_ENDPOINT)
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + secret)
                    .retrieve();

            result = responseSpec.bodyToMono(GetQuotesResponse.class).block();

            return result;
        } finally {
            logger.info("Finished the request for all lord of the rings quotes!");
        }
    }

    public GetCharactersResponse getCharacters() {
        logger.info("Started to request for all the lord of the rings characters!");

        GetCharactersResponse result = null;
        try {
            WebClient.ResponseSpec responseSpec = client.get()
                    .uri(baseUrl + CHARACTERS_ENDPOINT)
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + secret)
                    .retrieve();

            result = responseSpec.bodyToMono(GetCharactersResponse.class).block();

            return result;
        } finally {
            logger.info("Finished the request for all lord of the rings characters!");
        }
    }
}

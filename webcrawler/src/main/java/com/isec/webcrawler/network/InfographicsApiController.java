package com.isec.webcrawler.network;

import com.isec.webcrawler.network.models.InfographicRequest;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import io.netty.resolver.DefaultAddressResolverGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Component
public class InfographicsApiController {

    private static final Logger logger = LoggerFactory.getLogger(InfographicsApiController.class);

    private static final String INFOGRAPHIC_ENDPOINT = "/infographic";

    @Value("${webcrawler.infographics.url}")
    private String baseUrl;
    @Value("${webcrawler.infographics.timeout}")
    private int timeout;

    private final WebClient client;

    public InfographicsApiController() {
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

    public void createInfographic(final InfographicRequest request) {
        logger.info("Started to request to create infographic data!");

        try {
            client.post()
                    .uri(baseUrl + INFOGRAPHIC_ENDPOINT)
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .body(Mono.just(request), InfographicRequest.class)
                    .exchangeToMono(clientResponse -> {
                        if (clientResponse.statusCode().is2xxSuccessful()) {
                            logger.info("Success while creating infographic data! Request {}", request);
                        } else {
                            logger.error("Something went wrong while creating infographic data! Request {}", request);
                        }
                        return Mono.just(clientResponse);
                    });
        } finally {
            logger.info("Finished creating infographic data!");
        }
    }
}

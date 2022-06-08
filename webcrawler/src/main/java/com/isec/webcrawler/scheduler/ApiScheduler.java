package com.isec.webcrawler.scheduler;

import com.isec.webcrawler.services.WebCrawlerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Api Scheduler
 */
@Component
public class ApiScheduler {

    private static final Logger logger = LoggerFactory.getLogger(ApiScheduler.class);

    private final WebCrawlerService webCrawlerService;

    @Autowired
    public ApiScheduler(final WebCrawlerService webCrawlerService) {
        this.webCrawlerService = webCrawlerService;
    }

    /**
     * Call the lord of the rings api and save it in the database, by calling the connect service
     */
    @Scheduled(fixedRateString="${webcrawler.scheduler.interval}")
    public void callApiAndSave() {
        logger.info("Starting to save lord of the rings data in infographics microservice");

        try {
            webCrawlerService.getLordOfTheRingsData();
        } finally {
            logger.info("Finished to save lord of the rings data in infographics microservice");
        }
    }

}

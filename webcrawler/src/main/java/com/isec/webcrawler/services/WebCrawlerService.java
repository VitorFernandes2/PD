package com.isec.webcrawler.services;

import com.isec.webcrawler.network.InfographicsApiController;
import com.isec.webcrawler.network.LordOfTheRingsApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebCrawlerService implements IWebCrawlerService {

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

    }
}

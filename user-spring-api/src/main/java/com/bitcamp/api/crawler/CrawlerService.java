package com.bitcamp.api.crawler;

import java.io.IOException;
import java.util.Map;

public interface CrawlerService {
    Map<String, ?> findNamesFromWeb( Map<String, String> paramMap) throws IOException ;
}

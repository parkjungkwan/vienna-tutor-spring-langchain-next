package com.bitcamp.api.crawler;

import com.bitcamp.api.user.User;
import com.bitcamp.api.user.UserServiceImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CrawlerServiceImpl implements CrawlerService {
    private static CrawlerServiceImpl instance = new CrawlerServiceImpl();
    private CrawlerRepository repository;
    private CrawlerServiceImpl(){
        repository = CrawlerRepository.getInstance();
    }
    public static CrawlerServiceImpl getInstance(){return instance;}
    @Override
    public  Map<String, ?> findNamesFromWeb( Map<String, String> paramMap) throws IOException {
        return repository.save(paramMap);
    }

}

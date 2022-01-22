package ru.myself.web;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ScrapDriver {
	public static void main (String[] args) throws IOException {
		Document doc = Jsoup.connect("https://yandex.ru/")
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://www.google.com")
                .get();
		
		System.out.println(doc);
		
		
	}

}

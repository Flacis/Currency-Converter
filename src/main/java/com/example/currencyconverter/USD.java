package com.example.currencyconverter;

import org.jsoup.Jsoup;

public class USD {

    public double USD(double amount) {
        double USD = 0;
        new Converter();
        try {
            var documentUSDvsRUB = Jsoup.connect("https://www.google.com/search?q=rehc+ljkkfhf&oq=rehc+ljkkfhf&aqs=chrome.0.69i59j0i10i131i433i512l5j0i10i512l3j0i10i131i433i512.3240j1j7&sourceid=chrome&ie=UTF-8").get();
            var USDvsRUB = documentUSDvsRUB.select("#knowledge-currency__updatable-data-column > div.b1hJbf > div.dDoNo.ikb4Bb.gsrt > span.DFlfde.SwHCTb");
            USD = Converter.converter(USDvsRUB);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return USD * amount;
    }
}
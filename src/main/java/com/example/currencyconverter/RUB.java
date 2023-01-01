package com.example.currencyconverter;

import org.jsoup.Jsoup;

public class RUB {

    public double RUB(double amount) {
        double RUB = 0;
        new Converter();
        try {
            var documentRUBvsUSD = Jsoup.connect("https://www.google.com/search?q=%D0%BA%D1%83%D1%80%D1%81+he%2Ckz&sxsrf=ALiCzsapYXFehP8_jfAEH2Eyi6ZdEQ3SoQ%3A1671982168577&ei=WGyoY_b2IoSfrwSSla2gAQ&ved=0ahUKEwj2gur5ipX8AhWEz4sKHZJKCxQQ4dUDCA8&uact=5&oq=%D0%BA%D1%83%D1%80%D1%81+he%2Ckz&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIUCAAQgAQQsQMQgwEQChAqEEYQggIyDQgAEIAEELEDEIMBEAoyDQgAEIAEELEDEIMBEAoyBwgAEIAEEAoyCggAEIAEELEDEAoyBwgAEIAEEAoyCggAEIAEELEDEAoyCggAEIAEELEDEAoyCggAEIAEELEDEAoyBwgAEIAEEAo6CggAEEcQ1gQQsAM6DQgAEEcQ1gQQyQMQsAM6CAgAEJIDELADOgcIABCwAxBDOgoIABCABBCHAhAUOgUIABCABDoJCAAQgAQQChAqSgQIQRgASgQIRhgAUMsEWLIIYMAJaAFwAXgAgAFziAHBA5IBAzQuMZgBAKABAcgBCsABAQ&sclient=gws-wiz-serp").get();
            var RUBvsUSD = documentRUBvsUSD.select("#knowledge-currency__updatable-data-column > div.b1hJbf > div.dDoNo.ikb4Bb.gsrt > span.DFlfde.SwHCTb");
            RUB = Converter.converter(RUBvsUSD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RUB * amount;
    }
}

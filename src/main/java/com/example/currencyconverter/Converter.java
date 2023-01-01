package com.example.currencyconverter;

import org.jsoup.select.Elements;

public class Converter {
    public static double converter(Elements n) {
        String N = n.text();
        String nNew = N.replace(",", ".");
        double nFinal = Double.parseDouble(nNew);
        return nFinal;
    }
}

package com.tallgeorge.dwml;

public class Main {

    private static Weather weather;

    public static void main(String[] args) {
        // forecast for 43085
        String url = "https://forecast.weather.gov/MapClick.php?lat=40.1008&lon=-83.0271&unit=0&lg=english&FcstType=dwml";
        weather = new Weather(url);
        System.out.println(weather.toString());
    }
}


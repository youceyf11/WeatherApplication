package com.example.WeatherApp.Entity;

import com.sun.tools.javac.Main;
import lombok.Data;

import java.util.List;


@Data
public class WeatherData {
        private String name;
        private Main main;
        private List<Weather> weathers;


    @Data
    public static class Main {
        private double temp;
        private double feels_like;
        private int humidity;
    }

    @Data
    public static class Weather {
        private String description;
        private String icon;
    }

}

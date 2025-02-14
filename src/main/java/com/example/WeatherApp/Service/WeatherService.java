package com.example.WeatherApp.Service;

import com.example.WeatherApp.Entity.WeatherConfig;
import com.example.WeatherApp.Entity.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private WeatherConfig weatherConfig;

    @Autowired
    private RestTemplate restTemplate;

    public WeatherData getWeather(String city){
        String url= String.format("%s?q=%s&appid=%s&units=metric", weatherConfig.getApiUrl(), city, weatherConfig.getApiKey());
        return restTemplate.getForObject(url, WeatherData.class);
    }

}

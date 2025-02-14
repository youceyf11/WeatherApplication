package com.example.WeatherApp.Controller;

import com.example.WeatherApp.Entity.WeatherData;
import com.example.WeatherApp.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public ResponseEntity<WeatherData> getWeather(@PathVariable String city){
        WeatherData weatherData=weatherService.getWeather(city);
        return ResponseEntity.ok(weatherData);
    }

}

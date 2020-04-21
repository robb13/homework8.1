package pl.bykowski.homework81.homework81.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.bykowski.homework81.homework81.model.Temp;
import pl.bykowski.homework81.homework81.model.WeatherInfo;

@Service
public class WeatherService {



    public WeatherInfo getWeather() {
        Temp temp = new Temp();
        RestTemplate restTemplate = new RestTemplate();
        WeatherInfo wheaterData = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q="
                        + temp.getCity() + "&units=metric&appid=96af5c9be1cc96d7c2236fdc39ee2777&lang=pl",
                WeatherInfo.class);
        return wheaterData;
    }

    public void printInfo() {
        System.out.println(getWeather());
    }

}

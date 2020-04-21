package pl.bykowski.homework81.homework81;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pl.bykowski.homework81.homework81.model.Temp;
import pl.bykowski.homework81.homework81.repository.WeatherRepo;
import pl.bykowski.homework81.homework81.service.WeatherService;

@EnableAsync
@Component
public class Runner {

    private WeatherRepo weatherRepo;
    private WeatherService weatherService;


    @Autowired
    public Runner(WeatherRepo weatherRepo, WeatherService weatherService) {
        this.weatherRepo = weatherRepo;
        this.weatherService = weatherService;
    }

    @Scheduled(fixedDelay = 10000 )  //3600000 - 1 hour
    public void init() {
        Temp temp = new Temp();
        Double actualTemp = weatherService.getWeather().getMain().getTemp();
        weatherRepo.save(new Temp(actualTemp, temp.getCity()));
        weatherService.printInfo();
    }
}

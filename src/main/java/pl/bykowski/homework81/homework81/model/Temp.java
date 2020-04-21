package pl.bykowski.homework81.homework81.model;


import javax.persistence.*;

@Entity
@Table(name = "weathers")
public class Temp {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weather_id")
    private Long weatherId;
    @Column(name = "current_temp")
    private Double currentTemp;
    private String city ="Katowice";

    public Temp() {
    }

    public Temp(Double currentTemp, String city) {
        this.currentTemp = currentTemp;
        this.city = city;
    }

    public Long getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Long weatherId) {
        this.weatherId = weatherId;
    }

    public Double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

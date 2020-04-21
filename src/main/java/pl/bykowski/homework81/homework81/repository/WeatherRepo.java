package pl.bykowski.homework81.homework81.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.homework81.homework81.model.Temp;

@Repository
public interface WeatherRepo extends JpaRepository<Temp, Long> {


}

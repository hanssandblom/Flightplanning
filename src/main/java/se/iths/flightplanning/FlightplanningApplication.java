package se.iths.flightplanning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.repository.AirplaneRepository;

@SpringBootApplication
public class FlightplanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightplanningApplication.class, args);
	}

	@Bean
	public CommandLineRunner setUpAirplaneModel(AirplaneRepository airplaneRepository) {
		return (args) -> {
			airplaneRepository.save(new AirplaneEntity("Modell101",1000, 10));
		};
	}

}

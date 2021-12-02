package se.iths.flightplanning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.entity.RouteEntity;
import se.iths.flightplanning.repository.AirplaneRepository;
import se.iths.flightplanning.repository.RouteRepository;

@SpringBootApplication
public class FlightplanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightplanningApplication.class, args);
	}

	@Bean
	public CommandLineRunner setUpRouteName(RouteRepository routeRepository) {
		return (args) -> {
			routeRepository.save(new RouteEntity("Gbg-Sthlm"));
		};
	}

	@Bean
	public CommandLineRunner setUpAirplaneName(AirplaneRepository airplaneRepository) {
		return (args) -> {
			airplaneRepository.save(new AirplaneEntity("Model101", 100, 10));
		};
	}

}

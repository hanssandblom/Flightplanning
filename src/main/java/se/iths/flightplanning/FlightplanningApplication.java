package se.iths.flightplanning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.iths.flightplanning.entity.RouteEntity;
import se.iths.flightplanning.repository.RouteRepository;

@SpringBootApplication
public class FlightplanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightplanningApplication.class, args);
	}

	@Bean
	public CommandLineRunner setUpRouteName(RouteRepository airplaneRepository) {
		return (args) -> {
			airplaneRepository.save(new RouteEntity("Gbg-Sthlm"));
		};
	}

}

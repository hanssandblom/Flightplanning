package se.iths.flightplanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.entity.RouteEntity;
import se.iths.flightplanning.entity.UserEntity;
import se.iths.flightplanning.repository.AirplaneRepository;
import se.iths.flightplanning.repository.RouteRepository;
import se.iths.flightplanning.repository.UserRepository;
import se.iths.flightplanning.repository.WorkerRepository;

import java.util.Arrays;

@SpringBootApplication
public class FlightplanningApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FlightplanningApplication.class, args);
	}

	@Autowired
	AirplaneRepository airplaneRepository;
	@Autowired
	RouteRepository routeRepository;
	@Autowired
	UserRepository userRepository;


	@Override
	public void run(String... args) throws Exception {

		UserEntity user = new UserEntity("Hans", "Sandblom", "sdgdfsg@dhdh.se", "089674545", "username", "password");
		RouteEntity rutt1 = new RouteEntity("Gbg-Sthlm");
		AirplaneEntity air1 = new AirplaneEntity("Model-101", 100, 10);

		rutt1.getAirplaneNames().add(air1);
		user.getRouteNames().add(rutt1);

		userRepository.save(user);
	}
}

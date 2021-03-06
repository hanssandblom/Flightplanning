package se.iths.flightplanning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import se.iths.flightplanning.entity.*;
import se.iths.flightplanning.repository.*;

@SpringBootApplication
public class FlightplanningApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FlightplanningApplication.class, args);

		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		UserEntity user = new UserEntity("Sven", "Gurka", "sven@gurka.se", "0315756856", "username", "password");

		jmsTemplate.convertAndSend("user", user);
	}

	AirplaneRepository airplaneRepository;
	RouteRepository routeRepository;
	UserRepository userRepository;
	WorkerRepository workerRepository;
	FoodRepository foodRepository;

	public FlightplanningApplication(AirplaneRepository airplaneRepository, RouteRepository routeRepository, UserRepository userRepository, WorkerRepository workerRepository, FoodRepository foodRepository) {
		this.airplaneRepository = airplaneRepository;
		this.routeRepository = routeRepository;
		this.userRepository = userRepository;
		this.workerRepository = workerRepository;
		this.foodRepository = foodRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		UserEntity user = new UserEntity("Hans", "Sandblom", "sdgdfsg@dhdh.se", "089674545", "username", "password");
		RouteEntity rutt1 = new RouteEntity("Gbg-Sthlm");
		AirplaneEntity air1 = new AirplaneEntity("Model-101", 100, 10);
		WorkerEntity worker = new WorkerEntity(2,8);
		FoodEntity food= new FoodEntity("Ja");
		CancellationProtectionEntity cancel = new CancellationProtectionEntity("Ja");

		rutt1.setCancel(cancel);
		rutt1.setFood(food);
		air1.getStaff().add(worker);
		rutt1.getAirplaneNames().add(air1);
		user.getRouteNames().add(rutt1);

		userRepository.save(user);

	}

}

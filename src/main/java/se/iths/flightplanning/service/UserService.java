package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.entity.RouteEntity;
import se.iths.flightplanning.entity.UserEntity;
import se.iths.flightplanning.repository.AirplaneRepository;
import se.iths.flightplanning.repository.RouteRepository;
import se.iths.flightplanning.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RouteRepository routeRepository;
    private final AirplaneRepository airplaneRepository;

    public UserService(UserRepository userRepository, RouteRepository routeRepository, AirplaneRepository airplaneRepository) {
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
        this.airplaneRepository = airplaneRepository;
    }

    public UserEntity createUser(UserEntity userEntity) {
        RouteEntity routeToAdd = routeRepository.findByRouteName("Gbg-Sthlm");
        userEntity.addRoute(routeToAdd);
        AirplaneEntity airplaneToAdd = airplaneRepository.findByAirplaneName("Model101");
        userEntity.addAirplane(airplaneToAdd);
        userRepository.save(userEntity);
        return userEntity;
    }
    public Iterable<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

}

package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.RouteEntity;
import se.iths.flightplanning.entity.UserEntity;
import se.iths.flightplanning.repository.RouteRepository;
import se.iths.flightplanning.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RouteRepository routeRepository;

    public UserService(UserRepository userRepository, RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity) {
        RouteEntity routeToAdd = routeRepository.findByRouteName("Gbg-Sthlm");
        userEntity.addRoute(routeToAdd);
        return userRepository.save(userEntity);
    }
    public Iterable<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

}

package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.entity.UserEntity;
import se.iths.flightplanning.repository.AirplaneRepository;
import se.iths.flightplanning.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AirplaneRepository airplaneRepository;

    public UserService(UserRepository userRepository, AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity) {
        AirplaneEntity airplaneToAdd = airplaneRepository.findByAirplaneModel("Modell101");
        userEntity.addAirplane(airplaneToAdd);
        return userRepository.save(userEntity);
    }
    public Iterable<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

}

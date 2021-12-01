package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.repository.AirplaneRepository;

@Service
public class AirplaneService {

    private final AirplaneRepository airplaneRepository;

    public AirplaneService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    public AirplaneEntity createAirplane(AirplaneEntity airplaneEntity){
        return airplaneRepository.save(airplaneEntity);
    }

    public Iterable<AirplaneEntity> findAllAirplanes() {
        return airplaneRepository.findAll();
    }

}

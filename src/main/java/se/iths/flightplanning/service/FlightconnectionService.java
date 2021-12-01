package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.FlightconnectionEntity;
import se.iths.flightplanning.repository.FlightconnectionRepository;

@Service
public class FlightconnectionService {

    private final FlightconnectionRepository flightconnectionRepository;

    public FlightconnectionService(FlightconnectionRepository flightconnectionRepository) {
        this.flightconnectionRepository = flightconnectionRepository;
    }

    public FlightconnectionEntity createRoute(FlightconnectionEntity flightconnectionEntity) {
        return flightconnectionRepository.save(flightconnectionEntity);
    }

    public Iterable<FlightconnectionEntity> findAllRoutes() {
        return flightconnectionRepository.findAll();
    }

}

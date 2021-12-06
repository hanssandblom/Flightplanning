package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.entity.RouteEntity;
import se.iths.flightplanning.repository.AirplaneRepository;
import se.iths.flightplanning.repository.RouteRepository;

@Service
public class RouteService {

    private final RouteRepository routeRepository;
    private final AirplaneRepository airplaneRepository;

    public RouteService(RouteRepository routeRepository, AirplaneRepository airplaneRepository) {
        this.routeRepository = routeRepository;
        this.airplaneRepository = airplaneRepository;
    }

    public RouteEntity createRoute(RouteEntity routeEntity){
        AirplaneEntity airplaneToAdd = airplaneRepository.findByAirplaneName("Model101");
        routeEntity.addAirplane(airplaneToAdd);
//        routeRepository.save(routeEntity);
        return routeRepository.save(routeEntity);
    }

    public Iterable<RouteEntity> findAllRoutes() {
        return routeRepository.findAll();
    }

}

package se.iths.flightplanning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.flightplanning.entity.FlightconnectionEntity;
import se.iths.flightplanning.service.FlightconnectionService;

@RestController
@RequestMapping("flightconnction")
public class FlightconnectionController {

    private final FlightconnectionService flightconnectionService;

    public FlightconnectionController(FlightconnectionService flightconnectionService) {
        this.flightconnectionService = flightconnectionService;
    }

    @PostMapping()
    public ResponseEntity<FlightconnectionEntity> createRoute(@RequestBody FlightconnectionEntity flightconnectionEntity) {
        FlightconnectionEntity createdRoute = flightconnectionService.createRoute(flightconnectionEntity);
        return new ResponseEntity<>(createdRoute, HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<Iterable<FlightconnectionEntity>> findAllRoutes() {
        Iterable<FlightconnectionEntity> allRoutes = flightconnectionService.findAllRoutes();
        return new ResponseEntity<>(allRoutes, HttpStatus.OK);
    }
}

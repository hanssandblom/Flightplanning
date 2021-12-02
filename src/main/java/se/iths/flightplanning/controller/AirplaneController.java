package se.iths.flightplanning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.flightplanning.entity.AirplaneEntity;
import se.iths.flightplanning.service.AirplaneService;

@RestController
@RequestMapping("airplanes")
public class AirplaneController {

    private final AirplaneService airplaneService;

    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @PostMapping()
    public ResponseEntity<AirplaneEntity> createPlane(@RequestBody AirplaneEntity airplaneEntity) {
        AirplaneEntity createdPlane = airplaneService.createPlane(airplaneEntity);
        return new ResponseEntity<>(createdPlane, HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<Iterable<AirplaneEntity>> findAllPlanes() {
        Iterable<AirplaneEntity> allPlanes = airplaneService.findAllPlanes();
        return new ResponseEntity<>(allPlanes, HttpStatus.OK);
    }
}

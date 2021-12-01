//package se.iths.flightplanning.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import se.iths.flightplanning.entity.AirplaneEntity;
//import se.iths.flightplanning.service.AirplaneService;
//
//@RestController
//@RequestMapping("airplaneModels")
//public class AirplaneController {
//
//    private final AirplaneService airplaneService;
//
//    public AirplaneController(AirplaneService airplaneService) {
//        this.airplaneService = airplaneService;
//    }
//
//    @PostMapping()
//    public ResponseEntity<AirplaneEntity> createAirplane(@RequestBody AirplaneEntity airplaneEntity) {
//        AirplaneEntity createdAirplane = airplaneService.createAirplane(airplaneEntity);
//        return new ResponseEntity<>(createdAirplane, HttpStatus.CREATED);
//    }
//
//    @GetMapping()
//    public ResponseEntity<Iterable<AirplaneEntity>> findAllAirplanes() {
//        Iterable<AirplaneEntity> allAirplanes = airplaneService.findAllAirplanes();
//        return new ResponseEntity<>(allAirplanes, HttpStatus.OK);
//    }
//}

package se.iths.flightplanning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.flightplanning.entity.FoodEntity;
import se.iths.flightplanning.service.FoodService;

@RestController
@RequestMapping("food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping
    public ResponseEntity<FoodEntity> createFood(@RequestBody FoodEntity foodEntity) {
        FoodEntity createdFood = foodService.createFood(foodEntity);
        return new ResponseEntity<>(createdFood, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<FoodEntity>> findAllFood() {
        Iterable<FoodEntity> allFood = foodService.findAllFood();
        return new ResponseEntity<>(allFood, HttpStatus.OK);
    }

}

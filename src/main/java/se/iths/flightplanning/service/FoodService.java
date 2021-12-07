package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.FoodEntity;
import se.iths.flightplanning.repository.FoodRepository;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public FoodEntity createFood(FoodEntity foodEntity) {
        return foodRepository.save(foodEntity);
    }

    public Iterable<FoodEntity> findAllFood() {
        return foodRepository.findAll();
    }
}

package se.iths.flightplanning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.iths.flightplanning.entity.AirplaneEntity;

@Repository
public interface AirplaneRepository extends CrudRepository<AirplaneEntity, Long > {
    AirplaneEntity findByAirplaneName(String airplaneName);
}

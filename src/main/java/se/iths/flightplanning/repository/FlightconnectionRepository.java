package se.iths.flightplanning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.iths.flightplanning.entity.FlightconnectionEntity;

@Repository
public interface FlightconnectionRepository extends CrudRepository<FlightconnectionEntity, Long > {
}

package se.iths.flightplanning.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AirplaneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String airplaneModel;
    private int numberOfSeat;
    private int numberOfStaff;

    @ManyToMany(mappedBy = "routes")
    private Set<FlightconnectionsEntity> flightconnectionsEntities = new HashSet<>();

    public AirplaneEntity(String airplaneModel, int numberOfSeat, int numberOfStaff) {
        this.airplaneModel = airplaneModel;
        this.numberOfSeat = numberOfSeat;
        this.numberOfStaff = numberOfStaff;
    }

    public AirplaneEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel(String airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public Set<FlightconnectionsEntity> getFlightconnectionsEntities() {
        return flightconnectionsEntities;
    }

    public void setFlightconnectionsEntities(Set<FlightconnectionsEntity> flightconnectionsEntities) {
        this.flightconnectionsEntities = flightconnectionsEntities;
    }
}

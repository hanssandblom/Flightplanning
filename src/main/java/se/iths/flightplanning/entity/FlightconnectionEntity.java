package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FlightconnectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String airplaneModel;
    private int numberOfSeat;
    private int numberOfStaff;
    @ManyToOne
    private RouteEntity route;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "routes_id")
    private RouteEntity routes;

    public RouteEntity getRoutes() {
        return routes;
    }

    public void setRoutes(RouteEntity routes) {
        this.routes = routes;
    }

    public FlightconnectionEntity(String airplaneModel, int numberOfSeat, int numberOfStaff) {
        this.airplaneModel = airplaneModel;
        this.numberOfSeat = numberOfSeat;
        this.numberOfStaff = numberOfStaff;
    }

    public FlightconnectionEntity() {
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

    public RouteEntity getRoute() {
        return route;
    }

    public void setRoute(RouteEntity route) {
        this.route = route;
    }
}

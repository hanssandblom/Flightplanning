package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AirplaneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String airplaneName;
    private int numberOfSeat;
    private int numberOfStaff;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "routes_id")
    private RouteEntity routes;

    @ManyToMany(mappedBy = "airplaneNames")
    private Set<UserEntity> users;

    public AirplaneEntity(String airplaneName, int numberOfSeat, int numberOfStaff) {
        this.airplaneName = airplaneName;
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

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
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

    @JsonIgnore
    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

    @JsonIgnore
    public RouteEntity getRoutes() {
        return routes;
    }

    public void setRoutes(RouteEntity routes) {
        this.routes = routes;
    }

}

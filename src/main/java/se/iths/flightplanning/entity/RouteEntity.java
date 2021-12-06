package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class RouteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String routeName;

    @OneToMany(mappedBy = "routes", cascade = CascadeType.ALL)
    private Set<AirplaneEntity> routes;

    @ManyToMany(mappedBy = "routeNames", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserEntity> users;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AirplaneEntity> airplaneNames = new HashSet<>();

    public void addAirplane(AirplaneEntity airplaneName) {
        airplaneNames.add(airplaneName);
        airplaneName.getPlaneNames().add(this);
    }

    public RouteEntity(String routeName) {
        this.routeName = routeName;
    }

    public RouteEntity() {
    }


    public Set<AirplaneEntity> getAirplaneNames() {
        return airplaneNames;
    }

    public void setAirplaneNames(Set<AirplaneEntity> airplaneNames) {
        this.airplaneNames = airplaneNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @JsonIgnore
    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

    public Set<AirplaneEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<AirplaneEntity> routes) {
        this.routes = routes;
    }
}

package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class RouteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String routeName;

    @OneToMany(mappedBy = "routes", cascade = CascadeType.ALL)
    private List<FlightconnectionEntity> routes = new ArrayList<>();

    @ManyToMany(mappedBy = "routeNames")
    private Set<UserEntity> users;



    public void addRoute(FlightconnectionEntity route){
        routes.add(route);
        route.setRoute(this);
    }

    public RouteEntity(String routeName) {
        this.routeName = routeName;
    }

    public RouteEntity() {
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
}

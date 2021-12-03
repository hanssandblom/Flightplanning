package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class RouteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String routeName;

    @OneToMany(mappedBy = "routes", cascade = CascadeType.ALL)
    private Set<AirplaneEntity> routes;
    //private List<AirplaneEntity> routes = new ArrayList<>();

    @ManyToMany(mappedBy = "routeNames")
    private Set<UserEntity> users;

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

    public Set<AirplaneEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<AirplaneEntity> routes) {
        this.routes = routes;
    }
    //@JsonIgnore
    //public List<AirplaneEntity> getRoutes() {
        //return routes;
    //}

    //public void setRoutes(List<AirplaneEntity> routes) {
        //this.routes = routes;
    //}
}

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


    @ManyToMany(mappedBy = "routeNames", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserEntity> users;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AirplaneEntity> airplaneNames = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private FoodEntity foods;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CancellationProtectionEntity cancel;


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

    public CancellationProtectionEntity getCancel() {
        return cancel;
    }

    public void setCancel(CancellationProtectionEntity cancel) {
        this.cancel = cancel;
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

    public FoodEntity getFood() {
        return foods;
    }

    public void setFood(FoodEntity foods) {
        this.foods = foods;
    }
}

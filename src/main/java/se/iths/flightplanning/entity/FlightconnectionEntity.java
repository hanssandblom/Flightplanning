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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AirplaneEntity> routes = new HashSet<>();
    @ManyToOne
    private UserEntity user;

    public FlightconnectionEntity(Set<AirplaneEntity> routes) {
        this.routes = routes;
    }

    public FlightconnectionEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public Set<AirplaneEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<AirplaneEntity> routes) {
        this.routes = routes;
    }
}

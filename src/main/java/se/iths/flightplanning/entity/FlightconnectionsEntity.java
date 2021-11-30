package se.iths.flightplanning.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FlightconnectionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AirplaneEntity> routes = new HashSet<>();

    public FlightconnectionsEntity(Set<AirplaneEntity> routes) {
        this.routes = routes;
    }

    public FlightconnectionsEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AirplaneEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<AirplaneEntity> routes) {
        this.routes = routes;
    }
}

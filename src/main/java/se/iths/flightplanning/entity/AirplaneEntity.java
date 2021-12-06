package se.iths.flightplanning.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AirplaneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String airplaneName;
//    private int numberOfSeat;
//    private int numberOfStaff;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition="integer", name = "routes_id")
    private RouteEntity routes;

//    @ManyToMany(mappedBy = "airplaneNames")
//    private Set<UserEntity> users;

    @ManyToMany(mappedBy = "airplaneNames")
    private Set<RouteEntity> planeNames;

    @OneToMany(mappedBy = "airplane", cascade = CascadeType.ALL)
    private Set<WorkerEntity> staff;

    public AirplaneEntity(String airplaneName) {
        this.airplaneName = airplaneName;
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

//    public int getNumberOfSeat() {
//        return numberOfSeat;
//    }
//
//    public void setNumberOfSeat(int numberOfSeat) {
//        this.numberOfSeat = numberOfSeat;
//    }
//
//    public int getNumberOfStaff() {
//        return numberOfStaff;
//    }
//
//    public void setNumberOfStaff(int numberOfStaff) {
//        this.numberOfStaff = numberOfStaff;
//    }

    public RouteEntity getRoutes() {
        return routes;
    }

    public void setRoutes(RouteEntity routes) {
        this.routes = routes;
    }

    public Set<RouteEntity> getPlaneNames() {
        return planeNames;
    }

    public void setPlaneNames(Set<RouteEntity> airplaneNames) {
        this.planeNames = airplaneNames;
    }

    public Set<WorkerEntity> getStaff() {
        return staff;
    }

    public void setStaff(Set<WorkerEntity> staff) {
        this.staff = staff;
    }
}

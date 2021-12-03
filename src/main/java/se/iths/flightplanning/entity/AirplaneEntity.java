package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
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
    @JoinColumn(columnDefinition="integer", name = "routes_id")
    private RouteEntity routes;

    @ManyToMany(mappedBy = "airplaneNames")
    private Set<UserEntity> users;

    @OneToMany(mappedBy = "airplane", cascade = CascadeType.ALL)
    //private List<WorkerEntity> staff = new ArrayList<>();
    private Set<WorkerEntity> staff;

    public AirplaneEntity(String airplaneName, int numberOfSeat) {
        this.airplaneName = airplaneName;
        this.numberOfSeat = numberOfSeat;
    }

    public AirplaneEntity() {
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public Set<WorkerEntity> getStaff() {
        return staff;
    }

    public void setStaff(Set<WorkerEntity> staff) {
        this.staff = staff;
    }
//    public List<WorkerEntity> getStaff() {
//        return staff;
//    }
//
//    public void setStaff(List<WorkerEntity> staff) {
//        this.staff = staff;
//    }

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

    @JsonIgnore
    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

    //@JsonIgnore
    public RouteEntity getRoutes() {
        return routes;
    }

    public void setRoutes(RouteEntity routes) {
        this.routes = routes;
    }

}

package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FlightconnectionEntity> routes = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AirplaneEntity> airplaneModels = new HashSet<>();

    public void addAirplane(AirplaneEntity airplaneModel) {
        airplaneModels.add(airplaneModel);
        airplaneModel.getUsers().add(this);
    }

    public void addRoute(FlightconnectionEntity route){
        routes.add(route);
        route.setUser(this);
    }

    public UserEntity(String firstName, String lastName, String email, String telephone, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.username = username;
        this.password = password;
    }

    public UserEntity() {
    }

    public Set<AirplaneEntity> getAirplaneModels() {
        return airplaneModels;
    }

    public void setAirplaneModels(Set<AirplaneEntity> airplaneModels) {
        this.airplaneModels = airplaneModels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FlightconnectionEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(List<FlightconnectionEntity> routes) {
        this.routes = routes;
    }

}

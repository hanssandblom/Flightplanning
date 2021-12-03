package se.iths.flightplanning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int pilot;
    private int flightAttendant;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition="integer", name = "airplane_id")
    private AirplaneEntity airplane;

    public WorkerEntity(int pilot, int flightAttendant, AirplaneEntity airplane) {
        this.pilot = pilot;
        this.flightAttendant = flightAttendant;
        this.airplane = airplane;
    }

    public WorkerEntity() {
    }

    //@JsonIgnore
    public AirplaneEntity getAirplane() {
        return airplane;
    }

    public void setAirplane(AirplaneEntity airplane) {
        this.airplane = airplane;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPilot() {
        return pilot;
    }

    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    public int getFlightAttendant() {
        return flightAttendant;
    }

    public void setFlightAttendant(int flightAttendant) {
        this.flightAttendant = flightAttendant;
    }
}

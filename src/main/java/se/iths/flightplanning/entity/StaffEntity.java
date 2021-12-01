//package se.iths.flightplanning.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class StaffEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private int pilot;
//    private int flightAttendant;
//
//    public StaffEntity(int pilot, int flightAttendant) {
//        this.pilot = pilot;
//        this.flightAttendant = flightAttendant;
//    }
//
//    public StaffEntity() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getPilot() {
//        return pilot;
//    }
//
//    public void setPilot(int pilot) {
//        this.pilot = pilot;
//    }
//
//    public int getFlightAttendant() {
//        return flightAttendant;
//    }
//
//    public void setFlightAttendant(int flightAttendant) {
//        this.flightAttendant = flightAttendant;
//    }
//}

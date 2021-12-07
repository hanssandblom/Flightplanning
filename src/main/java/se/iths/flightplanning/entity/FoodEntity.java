package se.iths.flightplanning.entity;

import javax.persistence.*;

@Entity
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean food;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private RouteEntity foodRoute;


    public FoodEntity(Boolean food) {
        this.food = food;
    }

    public FoodEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getFood() {
        return food;
    }

    public void setFood(Boolean food) {
        this.food = food;
    }

    public RouteEntity getFoodRoute() {
        return foodRoute;
    }

    public void setFoodRoute(RouteEntity foodRoute) {
        this.foodRoute = foodRoute;
    }


}

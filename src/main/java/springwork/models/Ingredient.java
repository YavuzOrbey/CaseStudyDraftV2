package springwork.models;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
@Entity
@Table(name="ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="serving_size")
    private int servingSize;

    @Column(name="calories")
    private int calories;

    @Column(name="name")
    private String name;

    @Column(name = "created_on")
    private Timestamp created_on;

    @Column(name = "updated_on")
    private Timestamp updated_on;

    @ManyToMany(mappedBy = "ingredients")
    private Set<Measurement> servingSize_Measurements;
    @ManyToMany(mappedBy = "ingredients")
    private Set<Nutrient> nutrients;


    public Ingredient() {
        this.created_on = new Timestamp(System.currentTimeMillis());
        this.updated_on = new Timestamp(System.currentTimeMillis());
    }

    public Ingredient(int servingSize, int calories) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.created_on = new Timestamp(System.currentTimeMillis());
        this.updated_on = new Timestamp(System.currentTimeMillis());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Timestamp getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }
}

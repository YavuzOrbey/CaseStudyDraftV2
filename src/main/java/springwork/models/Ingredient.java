package springwork.models;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
@Entity
@Table(name="ingredient")
public class Ingredient extends BaseModel{
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

    @ManyToMany(mappedBy = "ingredients")
    private Set<Measurement> servingSize_Measurements;
    @ManyToMany(mappedBy = "ingredients")
    private Set<Nutrient> nutrients;


    public Ingredient() {
    	super();
    }

    public Ingredient(int servingSize, int calories) {
    	super();
        this.servingSize = servingSize;
        this.calories = calories;
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

}

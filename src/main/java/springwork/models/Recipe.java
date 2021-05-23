package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="recipe")
public class Recipe extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "recipe")
    Set<Meal> meal;

/*  @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name="recipe_id"),
            inverseJoinColumns = @JoinColumn(name="step_id")
    )
    private Set<StepEntity> stepEntity;*/

    public Recipe(String name) {
    	super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Meal> getMealEntity() {
        return meal;
    }

    public void setMealEntity(Set<Meal> meal) {
        this.meal = meal;
    }

}

package springwork.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="date")
    private Date date;

    @Column(name = "created_on")
    private Timestamp created_on;

    @Column(name = "updated_on")
    private Timestamp updated_on;

    @ManyToMany(mappedBy = "meal")
    private Set<MealType> mealType;

    @ManyToMany
    @JoinTable(name = "meal_recipe",
            joinColumns = @JoinColumn(name="meal_id"),
            inverseJoinColumns = @JoinColumn(name="recipe_id")
    )
    private Set<Recipe> recipe;



}

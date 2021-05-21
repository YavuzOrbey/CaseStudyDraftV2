package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;
@Entity
@Table(name="mealType")
public class MealType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "created_on")
    private Timestamp created_on;

    @Column(name = "updated_on")
    private Timestamp updated_on;

    @ManyToMany
    @JoinTable(name = "mealType_meal",
            joinColumns = @JoinColumn(name="mealType_id"),
            inverseJoinColumns = @JoinColumn(name="meal_id")
    )
    Set<Meal> meal;

}

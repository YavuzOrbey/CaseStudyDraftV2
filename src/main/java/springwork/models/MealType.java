package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;
@Entity
@Table(name="mealType")
public class MealType extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToMany
    @JoinTable(name = "mealType_meal",
            joinColumns = @JoinColumn(name="mealType_id"),
            inverseJoinColumns = @JoinColumn(name="meal_id")
    )
    Set<Meal> meal;

}

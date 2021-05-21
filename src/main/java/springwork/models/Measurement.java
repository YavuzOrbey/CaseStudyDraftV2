package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="measurement")
public class Measurement {
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
    @JoinTable(
            joinColumns = @JoinColumn(name="measurement_id"),
            inverseJoinColumns = @JoinColumn(name="ingredient_id")
    )
    private Set<Ingredient> ingredients;

    @ManyToMany
    @JoinTable(name="nutrient_measurement",
            joinColumns = @JoinColumn(name="measurement_id"),
            inverseJoinColumns = @JoinColumn(name="nutrient_id")
    )
    private Set<Nutrient> nutrients;

}

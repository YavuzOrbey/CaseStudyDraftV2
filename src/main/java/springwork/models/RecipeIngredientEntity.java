package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="recipe_ingredient")
public class RecipeIngredientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "created_on")
    private Timestamp created_on;

    @Column(name = "updated_on")
    private Timestamp updated_on;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    Recipe recipe;
    @ManyToOne
    Ingredient ingredient;

    @ManyToOne
    Measurement measurement;

}

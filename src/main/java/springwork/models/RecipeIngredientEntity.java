package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="recipe_ingredient")
public class RecipeIngredientEntity extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    Recipe recipe;
    @ManyToOne
    Ingredient ingredient;

    @ManyToOne
    Measurement measurement;

}

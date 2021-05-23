package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="step")
public class Step extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="text")
    private String text;

    @Column(name="stepOrder")
    private int stepOrder;
    
    @ManyToOne
    private Recipe recipe;
  /*  @ManyToMany(mappedBy = "stepEntity")
    Set<RecipeEntity> recipeEntity;
*/

    public Step(String text, int stepOrder) {
    	super();
        this.text = text;
        this.stepOrder = stepOrder;
    }

    @Override
    public String toString() {
        return "StepEntity{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", stepOrder=" + stepOrder +
                ", recipeEntity=" + recipe +
                '}';
    }
}

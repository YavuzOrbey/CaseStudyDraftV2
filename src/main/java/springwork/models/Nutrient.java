package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="nutrient")
public class Nutrient extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name", nullable=false)
    private String name;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name="nutrient_id"),
            inverseJoinColumns = @JoinColumn(name="ingredient_id")
    )
    private Set<Ingredient> ingredients;
    @ManyToMany(mappedBy = "nutrients")
    private Set<Measurement> measurements;
    
    
	public Nutrient() {
		super();
	}


	public Nutrient(String name) {
		super();
		this.name = name;
	}

    

}

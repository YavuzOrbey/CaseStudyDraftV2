package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="pantry")
public class Pantry extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name", nullable=false)
    private String name;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName="id", nullable=false)
    private User user;
    
    public Pantry(String name) {
    	this.name = name;
    }

}

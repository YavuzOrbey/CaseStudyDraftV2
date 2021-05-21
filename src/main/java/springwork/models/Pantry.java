package springwork.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="pantry")
public class Pantry {
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
            joinColumns = @JoinColumn(name="pantry_id"),
            inverseJoinColumns = @JoinColumn(name="user_id")
    )
    private Set<User> users;

}

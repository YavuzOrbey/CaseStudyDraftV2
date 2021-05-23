package springwork.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
/*
 * 
 * This will be the base class that all my other entities are derived from
 * because all of the entities should have created_on and updated_on fields/getters/setters
 */
@MappedSuperclass
public abstract class BaseModel {
	
	
    @Column(name = "created_on")
    private Timestamp created_on;

    @Column(name = "updated_on")
    private Timestamp updated_on;
    
    
    public BaseModel() {
    	 this.created_on = new Timestamp(System.currentTimeMillis());
         this.updated_on = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreated_on() {
        return created_on;
    }

    public Timestamp getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }
    
    
}

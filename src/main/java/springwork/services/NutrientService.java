package springwork.services;

import java.util.List;

import javax.persistence.Query;

import springwork.dao.NutrientDAO;
import springwork.models.Ingredient;
import springwork.models.Measurement;
import springwork.models.Nutrient;

public class NutrientService implements NutrientDAO {

	@Override
	public Nutrient findById(int id) {
		return entityManager.find(Nutrient.class, id); //this method needs a default constructor in the entityclass for some reason
	}

	@Override
	public List<Nutrient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Nutrient findByName(String name) {
		Query q = entityManager.createQuery("SELECT n FROM Nutrient n WHERE n.name=:name ");
		q.setParameter("name", name);
        return  (Nutrient) q.getSingleResult();
	}
}

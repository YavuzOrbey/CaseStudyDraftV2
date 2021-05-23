package springwork.services;

import java.util.List;

import javax.persistence.Query;

import springwork.dao.MeasurementDAO;
import springwork.models.Measurement;
import springwork.models.Nutrient;
import springwork.models.User;

public class MeasurementService implements MeasurementDAO{

	@Override
	public Measurement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Measurement> findAll() {
        Query q = entityManager.createQuery("SELECT m FROM Measurement m ");
        return (List<Measurement>) q.getResultList();
	}
	public Measurement findByName(String name) {
		Query q = entityManager.createQuery("SELECT m FROM Measurement m WHERE m.name=:name ");
		q.setParameter("name", name);
        return  (Measurement) q.getSingleResult();
	}
}

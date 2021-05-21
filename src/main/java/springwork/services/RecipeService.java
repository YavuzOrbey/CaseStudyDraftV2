package springwork.services;


import javax.persistence.Query;

import springwork.dao.RecipeDAO;
import springwork.models.Recipe;

import java.util.List;

public class RecipeService implements RecipeDAO {
    @Override
    public Recipe findById(int id) {
        Recipe recipe =  entityManager.find(Recipe.class, id);
        return recipe;
    }

    @Override
    public List<Recipe> findAll() {
        Query q = entityManager.createQuery("SELECT r FROM Recipe r");
        return ( List<Recipe>) q.getResultList();
    }
}

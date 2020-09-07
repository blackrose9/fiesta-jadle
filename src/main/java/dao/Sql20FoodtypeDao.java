package dao;

import models.Foodtype;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql20FoodtypeDao implements FoodtypeDao{
    private final Sql2o sql2o;
    public Sql20FoodtypeDao(Sql2o sql2o) { this.sql2o = sql2o; }
    @Override
    public List<Foodtype> getAll() {
        return null;
    }

    @Override
    public void add(Foodtype foodtype) {

    }

    @Override
    public Foodtype findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllFoodtypes() {

    }
}

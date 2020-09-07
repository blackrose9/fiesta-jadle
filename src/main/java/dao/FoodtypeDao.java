package dao;

import models.Foodtype;

import java.util.List;

public interface FoodtypeDao {
    List<Foodtype> getAll();
//    C
    void add(Foodtype foodtype);
//    R
    Foodtype findById(int id);
//    U
// void update(int id, String content);

//    D
    void deleteById(int id);
    void clearAllFoodtypes();
}

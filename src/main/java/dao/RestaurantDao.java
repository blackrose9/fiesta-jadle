package dao;

import models.Restaurant;

import java.util.List;

public interface RestaurantDao {
    List<Restaurant> getAll();
//    C
    void add(Restaurant restaurant);
//    R
    Restaurant findById(int id);
//    U
// void update(int id, String content);

//    D
    void deleteById(int id);
    void clearAllRestaurants();
}

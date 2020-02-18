package dao;

import models.Review;

import java.util.List;

public interface ReviewDao {
    List<Review> getAll();
//    C
    void add(Review review);
//    R
Review findById(int id);
//    U
// void update(int id, String content);

//    D
    void deleteById(int id);
    void clearAllReview();
}

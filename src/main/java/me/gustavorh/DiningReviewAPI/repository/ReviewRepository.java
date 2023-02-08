package me.gustavorh.DiningReviewAPI.repository;

import me.gustavorh.DiningReviewAPI.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}

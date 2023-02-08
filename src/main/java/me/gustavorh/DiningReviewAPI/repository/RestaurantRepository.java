package me.gustavorh.DiningReviewAPI.repository;

import me.gustavorh.DiningReviewAPI.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
}

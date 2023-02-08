package me.gustavorh.DiningReviewAPI.repository;

import me.gustavorh.DiningReviewAPI.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByDisplayName(String displayName);
}

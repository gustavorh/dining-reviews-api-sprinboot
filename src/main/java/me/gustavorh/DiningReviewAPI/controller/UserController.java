package me.gustavorh.DiningReviewAPI.controller;

import me.gustavorh.DiningReviewAPI.model.User;
import me.gustavorh.DiningReviewAPI.repository.UserRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users")
    public Iterable<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping(path = "/users")
    public User createNewUser(@RequestBody User userToCreate) {
        return this.userRepository.save(userToCreate);
    }

    @PutMapping(path = "/users/{displayName}")
    public User updateUser(@PathVariable("displayName") String displayName, @RequestBody User userToUpdate) {
        Optional<User> userToUpdateOptional = this.userRepository.findByDisplayName(displayName);
        if (!userToUpdateOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        User userUpdate = userToUpdateOptional.get();
        /*
        TODO
        - Check if fields are empty for the object.
         */
        this.userRepository.save(userUpdate);

        return userUpdate;
    }
}

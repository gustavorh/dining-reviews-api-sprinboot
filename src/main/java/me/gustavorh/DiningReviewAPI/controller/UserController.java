package me.gustavorh.DiningReviewAPI.controller;

import me.gustavorh.DiningReviewAPI.model.User;
import me.gustavorh.DiningReviewAPI.repository.UserRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
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
        Optional<User> newUserOptional = this.userRepository.findByDisplayName(userToCreate.getDisplayName());
        if (newUserOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        return this.userRepository.save(userToCreate);
    }

    @PutMapping(path = "/users/{displayName}")
    public User updateUser(@PathVariable("displayName") String displayName, @RequestBody User userToUpdate) {
        Optional<User> userToUpdateOptional = this.userRepository.findByDisplayName(displayName);
        if (!userToUpdateOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        User userUpdate = userToUpdateOptional.get();

        if (ObjectUtils.isEmpty(userToUpdate.getCity())) {

            /*
            TODO
            - CHECK FOR EMPTY FIELDS.
            - FIND A BETTER APPROACH FOR THIS METHOD IN GENERAL.
             */
        }
        this.userRepository.save(userUpdate);

        return userUpdate;
    }
}

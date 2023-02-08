package me.gustavorh.DiningReviewAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USERS")
public @Data class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIP_CODE")
    private String zipcode;
    @Column(name = "PEANUT_ALLERGIE")
    private Boolean peanutAllergie;
    @Column(name = "EGG_ALLERGIE")
    private Boolean eggAllergie;
    @Column(name = "DAIRY_ALLERGIE")
    private Boolean dairyAllergie;
}

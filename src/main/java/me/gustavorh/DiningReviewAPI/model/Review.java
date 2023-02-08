package me.gustavorh.DiningReviewAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "REVIEWS")
public @Data class Review {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "REVIEWER_NAME")
    private String reviewerName;
    @Column(name = "RESTAURANT_ID")
    private Long restaurantId;
    @Column(name = "PEANUT_SCORE")
    private Integer peanutScore;
    @Column(name = "EGG_SCORE")
    private Integer eggScore;
    @Column(name = "DAIRY_SCORE")
    private Integer dairyScore;
    @Column(name = "COMMENT")
    private Integer comment;
}

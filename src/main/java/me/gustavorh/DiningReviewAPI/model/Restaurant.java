package me.gustavorh.DiningReviewAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="RESTAURANTS")
@Data public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PEANUT_SCORE")
    private String peanutScore;

    @Column(name = "EGG_SCORE")
    private String eggScore;

    @Column(name = "DAIRY_SCORE")
    private String dairyScore;

    @Column(name = "OVERALL_SCORE")
    private String overallScore;


}

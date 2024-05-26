package com.individual.foodmotiondailynutrition.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DailyNutrition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private EatingTimePeriod eatingTime;

    private int serving;
    private double totalCalories;
    private double totalCarbs;
    private double totalFat;
    private double totalProtein;

    private Long recipeId;
    private Long productId;
    private LocalDate date = LocalDate.now(); // Initialize with current date

}
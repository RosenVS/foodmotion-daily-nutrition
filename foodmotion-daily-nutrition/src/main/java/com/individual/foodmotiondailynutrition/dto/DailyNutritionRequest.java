package com.individual.foodmotiondailynutrition.dto;

import lombok.Data;

@Data
public class DailyNutritionRequest {
    private String userId;
    private String date;
}
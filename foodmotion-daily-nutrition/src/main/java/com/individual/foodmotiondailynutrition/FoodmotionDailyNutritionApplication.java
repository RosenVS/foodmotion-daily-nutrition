package com.individual.foodmotiondailynutrition;

import com.individual.foodmotiondailynutrition.model.DailyNutrition;
import com.individual.foodmotiondailynutrition.model.EatingTimePeriod;
import com.individual.foodmotiondailynutrition.repository.DailyNutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class FoodmotionDailyNutritionApplication  implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(FoodmotionDailyNutritionApplication.class, args);
    }
    @Autowired
    private DailyNutritionRepository dailyNutritionRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create and set up the Nutrition components for Bread
        DailyNutrition dailyNutrition = new DailyNutrition();
        dailyNutrition.setDate(LocalDate.now());
        dailyNutrition.setServing(2);
        dailyNutrition.setEatingTime(EatingTimePeriod.BREAKFAST);
        dailyNutrition.setRecipeId(3L);
        dailyNutrition.setProductId(null);
        dailyNutrition.setTotalCalories(798.0);
        dailyNutrition.setTotalCarbs(102.2);
        dailyNutrition.setTotalFat(39.6);
        dailyNutrition.setTotalProtein(8.2);
        dailyNutrition.setUserId("0b6lwl6FcBPDZrwfBrvIMcR2Gfm1");
        dailyNutritionRepository.save(dailyNutrition);



        dailyNutrition = new DailyNutrition();
        dailyNutrition.setDate(LocalDate.now());
        dailyNutrition.setServing(2);
        dailyNutrition.setEatingTime(EatingTimePeriod.LUNCH);
        dailyNutrition.setRecipeId(null);
        dailyNutrition.setProductId(2L);
        dailyNutrition.setTotalCalories(620.0);
        dailyNutrition.setTotalCarbs(4.0);
        dailyNutrition.setTotalFat(44.0);
        dailyNutrition.setTotalProtein(52.0);
        dailyNutrition.setUserId("0b6lwl6FcBPDZrwfBrvIMcR2Gfm1");
        dailyNutritionRepository.save(dailyNutrition);

        dailyNutrition = new DailyNutrition();
        dailyNutrition.setDate(LocalDate.now());
        dailyNutrition.setServing(2);
        dailyNutrition.setEatingTime(EatingTimePeriod.DINNER);
        dailyNutrition.setRecipeId(4L);
        dailyNutrition.setProductId(null);
        dailyNutrition.setTotalCalories(231.0);
        dailyNutrition.setTotalCarbs(21.3);
        dailyNutrition.setTotalFat(5.4);
        dailyNutrition.setTotalProtein(24.3);
        dailyNutrition.setUserId("0b6lwl6FcBPDZrwfBrvIMcR2Gfm1");
        dailyNutritionRepository.save(dailyNutrition);

        dailyNutrition = new DailyNutrition();
        dailyNutrition.setDate(LocalDate.now());
        dailyNutrition.setServing(2);
        dailyNutrition.setEatingTime(EatingTimePeriod.DINNER);
        dailyNutrition.setRecipeId(null);
        dailyNutrition.setProductId(1L);
        dailyNutrition.setTotalCalories(312.8);
        dailyNutrition.setTotalCarbs(24.2);
        dailyNutrition.setTotalFat(16.8);
        dailyNutrition.setTotalProtein(16.2);
        dailyNutrition.setUserId("0b6lwl6FcBPDZrwfBrvIMcR2Gfm1");
        dailyNutritionRepository.save(dailyNutrition);
    }

}
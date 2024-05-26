package com.individual.foodmotiondailynutrition.repository;

import com.individual.foodmotiondailynutrition.model.DailyNutrition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DailyNutritionRepository extends JpaRepository<DailyNutrition, Long> {
    List<DailyNutrition> findByUserIdAndDate(String userId, LocalDate date);

}

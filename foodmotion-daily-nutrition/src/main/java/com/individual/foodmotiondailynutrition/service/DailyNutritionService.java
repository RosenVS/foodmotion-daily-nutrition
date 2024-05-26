package com.individual.foodmotiondailynutrition.service;

import com.individual.foodmotiondailynutrition.model.DailyNutrition;
import com.individual.foodmotiondailynutrition.repository.DailyNutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DailyNutritionService {
    @Autowired
    private DailyNutritionRepository dailyNutritionRepository;

    public DailyNutrition saveOrUpdate(DailyNutrition dailyNutrition) {
        // Set current date if date is not set
        if (dailyNutrition.getDate() == null) {
            dailyNutrition.setDate(LocalDate.now());
        }
        return dailyNutritionRepository.save(dailyNutrition);
    }
    public List<DailyNutrition> getDailyNutritionByUserIdAndDate(String userId, LocalDate date) {
        return dailyNutritionRepository.findByUserIdAndDate(userId, date);
    }

    public List<DailyNutrition> getAllDailyNutritions() {
        return dailyNutritionRepository.findAll();
    }

    public Optional<DailyNutrition> getDailyNutritionById(Long id) {
        return dailyNutritionRepository.findById(id);
    }

    public void deleteDailyNutritionById(Long id) {
        dailyNutritionRepository.deleteById(id);
    }
}
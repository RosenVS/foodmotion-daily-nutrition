package com.individual.foodmotiondailynutrition.controller;

import com.individual.foodmotiondailynutrition.dto.DailyNutritionRequest;
import com.individual.foodmotiondailynutrition.model.DailyNutrition;
import com.individual.foodmotiondailynutrition.service.DailyNutritionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/daily-nutrition")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "https://foodmotion-frontend-hlfxsphkja-ew.a.run.app"})
public class DailyNutritionController {

    @Autowired
    private DailyNutritionService dailyNutritionService;

    @GetMapping
    public List<DailyNutrition> getAllDailyNutritions() {
        return dailyNutritionService.getAllDailyNutritions();
    }

    @GetMapping("/{id}")
    public Optional<DailyNutrition> getDailyNutritionById(@PathVariable Long id) {
        return dailyNutritionService.getDailyNutritionById(id);
    }

    @PostMapping
    public DailyNutrition createDailyNutrition(@RequestBody DailyNutrition dailyNutrition) {
        return dailyNutritionService.saveOrUpdate(dailyNutrition);
    }

    @PutMapping("/{id}")
    public DailyNutrition updateDailyNutrition(@PathVariable Long id, @RequestBody DailyNutrition dailyNutrition) {
        dailyNutrition.setId(id);
        return dailyNutritionService.saveOrUpdate(dailyNutrition);
    }

    @DeleteMapping("/{id}")
    public void deleteDailyNutrition(@PathVariable Long id) {
        dailyNutritionService.deleteDailyNutritionById(id);
    }


    @GetMapping("test")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("hello world v2 demo - hv3jb1kn3ml1");
    }



    @PostMapping("/user/date")
    public List<DailyNutrition> getDailyNutritionByUserIdAndDate(@RequestBody DailyNutritionRequest request) {
        String userId = request.getUserId();
        String dateString = request.getDate();
        LocalDate date = LocalDate.parse(dateString);
        return dailyNutritionService.getDailyNutritionByUserIdAndDate(userId, date);
    }
}

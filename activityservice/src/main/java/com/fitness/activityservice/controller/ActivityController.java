package com.fitness.activityservice.controller;


import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
@AllArgsConstructor
public class ActivityController {
    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest activityRequest){
        return ResponseEntity.ok(activityService.trackActivity(activityRequest));
    }
    @GetMapping
    public ResponseEntity<List<ActivityResponse>> getUserActivities(@RequestHeader("X-User-ID") String userId){
        return ResponseEntity.ok(activityService.getUserActivities(userId));
    }

    @GetMapping("/{activityId}")
    public ResponseEntity<ActivityResponse> getActivityById(@PathVariable String activityId){
        return ResponseEntity.ok(activityService.getActivityById(activityId));
    }
}

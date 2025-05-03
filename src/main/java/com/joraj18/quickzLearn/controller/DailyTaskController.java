package com.joraj18.quickzLearn.controller;

import com.joraj18.quickzLearn.model.DailyTask;
import com.joraj18.quickzLearn.service.DailyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class DailyTaskController {

    @Autowired
    DailyTaskService dailyTaskService;

    @GetMapping("daily-tasks")
    public ResponseEntity<List<DailyTask>> getAllDailyTask() {
        return dailyTaskService.getAllDailyTask();
    }

    @GetMapping("daily-tasks/topic/{topicId}")
    public ResponseEntity<List<DailyTask>> getDailyTaskByTopicIdDayNo(@PathVariable int topicId){
        return dailyTaskService.getDailyTaskByTopicIdDayNo(topicId);

    }
}

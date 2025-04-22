package com.joraj18.quickzLearn.controller;

import com.joraj18.quickzLearn.model.Topic;
import com.joraj18.quickzLearn.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TopicController {

    @Autowired
    TopicService topicService;

    @GetMapping("getAllTopics")
    public ResponseEntity<List<Topic>> getAllDailyTasks() {
        int a=10;
        return topicService.getAllDailyTasks();
    }

}

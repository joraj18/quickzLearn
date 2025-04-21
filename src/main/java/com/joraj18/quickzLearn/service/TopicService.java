package com.joraj18.quickzLearn.service;

import com.joraj18.quickzLearn.dao.TopicDao;
import com.joraj18.quickzLearn.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    TopicDao topicDao;

    public ResponseEntity<List<Topic>> getAllDailyTasks() {
        return new ResponseEntity<>(topicDao.findAll(), HttpStatus.OK);
    }
}

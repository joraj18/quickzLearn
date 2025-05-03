package com.joraj18.quickzLearn.service;

import com.joraj18.quickzLearn.dao.DailyTaskDao;
import com.joraj18.quickzLearn.model.DailyTask;
import com.joraj18.quickzLearn.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyTaskService {
    @Autowired
    DailyTaskDao dailyTaskDao;

    //get daily tasks
    public ResponseEntity<List<DailyTask>> getAllDailyTask(){
        return new ResponseEntity<>(dailyTaskDao.findAll(), HttpStatus.OK);
    }


    //get daily tasks by topicId and dayId
    public ResponseEntity<List<DailyTask>> getDailyTaskByTopicIdDayNo(int topicId){
        List<DailyTask> tasks= dailyTaskDao.findById_TopicId(topicId);
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
}

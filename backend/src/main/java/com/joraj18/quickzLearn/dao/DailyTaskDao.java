package com.joraj18.quickzLearn.dao;

import com.joraj18.quickzLearn.model.DailyTask;
import com.joraj18.quickzLearn.model.DailyTaskID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DailyTaskDao extends JpaRepository<DailyTask, DailyTaskID> {
    List<DailyTask> findById_TopicId(int topicId);
}

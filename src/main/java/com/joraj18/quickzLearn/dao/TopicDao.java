package com.joraj18.quickzLearn.dao;

import com.joraj18.quickzLearn.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao extends JpaRepository<Topic, Integer>{

}

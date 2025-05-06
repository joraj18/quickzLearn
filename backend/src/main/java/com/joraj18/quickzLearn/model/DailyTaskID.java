package com.joraj18.quickzLearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class DailyTaskID implements Serializable {

    @Column(name="topic_id")
    private int topicId;

    @Column(name="day_no")
    private int dayNo;


}

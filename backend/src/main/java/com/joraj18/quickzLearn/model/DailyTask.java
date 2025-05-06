package com.joraj18.quickzLearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="daily_task")
@Data
@Entity
public class DailyTask {

    @EmbeddedId
    private DailyTaskID id;

    @Column(name="task_title")
    private String taskTitle;

    @Column(name="task_content")
    private String taskContent;

    @Column(name="status")
    private String status;
}

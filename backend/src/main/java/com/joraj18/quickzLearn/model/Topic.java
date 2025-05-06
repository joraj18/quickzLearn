package com.joraj18.quickzLearn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Topic {
    @Id //The database will auto-generate the id using a sequence.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //The database will auto-generate the id using a sequence.
    private Integer topicId;
    private String topicTitle;
    private Character status;
    private Integer daysLeft;

}

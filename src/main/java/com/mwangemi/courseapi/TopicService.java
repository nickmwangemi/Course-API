package com.mwangemi.courseapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("JavaScript", "Core JavaScript", "Core JavaScript Description"));

    public List<Topic> getAllTopics() {
        return topics;
    }
}
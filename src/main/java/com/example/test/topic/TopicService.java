package com.example.test.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Topic service.
 */
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java Framework", "Java Framework Description"),
            new Topic("JavaScript", "JavaScript", "JavaScript Framework Description")
    ));


    /**
     * Gets all topics.
     *
     * @return the all topics
     */
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topics.addAll(topicRepository.findAll());

        return topics;
    }


    /**
     * Gets topic.
     *
     * @param id the id
     * @return the topic
     */
    public Topic getTopic(String id) {
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    /**
     * Add topic.
     *
     * @param topic the topic
     */
    public void addTopic(Topic topic) {
        System.out.println("Check reaching here");
        topicRepository.save(topic);
    }

    /**
     * Delete topic.
     *
     * @param id the id
     */
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

    /**
     * Update topic.
     *
     * @param topic the topic
     * @param id    the id
     */
    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);


    }
}

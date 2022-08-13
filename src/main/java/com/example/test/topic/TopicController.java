package com.example.test.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Topic controller.
 */
@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    /**
     * Gets all topics.
     *
     * @return the all topics
     */
    @RequestMapping(value = "/topics", produces = "application/json",
            method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    /**
     * Gets topic.
     *
     * @param id the id
     * @return the topic
     */
    @RequestMapping(value = "/topics/{id}", produces = "application/json",
            method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    /**
     * Add topic.
     *
     * @param topic the topic
     */
    @RequestMapping(value = "/topics", produces = "application/json", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }


    /**
     * Update topic.
     *
     * @param topic the topic
     * @param id    the id
     */
    @RequestMapping(produces = "application/json", value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    /**
     * Delete topic.
     *
     * @param id the id
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}

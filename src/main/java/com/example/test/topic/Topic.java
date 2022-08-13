package com.example.test.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The type Topic.
 */
@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;


    /**
     * Instantiates a new Topic.
     */
    public Topic() {
    }

    /**
     * Instantiates a new Topic.
     *
     * @param id          the id
     * @param topic       the topic
     * @param description the description
     */
    public Topic(String id, String topic, String description) {
        this.id = id;
        this.name = topic;
        this.description = description;
    }


    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

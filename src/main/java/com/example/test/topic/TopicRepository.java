package com.example.test.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Topic repository.
 */
@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {


}
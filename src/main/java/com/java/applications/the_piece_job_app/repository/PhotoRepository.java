package com.java.applications.the_piece_job_app.repository;

import com.java.applications.the_piece_job_app.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}

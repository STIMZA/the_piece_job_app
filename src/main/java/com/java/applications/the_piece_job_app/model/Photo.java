package com.java.applications.the_piece_job_app.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photos")
@Getter
@Setter
public class Photo {

    @Id
    private String id;

    private String title;

    private Binary image;
}

package com.javaspringmvc.demo.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String blog_title;
    private String blog_content;

    @Lob
    private Blob blog_image;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }


    public Blob getBlog_image() {
        return blog_image;
    }

    public void setBlog_image(Blob blog_image) {
        this.blog_image = blog_image;
    }
}

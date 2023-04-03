package com.codegym.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog")
public class BLog {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name_blog", columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(name = "date", columnDefinition = "DATE")
    private String date;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    public BLog() {
    }

    public BLog(Integer id, String name, String date, String content) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package com.codegym.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog_type")
public class TypeBLog {
    @Id
    @Column(name = "id_type", columnDefinition = "int")
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;

    public TypeBLog() {
    }

    public TypeBLog(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}

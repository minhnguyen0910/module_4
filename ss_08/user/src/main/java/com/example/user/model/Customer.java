package com.example.user.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    String name;
    @Column(name = "age")
    Integer age;
    @Column(name = "email", columnDefinition = "VARCHAR(255)")
    String email;
    @Column(name = "gender", columnDefinition = "text")
    String gender;
    @Column(name = "phone", columnDefinition = "VARCHAR(20)")
    String phone;

    public Customer() {
    }

    public Customer(Integer id, String name, Integer age, String email, String gender, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

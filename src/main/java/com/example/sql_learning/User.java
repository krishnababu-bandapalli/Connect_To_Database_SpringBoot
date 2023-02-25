package com.example.sql_learning;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
    @Id
    @Column(unique = true)
    private int id;
    private String name;
    private int age;
    @Column(name ="country_name")
    private String country;
    @Column(unique = true)
    private String email;
    private String mobNo;

    public User() {
    }

    public User(int id, String name, int age, String mobNo, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

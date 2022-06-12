package com.example.architectureassibackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document("student")
public class Student {
    @Id
    private long id;
    @Field(name = "firstName")
    private String firstName;
    @Field(name = "lastName")
    private String lastName;
    @Field(name = "age")
    private int age;
    @Field(name = "grade")
    private int grade;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public Student(long id, String firstName, String lastName, int age, int grade) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
    }
}

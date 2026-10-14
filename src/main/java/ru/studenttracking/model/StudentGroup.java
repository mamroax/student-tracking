package ru.studenttracking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_groups")
public class StudentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    protected StudentGroup(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public String getName(String name){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

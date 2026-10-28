package ru.studenttracking.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_groups")
public class StudentGroup {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "group_id_gen"
    ) //sequance generation
    @SequenceGenerator(
            name = "group_id_gen",
            sequenceName = "group_id_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    protected StudentGroup(){
    }

    public StudentGroup(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

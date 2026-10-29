package ru.studenttracking.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_groups")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_id_gen")
    @SequenceGenerator(name = "group_id_gen", sequenceName = "group_id_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "student_groups_students", joinColumns = @JoinColumn(name = "student_group_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> Students = new ArrayList<>();
}

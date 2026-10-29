package ru.studenttracking.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_id_gen")
    @SequenceGenerator(name = "students_id_gen", sequenceName = "students_id_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, unique = false, length = 100)
    private String firstName;

    @Column(nullable = false, unique = false, length = 100)
    private String lastName;

    @Column(nullable = true, unique = false, length = 100)
    private String patronymic;

    @Column(nullable = true, unique = true, length = 254)
    private String email;
}

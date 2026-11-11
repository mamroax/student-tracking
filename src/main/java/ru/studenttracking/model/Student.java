package ru.studenttracking.model;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;


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

    //TODO накинь служебные поля типа last Update time которые будут автоматичсеки проходя через программу обновляться
}

//TODO Сделать контроллер принимающий модель твоего студента DTO модель студента.
// DTO студента с теми же полями прям по имени но соответсвенно без лишних анотаций
// Сделать стандартный маппер который будет содержать методы toEntite и toDto
// StudentDto должен в котроллере быть внутри FrontendDto FrontendRequsetDto
// Контроллер RestController
package ru.studenttracking.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "students_id_gen"
    )
    @SequenceGenerator(
            name = "students_id_gen",
            sequenceName = "students_id_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(nullable = false, unique = false, length = 100)
    private String firstName;

    @Column(nullable = false, unique = false, length = 100)
    private String lastName;

    @Column(nullable = true, unique = false, length = 100)
    private String patronymic;

    @Column(nullable = true, unique = true, length = 254)
    private String email;

    protected Student(){
    }

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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

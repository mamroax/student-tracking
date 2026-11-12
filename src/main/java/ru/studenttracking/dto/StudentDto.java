package ru.studenttracking.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
    private Long id;
    @Size(max=100)
    @NotBlank
    private String firstName;
    @Size(max=100)
    @NotBlank
    private String lastName;
    @Size(max=100)
    private String patronymic;
    @Email
    @NotBlank
    @Size(max=254)
    private String email;
}

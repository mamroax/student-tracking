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
    @Size(max=100, message = "Имя не должно превышать 100 символов")
    @NotBlank(message = "Имя обязательно для заполнения")
    private String firstName;
    @Size(max=100, message = "Фамилия не должна превышать 100 символов")
    @NotBlank(message = "Фамилия обязательна для заполнения")
    private String lastName;
    @Size(max=100, message = "Отчество не должно превышать 100 символов")
    private String patronymic;
    @Email(message = "Некорректный формат электронной почты")
    @NotBlank(message = "Почта обязательна для заполнения")
    @Size(max=254, message = "Длина email не должна превышать 254 символа")
    private String email;
}

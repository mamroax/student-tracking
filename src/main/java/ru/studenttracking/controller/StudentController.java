package ru.studenttracking.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.studenttracking.dto.StudentDto;
import ru.studenttracking.service.impl.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    //TODO Сделать контроллер принимающий модель твоего студента DTO модель студента.
    // DTO студента с теми же полями прям по имени но соответсвенно без лишних анотаций
    // Сделать стандартный маппер который будет содержать методы toEntite и toDto
    // StudentDto должен в котроллере быть внутри FrontendDto FrontendRequsetDto
    // Контроллер RestController
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDto createStudent(@RequestBody StudentDto dto){
        return studentService.save(dto);
    }
}

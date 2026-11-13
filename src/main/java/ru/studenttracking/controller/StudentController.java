package ru.studenttracking.controller;

import org.springframework.web.bind.annotation.*;
import ru.studenttracking.dto.StudentDto;
import ru.studenttracking.service.impl.StudentService;
import jakarta.validation.Valid;

import java.util.List;


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
    public StudentDto createStudent(@RequestBody @Valid StudentDto dto){
        return studentService.save(dto);
    }

    @GetMapping
    public List<StudentDto> getAllStudents(){
        return studentService.findAll();
    }
}

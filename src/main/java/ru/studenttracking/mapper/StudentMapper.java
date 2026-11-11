package ru.studenttracking.mapper;

import org.springframework.stereotype.Component;
import ru.studenttracking.dto.StudentDto;
import ru.studenttracking.model.Student;

@Component
public class StudentMapper {
    public Student toEntity(StudentDto dto){
        Student student = new Student();
        student.setEmail(dto.getEmail());
        student.setPatronymic(dto.getPatronymic());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setId(dto.getId());
        return student;
    }

    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setEmail(student.getEmail());
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setPatronymic(student.getPatronymic());
        return dto;
    }
}

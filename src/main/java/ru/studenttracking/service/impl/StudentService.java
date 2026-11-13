package ru.studenttracking.service.impl;

import org.springframework.stereotype.Service;
import ru.studenttracking.dto.StudentDto;
import ru.studenttracking.mapper.StudentMapper;
import ru.studenttracking.model.Student;
import ru.studenttracking.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    //TODO Сделать аннотацию @Service
    // Сделать метод save для сохранен7ия студента который будет вызываться из контроллера
    // Превращаем тут дто в студент энтити и отправляем сохраняться в бд через репозиторий
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper){
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public StudentDto save(StudentDto dto){
        Student student = studentMapper.toEntity(dto);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toDto(savedStudent);
    }

    public List<StudentDto> findAll(){
        List<StudentDto> students = new ArrayList<>();
        for (Student student : studentRepository.findAll()){
            StudentDto dto = studentMapper.toDto(student);
            students.add(dto);
        }
        return students;
    }
}

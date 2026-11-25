package ru.studenttracking.mapper;

import ch.qos.logback.core.model.ComponentModel;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;
import ru.studenttracking.dto.StudentDto;
import ru.studenttracking.model.Student;


@Mapper(componentModel = "spring")
public interface StudentMapper {
    public Student toEntity(StudentDto dto);

    public StudentDto toDto(Student student);
}

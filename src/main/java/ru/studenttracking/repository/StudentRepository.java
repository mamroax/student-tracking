package ru.studenttracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.studenttracking.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //TODO Просто делаем метод save сохраняющий подготовленного в серисе энтити студента
}

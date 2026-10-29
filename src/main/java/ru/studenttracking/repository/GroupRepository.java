package ru.studenttracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.studenttracking.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}

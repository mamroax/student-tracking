-- 1. Создаем последовательности для генерации ID
CREATE SEQUENCE group_id_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE students_id_seq START WITH 1 INCREMENT BY 1;

-- 2. Создаем таблицу студентов
CREATE TABLE students (
    id BIGINT PRIMARY KEY DEFAULT nextval('students_id_seq'),
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    patronymic VARCHAR(100),
    email VARCHAR(254) UNIQUE
);

-- 3. Создаем связующую таблицу для связи ManyToMany
CREATE TABLE student_groups_students (
    student_group_id BIGINT NOT NULL,
    student_id BIGINT NOT NULL,
    PRIMARY KEY (student_group_id, student_id), -- Составной первичный ключ защищает от дубликатов пары группа-студент
    CONSTRAINT fk_group FOREIGN KEY (student_group_id) REFERENCES student_groups (id) ON DELETE CASCADE,
    CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES students (id) ON DELETE CASCADE
);

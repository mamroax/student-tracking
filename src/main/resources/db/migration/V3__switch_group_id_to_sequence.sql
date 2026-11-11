-- Убираем прежний механизм генерации ID
ALTER TABLE student_groups
    ALTER COLUMN id DROP IDENTITY;

-- Привязываем столбец к существующей последовательности
ALTER TABLE student_groups
    ALTER COLUMN id SET DEFAULT nextval('group_id_seq');

-- Указываем, что последовательность принадлежит столбцу
ALTER SEQUENCE group_id_seq
    OWNED BY student_groups.id;
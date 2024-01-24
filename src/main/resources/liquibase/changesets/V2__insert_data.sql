-- Заполняем созданную таблицу начальными значениями
insert into users (username, password, email, role)
values ('Иван', '123', 'ivan@mail.ru', 'developer'),
       ('Сергей', '345', 'serg@mail.ru', 'tester'),
       ('Олег', '567', 'oleg@mail.ru', 'devops');

insert into projects (name, description, created_date)
values ('Avito', 'Торговая площадка', '2023-12-29 17:00:00'),
       ('Ozon', 'Торговая площадка', '2024-01-05 16:35:22');

insert into entity_with_relation (related_entity_id, project_id, user_id)
values (null, 1, 1),
       (null, 1, 2),
       (null, 1, 3),
       (null, 2, 1),
       (null, 2, 3);
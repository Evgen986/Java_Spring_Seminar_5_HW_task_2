package ru.maliutin.task_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maliutin.task_2.models.User;

/**
 * Репозиторий сущности пользователь.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

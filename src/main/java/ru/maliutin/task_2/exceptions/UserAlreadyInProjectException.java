package ru.maliutin.task_2.exceptions;

/**
 * Исключение - пользователь уже участвует в проекте.
 */
public class UserAlreadyInProjectException extends RuntimeException{
    public UserAlreadyInProjectException(String message) {
        super(message);
    }
}

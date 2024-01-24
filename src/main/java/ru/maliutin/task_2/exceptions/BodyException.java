package ru.maliutin.task_2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Унификация сообщений об исключениях.
 */
@Data
@AllArgsConstructor
public class BodyException {
    /**
     * Сообщение об исключении.
     */
    private String message;

}

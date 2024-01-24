package ru.maliutin.task_2.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Связующая сущность.
 */
@MappedSuperclass
@Data
public abstract class EntityWithRelation {
    /**
     * Идентификатор. Первичный ключ.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Данное поле не использовал.
    private Long relatedEntityId;
}

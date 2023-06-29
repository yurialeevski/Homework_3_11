package ru.skypro.homework.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.springdatajpa.pojoEmployee.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}

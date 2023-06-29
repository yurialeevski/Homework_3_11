package ru.skypro.homework.springdatajpa.service;

import ru.skypro.homework.springdatajpa.pojoEmployee.Position;

public interface EmployeeView {
    String getName();
    Integer getSalary();
    Position getPosition();
}

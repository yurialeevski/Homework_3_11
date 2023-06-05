package ru.skypro.homework.springdatajpa.repository;

import ru.skypro.homework.springdatajpa.pojoEmployee.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
    int getSumSalary();
    int getMinSalary();
    int getMaxSalary();
    List<Employee> getHighSalary();
    List<Employee> getHigherThanSalary(Integer salary);
    void updateById(Integer id, Employee employee);
    void addEmployee(Employee employee);
    void addListOf(List<Employee> employees);
    Employee getById(Integer id);
    void deleteById(Integer id);
}

package id.uin.ac.id.rama.books.repository;

import id.uin.ac.id.rama.books.employee.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    void saveEmployee(Employee employee);
}

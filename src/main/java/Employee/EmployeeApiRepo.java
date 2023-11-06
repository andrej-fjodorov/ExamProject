package Employee;

import java.util.List;

public interface EmployeeApiRepo {
    List<Employee> getAll(int companyId);

    Employee getById(int id);

    int create(Employee employee, String token);
}

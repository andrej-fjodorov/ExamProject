package Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAll ();
    List<Employee> getAll(boolean isActive);
    Employee getById (int id);

    int create (String firstName, String middleName,String lastName,int companyId);
    void deleteById (int id);
}

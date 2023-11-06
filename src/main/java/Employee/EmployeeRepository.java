package Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAll () throws SQLException;
    List<Employee> getAll(boolean isActive) throws SQLException;
    Employee getById (int id);

    int create (String firstName, String middleName,String lastName,int companyId);
    void deleteById (int id);
}

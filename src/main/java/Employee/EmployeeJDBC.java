package Employee;

import java.util.List;

public class EmployeeJDBC  implements EmployeeRepository{
    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public List<Employee> getAll(boolean isActive) {
        return null;
    }

    @Override
    public Employee getById(int id) {
        return null;
    }

    @Override
    public int create(String firstName, String middleName, String lastName, int companyId) {
        return 0;
    }

    @Override
    public void deleteById(int id) {

    }
}

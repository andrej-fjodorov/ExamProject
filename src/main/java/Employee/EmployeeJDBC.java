package Employee;

import java.util.List;

public class EmployeeJDBC  implements EmployeeRepository{
    private final static String GET_ALL_EMPLOYEES="select*from employee";
    private final static String ADD_NEW_EMPLOYEE="insert into employee (company_id, first_name, last_name, phone) values (?,?,?,?)";
    private final static String GET_LAST_ADDED_EMPLOYEE="select*from employee order by \"id\" desc limit 1";
    private final static String CHANGE_IS_ACTIVE_EMPLOYEE_INFO="update employee set is_active='false' where \"id\"=?";
    private final static String DELETE_EMPLOYEE_BY_NAME="delete from employee where \"first_name\"=?";
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

package Company;
import java.sql.ResultSet;
import java.util.List;

public class CompanyJDBC implements CompanyRepository{

    private final static String GET_ALL_COMPANY="select*from company where \"deleted_at\" is null";
    private final static String GET_ALL_ACTIVE_COMPANY="select*from company where \"is_active\"='true' and \"deleted_at\" is null";
    private final static String ADD_NEW_COMPANY="insert into company (name, description) values (?,?)";
    private final static String GET_LAST_ADDED_COMPANY="select*from company where \"deleted_at\" is null order by \"id\" desc limit 1";
    private final static String DELETE_COMPANY="delete from company where \"id\"=?";

    @Override
    public List<Company> getAll() {
        return null;
    }

    @Override
    public List<Company> getAll(boolean isActive) {
        return null;
    }

    @Override
    public Company getById(int id) {
        return null;
    }

    @Override
    public int create(String name) {
        return 0;
    }

    @Override
    public int create(String name, String description) {
        return 0;
    }


    public void deleteById(int id) {

    }
}

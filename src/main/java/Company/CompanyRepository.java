package Company;
import java.sql.SQLException;
import java.util.List;

public interface CompanyRepository {
    List<Company> getAll () throws SQLException;
    List<Company> getAll(boolean isActive) throws SQLException;
    Company getById (int id) throws SQLException;
    int create (String name) throws SQLException;
    int create (String name, String description);

}

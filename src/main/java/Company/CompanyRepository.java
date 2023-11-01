package Company;
import java.util.List;

public interface CompanyRepository {
    List<Company> getAll ();
    List<Company> getAll(boolean isActive);
    Company getById (int id);
    int create (String name);
    int create (String name, String description);

}

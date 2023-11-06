package Company;

import java.util.List;

public interface CompanyApiRepo {
    List<Company> getAll();

    List<Company> getAll(boolean isActive);

    void deleteById(int id, String token);

}

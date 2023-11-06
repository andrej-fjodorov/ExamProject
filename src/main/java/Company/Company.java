package Company;

import java.security.Timestamp;
import java.util.Objects;

public class Company {
    private int id;
    private boolean isActive;
    private String name;
    private String description;
    private Timestamp deletedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && isActive == company.isActive && Objects.equals(name, company.name) && Objects.equals(description, company.description) && Objects.equals(deletedAt, company.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, description, deletedAt);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deletedAt=" + deletedAt +
                '}';
    }

    public void setDeletedAt(java.sql.Timestamp deletedAt) {
    }
}

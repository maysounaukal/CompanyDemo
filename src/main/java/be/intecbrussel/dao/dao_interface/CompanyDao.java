package be.intecbrussel.dao.dao_interface;

import be.intecbrussel.model.Company;
import be.intecbrussel.model.Employee;

import java.sql.SQLException;

public interface CompanyDao {
    void create(Company company) throws SQLException;

    Company read(int id) throws SQLException;

    void update(Company company) throws SQLException;

    void delete(Company company) throws SQLException;
}

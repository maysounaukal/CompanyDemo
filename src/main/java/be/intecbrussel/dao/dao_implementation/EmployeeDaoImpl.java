package be.intecbrussel.dao.dao_implementation;

import be.intecbrussel.dao.ConnectionProvider;
import be.intecbrussel.dao.dao_interface.EmployeeDao;
import be.intecbrussel.model.Company;
import be.intecbrussel.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao {
    private Connection createConnection() {
        return ConnectionProvider.getInstance().getConnection();
    }

    @Override
    public void create(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("Insert into employee(firstName,lastName , department,companyId) VALUES(?,?,?,?)");
        preparedStatement.setString(1, employee.getFirstName());
        preparedStatement.setString(2, employee.getLastName());
        preparedStatement.setString(3, employee.getDepartment());
        preparedStatement.setInt(4, employee.getCompanyId().getId());

        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public Employee read(int id) throws SQLException {
        PreparedStatement preparedStatement = createConnection().prepareStatement("SELECT * FROM employee WHERE id = ?");
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        Employee employee = new Employee();
        while (rs.next()) {
            employee.setId(rs.getInt("id"));
            employee.setFirstName(rs.getString("firstName"));
            employee.setLastName(rs.getString("lastName"));
            employee.setDepartment(rs.getString("Department"));
            employee.setCompanyId(new Company().setId(rs.getInt("companyId")));
        }


        return employee;
    }

    @Override
    public void update(Employee employee) throws SQLException {

    }

    @Override
    public void delete(Employee employee) throws SQLException {

    }

}

package be.intecbrussel.controller.controller_impl;

import be.intecbrussel.controller.controller_interface.Service;
import be.intecbrussel.dao.dao_implementation.CompanyDaoImp1;
import be.intecbrussel.model.Company;

import java.sql.SQLException;

public class ServiceImpl implements Service {
    private CompanyDaoImp1 companyDao = new CompanyDaoImp1();


    @Override
    public void create(Company company) throws SQLException {
        companyDao.create(company);
    }

    @Override
    public Company read(int id) throws SQLException {
        return companyDao.read(id);
    }

    @Override
    public void update(Company company) throws SQLException {
        companyDao.update(company);

    }

    @Override
    public void delete(Company company) throws SQLException {
        companyDao.delete(company);
    }
}

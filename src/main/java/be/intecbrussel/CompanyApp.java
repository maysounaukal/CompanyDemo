package be.intecbrussel;

import be.intecbrussel.controller.controller_impl.ServiceImpl;
import be.intecbrussel.dao.dao_implementation.EmployeeDaoImpl;

import java.sql.SQLException;

//import be.intecbrussel.dao.dao_implementation.CompanyDaoImp1;

public class CompanyApp {

    public static void main(String[] args) {

        // CompanyDaoImp1 companyDao = new CompanyDaoImp1();
        ServiceImpl service = new ServiceImpl();
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        // Company company = new Company("IBM","BE123456789", "straat", "Antwerpen");


        try {
            //.. service.create(new Company("future", "BE123456789", "Rouppeplein 16", "BXL"));
            //;;  System.out.println(service.read(3));
            //;;  System.out.println(service.read(2));//hier moeten wij de nummer die in de table staat toegevoegen
            //;;  service.update(company.setId(2));
            //;;  System.out.println(service.read(2));
            //;;  service.delete(company.setId(2));
            //companyDao.create(new Company("Intec", "BE123456789", "Rouppeplein 16", "BXL"));
            // companyDao.update(company.setId(1));
            // companyDao.delete( new Company().setId(1));
            // System.out.println(companyDao);in update company gebruiky worden
            // System.out.println(companyDao.read(1));//we hebben dit in delete en update id gebruikt
            //
            //   employeeDao.create(new Employee("ERIC", "Fa", "IT", new Company().setId(3)));
            System.out.println(employeeDao.read(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

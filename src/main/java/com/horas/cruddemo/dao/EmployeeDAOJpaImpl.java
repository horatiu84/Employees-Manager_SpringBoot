package com.horas.cruddemo.dao;

import com.horas.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
    // define fields for entitymanager
        private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }


    @Override
    public List<Employee> findAll() {

        // create a query
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);

        // execute the query and get the results
        List<Employee> employees = query.getResultList();

        // return the results
        return employees;
    }
}

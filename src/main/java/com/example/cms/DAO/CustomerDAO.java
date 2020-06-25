package com.example.cms.DAO;

import com.example.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Smart on 21.06.2020.
 */
@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

    @Override
    List<Customer> findAll();
}

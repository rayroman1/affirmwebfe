package com.example_affirmunregister.demo_affirm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example_affirmunregister.demo_affirm.model.Cust;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository test 2 for jenkins 
//CRUD refers Create, Read, Update, Delete

@Repository
public interface UserRepository extends CrudRepository<Cust, Integer> {

}

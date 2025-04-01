package com.example_affirmunregister.demo_affirm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_affirmunregister.demo_affirm.model.Cust;
import com.example_affirmunregister.demo_affirm.repo.UserRepository;

@Service
public class ServiceMethods {

	 @Autowired
	    private UserRepository userRepository;

	    public Iterable<Cust> getAllCusts() {
	        return userRepository.findAll();
	    }

	    public Cust getCustById(int id) {
	        return userRepository.findById(id).orElse(null);
	    }

	    public void saveProduct(Cust product) {
	    	userRepository.save(product);
	    }

	    public void deleteProduct(int id) {
	    	userRepository.deleteById(id);
	    }
	
	
}

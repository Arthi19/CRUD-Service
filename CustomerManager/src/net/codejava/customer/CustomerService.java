package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired CustomerRepository repo;
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public List<Customer> listAll() {
		return (List<Customer>) repo.findAll();
	}
	
	public Customer get(String username) {
		return repo.findByName(username).get();
	}
	
	public void delete(String username) {
		repo.deleteByName(username);
	}
	
	public List<Customer> search(String keyword) {
		return repo.search(keyword);
	}
}

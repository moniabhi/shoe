package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productDao {

	@Autowired
    productRepo repo;
	
	//insert
	public product insert(product p) {
		
		return repo.save(p);
	}
	
	//retreive
	public List<product> getall(){
		return repo.findAll();
	}
	
	//update
	public product update(product s) {
		//
		product pp=repo.findById(s.getId()).orElse(null);
		            //kishore
		pp.setProduct(s.getProduct());
		return repo.save(pp);
	}
	//delete 
	public void deleteByid(int id) {
		repo.deleteById(id);
		
	}
}

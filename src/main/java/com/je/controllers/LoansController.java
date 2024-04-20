package com.je.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.je.entities.Loans;
import com.je.repository.LoansRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/loans")
public class LoansController {

	//@Autowired
	private LoansRepository loansRepository;
	
	/*
	 * @PostMapping public Loans CreateProduct(@RequestBody Loans product) { return
	 * loansService.createProduct(product); }
	 * 
	 * @GetMapping("/fetch/{id}") public Loans fetchProduct(@PathVariable Integer
	 * id) { return loansService.fetchProduct(id); }
	 * 
	 * @PutMapping("/update/{id}") public Loans updateProduct(@PathVariable Integer
	 * id,@RequestBody Loans product) { return
	 * loansService.updateProduct(id,product); }
	 * 
	 * @DeleteMapping("/delete/{id}") public void
	 * deleteProduct(@PathVariable(value="id") Integer productId) {
	 * loansService.deleteProduct(productId); }
	 */
	
	 @GetMapping("/fetch/{customerId}")
	 public List<Loans> fetchLoansDetails(@PathVariable("customerId") int customerId) { 
		 log.info("loans controler ->fetchLoansDetails{}",customerId);
		 
		 List<Loans> loans = loansRepository.findByCustomerId(customerId);
		 if(loans!=null) {
			 return loans;
		 }
		 else {
			 return null;
		 }
	 }
}

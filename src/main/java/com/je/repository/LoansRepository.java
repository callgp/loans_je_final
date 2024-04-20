package com.je.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.je.entities.Loans;


@Repository //optional
public interface LoansRepository extends JpaRepository<Loans, Integer>{

	//List<Loans> findByCustomerId(int customerId);

	List<Loans> findByCustomerId(int customerId);

}
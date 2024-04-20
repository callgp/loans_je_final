package com.je.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Loans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanNumber;
	private Integer customerId;
	private Date startDt;
	private String loanType;
	private Integer totalLoan;
	private Integer amountPaid;
	private Integer outstandingAmount;
	private String createDt;
}
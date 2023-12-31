package com.bank.loans.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bank.loans.model.Customer;

@Repository
public interface LoanDAO{

	List<Customer> getReportByLoanType(String loanType);

	Integer checkLoanAllotment(Integer customerId);

	Integer sanctionLoan(Customer customer);

}

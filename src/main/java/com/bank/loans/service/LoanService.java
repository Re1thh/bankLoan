package com.bank.loans.service;

import java.util.List;

import com.bank.loans.model.Customer;

public interface LoanService {

	Integer sanctionLoan(Customer customer) throws Exception;

	List<Customer> getReportByLoanType(String loanType) throws Exception;

}

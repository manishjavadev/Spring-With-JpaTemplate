package com.manish.javadev.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.manish.javadev.dao.CustomerDAO;
import com.manish.javadev.model.Customer;
import com.manish.javadev.to.CustomerTO;

@SuppressWarnings("unchecked")
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	JpaTemplate jpaTemplate;

	@Autowired
	JpaTransactionManager jpaTxnManager;

	public void addCustomer(CustomerTO cto) {
		TransactionDefinition txnDef = new DefaultTransactionDefinition();
		TransactionStatus txnStatus = jpaTxnManager.getTransaction(txnDef);

		Customer cust = new Customer("Manish", "Srivastava", 27, "LKO");

		jpaTemplate.persist(cust);

	}

	public void updateCustomer(int custId) {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub

	}

	public List<CustomerTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public CustomerTO getCustomerById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}

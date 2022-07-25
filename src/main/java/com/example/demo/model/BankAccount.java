package com.example.demo.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class BankAccount {
	@Id
	private String accountID;
	private String name, address, phone;
	@PrePersist
	public void generatePrimaryKey()
	{
		this.accountID=UUID.randomUUID().toString();
	}
}

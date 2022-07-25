package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumbers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long phoneID;
	private String phoneNumber;
	@Enumerated(EnumType.STRING)
	private PhoneType phoneType;
	//@OneToMany(mappedBy = "Person")
	@ManyToOne
	private Person person;

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Long getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(Long phoneID) {
		this.phoneID = phoneID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	String type;
	public String getType() {
		
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoneID == null) ? 0 : phoneID.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumbers other = (PhoneNumbers) obj;
		if (phoneID == null) {
			if (other.phoneID != null)
				return false;
		} else if (!phoneID.equals(other.phoneID))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PhoneNumbers [phoneID=" + phoneID + ", phoneNumber=" + phoneNumber + ", type=" + type + "]";
	}
	
	
	

}

package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Project {
	@Id
	@GeneratedValue
	private Long projID;
	private String projName,location;
	@ManyToMany
	private Set<Person> employess;
	public Long getProjID() {
		return projID;
	}
	public void setProjID(Long projID) {
		this.projID = projID;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Person> getEmployess() {
		return employess;
	}
	public void setEmployess(Set<Person> employess) {
		this.employess = employess;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employess == null) ? 0 : employess.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((projID == null) ? 0 : projID.hashCode());
		result = prime * result + ((projName == null) ? 0 : projName.hashCode());
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
		Project other = (Project) obj;
		if (employess == null) {
			if (other.employess != null)
				return false;
		} else if (!employess.equals(other.employess))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (projID == null) {
			if (other.projID != null)
				return false;
		} else if (!projID.equals(other.projID))
			return false;
		if (projName == null) {
			if (other.projName != null)
				return false;
		} else if (!projName.equals(other.projName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [projID=" + projID + ", projName=" + projName + ", location=" + location + ", employess="
				+ employess + "]";
	}
	

}

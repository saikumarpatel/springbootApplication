package com.example.demo.model;

import java.util.Objects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOHITHA_BOOK")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SERIAL_NUMBER")
	private Integer bokkID;
	@Column(name = "BOOK_NAME")
	private String bookTitle;
	@Column(name = "UNIQUE_SERIAL_NUMBER", nullable = true)
	private String ISBN;

	public Integer getBokkID() {
		return bokkID;
	}

	public void setBokkID(Integer bokkID) {
		this.bokkID = bokkID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN, bokkID, bookTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(bokkID, other.bokkID)
				&& Objects.equals(bookTitle, other.bookTitle);
	}

	@Override
	public String toString() {
		return "Book [bokkID=" + bokkID + ", bookTitle=" + bookTitle + ", ISBN=" + ISBN + "]";
	}

}

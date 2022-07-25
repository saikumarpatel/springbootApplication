package com.example.demo.res_controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepository;

@RestController
@RequestMapping("/book")
public class BookRestController {
@Autowired
private BookRepository bookRepository;
@GetMapping("/lo")
public List<Book>listBooks()
{
	return bookRepository.findAll();
}
@PostMapping("/loh")
public Book addBook(@RequestBody Book book)
{
	return bookRepository.save(book);
}
@PutMapping("/put")
public Book updateBook(@RequestBody Book book)
{
	return bookRepository.save(book);
}
@DeleteMapping("/del")
public String deleteBook(@RequestBody Book book)
{
	bookRepository.delete(book);
	return "Delete "+book;
	
}
}

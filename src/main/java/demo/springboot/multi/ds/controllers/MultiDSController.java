package demo.springboot.multi.ds.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springboot.multi.ds.models.Book;
import demo.springboot.multi.ds.models.User;
import demo.springboot.multi.ds.service.MultiDSService;

@RestController
public class MultiDSController {

	@Autowired
	private MultiDSService multiDSService;
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return multiDSService.getAllUsers();
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return multiDSService.getAllBooks();
	}
}

package demo.springboot.multi.ds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.springboot.multi.ds.models.Book;
import demo.springboot.multi.ds.models.User;
import demo.springboot.multi.ds.repos.BookRepository;
import demo.springboot.multi.ds.repos.UserRepository;

@Service
public class MultiDSService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}

package demo.springboot.multi.ds;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import demo.springboot.multi.ds.models.Book;
import demo.springboot.multi.ds.models.User;
import demo.springboot.multi.ds.repos.BookRepository;
import demo.springboot.multi.ds.repos.UserRepository;

@SpringBootApplication
public class SpringBootMultiDSApplication {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void addData2DB() {
		userRepository.saveAll(Stream.of(new User(744, "John"), new User(455, "Pitter")).collect(Collectors.toList()));
		bookRepository.saveAll(
				Stream.of(new Book(111, "Core Java"), new Book(222, "Spring Boot")).collect(Collectors.toList()));
	
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultiDSApplication.class, args);
	}
}

package demo.springboot.multi.ds.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.springboot.multi.ds.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}

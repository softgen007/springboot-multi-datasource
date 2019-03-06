package demo.springboot.multi.ds.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.springboot.multi.ds.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

package br.com.springboot.poc.repository;

import br.com.springboot.poc.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}

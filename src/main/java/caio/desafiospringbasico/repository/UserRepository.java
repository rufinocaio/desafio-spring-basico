package caio.desafiospringbasico.repository;

import caio.desafiospringbasico.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface UserRepository extends CrudRepository<User, Long> {
}

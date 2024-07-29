package caio.desafiospringbasico;

import caio.desafiospringbasico.model.User;
import caio.desafiospringbasico.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Caio");
        user.setEmail("caiiofr@outlook.com.br");
        user.setPassword("123456");

        userRepository.save(user);

        System.out.println("Usuário salvo: " + userRepository.findAll());

    }
}

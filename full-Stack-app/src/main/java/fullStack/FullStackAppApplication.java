package fullStack;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import model.User;
import repository.UserRepository;

@SpringBootApplication
@ComponentScan(basePackages= {"fullStack","model","controller","repository"})
public class FullStackAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FullStackAppApplication.class, args);
	}
    @Autowired
	private UserRepository userRepository;
    
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Samuel","Ayalew","samuel.ayalew@gmail.com"));
		this.userRepository.save(new User("Yisak","Gursha","yisak.gursha@gmail.com"));
		this.userRepository.save(new User("Mubarek","Husein","mubarek.husein@gmail.com"));
		
	}

}

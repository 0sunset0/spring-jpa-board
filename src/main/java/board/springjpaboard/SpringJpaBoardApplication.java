package board.springjpaboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class SpringJpaBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaBoardApplication.class, args);
	}
}

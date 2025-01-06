package ec.edu.ucacue.practicas.practicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
// @SpringBootApplication(scanBasePackages =
// "ec.edu.ucacue.practicas.practicas")
// @EnableJpaRepositories(basePackages =
// "ec.edu.ucacue.practicas.practicas.repository")
public class PracticasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticasApplication.class, args);

	}

}

package ec.edu.ucacue.practicas.practicas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ec.edu.ucacue.practicas.practicas.models.Producto;
import ec.edu.ucacue.practicas.practicas.repository.ProductoRepository;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initDatabase(ProductoRepository productoRepository) {
        return args -> {
            if (productoRepository.count() > 0) {
                return;
            }
            productoRepository.save(new Producto(null, "Galleta 1", 10.0));
            productoRepository.save(new Producto(null, "Pan", 20.0));
            productoRepository.save(new Producto(null, "Cola", 30.0));
        };
    }
}

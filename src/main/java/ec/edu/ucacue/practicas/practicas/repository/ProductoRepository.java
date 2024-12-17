package ec.edu.ucacue.practicas.practicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.ucacue.practicas.practicas.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}

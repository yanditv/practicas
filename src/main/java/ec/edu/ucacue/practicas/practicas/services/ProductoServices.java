package ec.edu.ucacue.practicas.practicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.ucacue.practicas.practicas.models.Producto;
import ec.edu.ucacue.practicas.practicas.repository.ProductoRepository;

@Service
public class ProductoServices {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

}

package ec.edu.ucacue.practicas.practicas.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.ucacue.practicas.practicas.models.Producto;
import ec.edu.ucacue.practicas.practicas.services.ProductoServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoController {

    @Autowired
    private ProductoServices productoServices;

    @GetMapping
    public List<Producto> listarUsuarios() {
        return productoServices.obtenerTodosLosProductos();
    }

    @PostMapping
    public Producto crearUsuario(@RequestBody Producto producto) {
        return productoServices.crearProducto(producto);
    }
}

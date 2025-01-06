package ec.edu.ucacue.practicas.practicas.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.ucacue.practicas.practicas.models.Producto;
import ec.edu.ucacue.practicas.practicas.services.ProductoServices;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/producto")
@Tag(name = "Producto", description = "API de productos")
public class ProductoController {

    @Autowired
    private ProductoServices productoServices;

    @GetMapping
    public List<Producto> listar() {
        return productoServices.obtenerTodosLosProductos();
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return productoServices.crearProducto(producto);
    }

    @PutMapping()
    public String update(@RequestBody Producto producto) {
        return productoServices.actualizarProducto(producto).toString();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        productoServices.eliminarProductoPorId(id);
        return "Producto eliminado";
    }

}

package com.murillo.retobusapicrud.controller;

import com.murillo.retobusapicrud.entity.Marca;
import com.murillo.retobusapicrud.service.MarcaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping
    public List<Marca> obtenerTodas() {
        return marcaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Marca> obtenerPorId(@PathVariable Long id) {
        return marcaService.obtenerPorId(id);
    }

    @PostMapping("/guardar")
    public Marca guardar(@RequestBody Marca marca) {
        return marcaService.guardar(marca);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        marcaService.eliminar(id);
    }
}
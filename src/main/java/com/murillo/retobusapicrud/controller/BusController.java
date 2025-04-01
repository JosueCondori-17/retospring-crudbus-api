package com.murillo.retobusapicrud.controller;

import com.murillo.retobusapicrud.entity.Bus;
import com.murillo.retobusapicrud.service.BusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/buses")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<Bus> obtenerTodos() {
        return busService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Bus> obtenerPorId(@PathVariable Long id) {
        return busService.obtenerPorId(id);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Bus> guardarBus(@RequestBody Bus bus) {
        Bus nuevoBus = busService.guardar(bus);
        return ResponseEntity.ok(nuevoBus);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Bus> editarBus(@PathVariable Long id, @RequestBody Bus bus){
        return busService.obtenerPorId(id)
                .map(b -> {
                    b.setNumeroBus(bus.getNumeroBus());
                    b.setPlaca(bus.getPlaca());
                    b.setFechaCreacion(bus.getFechaCreacion());
                    b.setCaracteristicas(bus.getCaracteristicas());
                    b.setActivo(bus.isActivo());
                    b.setMarca(bus.getMarca());
                    return ResponseEntity.ok(busService.guardar(b));
                }).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        busService.eliminar(id);
    }
}
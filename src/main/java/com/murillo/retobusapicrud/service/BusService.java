package com.murillo.retobusapicrud.service;
import com.murillo.retobusapicrud.entity.Bus;
import com.murillo.retobusapicrud.repository.BusRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> obtenerTodos() {
        return busRepository.findAll();
    }

    public Optional<Bus> obtenerPorId(Long id) {
        return busRepository.findById(id);
    }

    public Bus guardar(Bus bus) {
        return busRepository.save(bus);
    }

    public void eliminar(Long id) {
        busRepository.deleteById(id);
    }
}
package com.murillo.retobusapicrud.repository;
import com.murillo.retobusapicrud.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
package com.murillo.retobusapicrud.repository;
import com.murillo.retobusapicrud.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
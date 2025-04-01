package com.murillo.retobusapicrud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_bus")
    @JsonProperty("numero_bus")
    private int numeroBus;

    private String placa;

    @Column(name = "fecha_creacion")
    @JsonProperty("fecha_creacion")
    private LocalDateTime fechaCreacion;

    @PrePersist
    protected void prePersist() {
        if (this.fechaCreacion == null) {
            this.fechaCreacion = LocalDateTime.now();
        }
    }

    private String caracteristicas;

    @ManyToOne // para mi relación de muchos a uno
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    private boolean activo;

    public Bus() {}

    public Bus(int numeroBus, String placa, LocalDateTime fechaCreacion, String caracteristicas, Marca marca, boolean activo) {
        this.numeroBus = numeroBus;
        this.placa = placa;
        this.fechaCreacion = fechaCreacion;
        this.caracteristicas = caracteristicas;
        this.marca = marca;
        this.activo = activo;
    }

    public Long getId() { return id; }

    public int getNumeroBus() { return numeroBus; }

    public void setNumeroBus(int numeroBus) { this.numeroBus = numeroBus; }

    public String getPlaca() { return placa; }

    public void setPlaca(String placa) { this.placa = placa; }

    public LocalDateTime getFechaCreacion() { return fechaCreacion; }

    public void setFechaCreacion(LocalDateTime fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public String getCaracteristicas() { return caracteristicas; }

    public void setCaracteristicas(String caracteristicas) { this.caracteristicas = caracteristicas; }

    public Marca getMarca() { return marca; }

    public void setMarca(Marca marca) { this.marca = marca; }

    public boolean isActivo() { return activo; }

    public void setActivo(boolean activo) { this.activo = activo; }
}

package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Modelo.MFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IFactura extends JpaRepository<MFactura, Integer> {
    //busqueda por fecha
    List<MFactura> findByFecha (LocalDate fecha);
}

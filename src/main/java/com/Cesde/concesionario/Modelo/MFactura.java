package com.Cesde.concesionario.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "factura")
public class MFactura {
    // Atributos
   @Id
   private Integer codfactura;
   @Column(nullable = false)
   private LocalDate fecha;
   @Column(length = 15,nullable = false)
   private String idcliente;
   @Column(nullable = false)
   private Boolean activc;

   // Relaciones entre tablas factura y clientes
  /*  @ManyToOne
    @JoinColumn(name = "pkfactura",referencedColumnName = "idcliente")
    @JsonBackReference
    private MCliente cliente;

    // Relaciones entre tablas factura y vehiculofactura
    @OneToMany(mappedBy = "factura")
    @JsonManagedReference
    private List<MVehiculoFactura> vehiculoFacturas; */

    // Constructores
    public MFactura(Integer codfactura, LocalDate fecha, String idcliente, Boolean activc) {
        this.codfactura = codfactura;
        this.fecha = fecha;
        this.idcliente = idcliente;
        this.activc = activc;
    }
    public MFactura() {
    }

    // Encapsulamiento
    public Integer getCodfactura() {
        return codfactura;
    }
    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public Boolean getActivc() {
        return activc;
    }
    public void setActivc(Boolean activc) {
        this.activc = activc;
    }
}

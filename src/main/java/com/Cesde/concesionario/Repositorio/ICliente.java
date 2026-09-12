package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Dto.FacturasClienteDto;
import com.Cesde.concesionario.Modelo.MCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICliente extends JpaRepository<MCliente,String> {

List<MCliente> findByNomcliente(String nomcliente);

//buscar las facturas con su codigo de factura, fecha, identificacion del cliente, nombre del cliente y el telefono
    @Query(value = "select F.codfactura,F.fecha,F.idcliente  " +
            "c.nomcliente, c.telcliente from cliente C inner join factura F" +
            " on c.idcliente=F.idcliente where F.idcliente=:idcliente",nativeQuery = true)
    //metodo para consumir la consulta
    List<FacturasClienteDto> buscarFacturasCliente(@Param("idcliente") String idcliente);
}

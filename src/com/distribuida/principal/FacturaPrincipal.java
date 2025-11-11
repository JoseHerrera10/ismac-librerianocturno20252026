package com.distribuida.principal;

import com.distribuida.beans.Cliente;
import com.distribuida.beans.Factura;

import java.util.Date;

public class FacturaPrincipal {

    public static void  main(String[] args) {




    Cliente cliente = new Cliente(1,"1727960476","juan","taipe","Av. tumbaco","0998385513","Jtaipe@gmail.com");
        Factura factura =new Factura();

        factura.setIdFactura (1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);

        factura.setCliente(cliente);
        System.out.println(factura.toString());


    }
}

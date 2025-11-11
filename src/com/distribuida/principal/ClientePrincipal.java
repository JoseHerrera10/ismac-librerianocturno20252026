package com.distribuida.principal;

import com.distribuida.beans.Cliente;

public class ClientePrincipal {

    public static void  main(String []args){

        Cliente cliente = new Cliente(1,"1727960476","juan","taipe","Av. tumbaco","0998385513","Jtaipe@gmail.com");
        System.out.println(cliente.toString());

    }



}

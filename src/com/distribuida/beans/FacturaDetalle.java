package com.distribuida.beans;

public class FacturaDetalle {

    private int idFacturaDetalle;
    private  int cantidad;
    private Double iva;

     private Factura factura;
     private Libro libro;
     public FacturaDetalle(){}

    public FacturaDetalle(int idFacturaDetalle, int cantidad, Double iva, Factura factura) {
        this.idFacturaDetalle = idFacturaDetalle;
        this.cantidad = cantidad;
        this.iva = iva;
        this.factura = factura;
    }

    public int getIdFacturaDetalle() {
        return idFacturaDetalle;
    }

    public void setIdFacturaDetalle(int idFacturaDetalle) {
        this.idFacturaDetalle = idFacturaDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "idFacturaDetalle=" + idFacturaDetalle +
                ", cantidad=" + cantidad +
                ", iva=" + iva +
                '}';
    }
}

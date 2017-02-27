/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author Estudiante
 */
public class Factura {
private int numero;
private String cliente;
private String Fecha;
private venta venta;
private pago pago;

public double Total(){
return this.venta.Subtotal();}

    public Factura(int numero, String cliente, String Fecha, venta venta, pago pago) {
        this.numero = numero;
        this.cliente = cliente;
        this.Fecha = Fecha;
        this.venta = venta;
        this.pago = pago;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public venta getVenta() {
        return venta;
    }

    public void setVenta(venta venta) {
        this.venta = venta;
    }

    public pago getPago() {
        return pago;
    }

    public void setPago(pago pago) {
        this.pago = pago;
    }

    /**
     * @param args the command line arguments
     */
   
    
}

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
public class main {
 public static void main(String[] args) {
   pago pago = new pago ("E","en efectivo");
   producto producto =new producto ("agua", 123,1000);
   venta venta = new venta (2, producto);
   Factura factura = new Factura (1, "fag", "22/02/17", venta, pago);
   System.out.println("pago total="+ factura.Total());
    }    
}

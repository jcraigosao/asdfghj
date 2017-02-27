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
public class pago {
private String TipoDePago;
private String Descripcion;

    public pago(String TipoDePago, String Descripcion) {
        this.TipoDePago = TipoDePago;
        this.Descripcion = Descripcion;
    }

    public String getTipoDePago() {
        return TipoDePago;
    }

    public void setTipoDePago(String TipoDePago) {
        this.TipoDePago = TipoDePago;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}

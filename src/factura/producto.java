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
public class producto {
private String name;
private int Referencia;
private double Precio;

    public producto(String name, int Referencia, double Precio) {
        this.name = name;
        this.Referencia = Referencia;
        this.Precio = Precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReferencia() {
        return Referencia;
    }

    public void setReferencia(int Referencia) {
        this.Referencia = Referencia;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

}

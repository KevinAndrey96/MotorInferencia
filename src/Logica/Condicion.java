/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Kevin
 */
public class Condicion {
     private String Atributo="";
    private int Valor= 0;
    private String Descripcion="";

    public Condicion(String Atributo, int Valor, String Descripcion) {
        this.Atributo=Atributo;
        this.Valor=Valor;
        this.Descripcion=Descripcion;
    }

    @Override
    public String toString() {
        return "Condicion{" + "Atributo=" + Atributo + ", Valor=" + Valor + ", Descripcion=" + Descripcion + '}';
    }
    

    public String getAtributo() {
        return Atributo;
    }

    public int getValor() {
        return Valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setAtributo(String Atributo) {
        this.Atributo = Atributo;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}

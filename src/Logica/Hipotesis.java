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
public class Hipotesis {
    private String Atributo="";
    private int Valor= 0;
    private String Descripcion="";
    private int Regla=0;

    public int getRegla() {
        return Regla;
    }

    public void setRegla(int Regla) {
        this.Regla = Regla;
    }
    

  /*  public Hipotesis(String Atributo, int Valor, String Descripcion) {
        this.Atributo=Atributo;
        this.Valor=Valor;
        this.Descripcion=Descripcion;
    }
*/
    public Hipotesis() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return  Atributo + "-" + Valor + "-" + Descripcion;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ortiz PC
 */
public class Hipotesis {
    
    
   public String Atributo,valor,descripcion;
   public int Regla_No;

    public Hipotesis(String Atributo, String valor, String descripcion, int Regla_No) {
        this.Atributo = Atributo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.Regla_No = Regla_No;
    }

    public Hipotesis() {
    
        
        this.Atributo = "";
        this.valor = "";
        this.descripcion = "";
        this.Regla_No = 0;
    }

    public String getAtributo() {
        return Atributo;
    }

    public void setAtributo(String Atributo) {
        this.Atributo = Atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRegla_No() {
        return Regla_No;
    }

    public void setRegla_No(int Regla_No) {
        this.Regla_No = Regla_No;
    }

    @Override
    public String toString() {
        return "-----Hipotesis---" 
                + "\nAtributo=" + Atributo 
                + "\nValor=" + valor 
                + "\nDescripcion=" + descripcion 
                + "\nRegla_No=" + Regla_No ;
    }
   
    
   
   
   
            
     
    
}

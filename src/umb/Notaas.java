/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umb;

/**
 *
 * @author PC
 */
public class Notaas {

    public String getNota_corte1() {
        return nota_corte1;
    }

    public void setNota_corte1(String nota_corte1) {
        this.nota_corte1 = nota_corte1;
    }

    public String getNota_corte2() {
        return nota_corte2;
    }

    public void setNota_corte2(String nota_corte2) {
        this.nota_corte2 = nota_corte2;
    }
    
String nota_corte1, nota_corte2;
int defini;
String suma2;

    public String getSuma2() {
        return suma2;
    }

    public void setSuma2(String suma2) {
        this.suma2 = suma2;
    }

    public int getDefini() {
        return defini;
    }

    public void setDefini(int defini) {
        this.defini = defini;
    }
    
    
     public Notaas(String nota_corte1, String nota_corte2) {
        this.nota_corte1 = nota_corte1;
        this.nota_corte2 = nota_corte2;
         /* defini = Integer.parseInt(nota_corte1) + Integer.parseInt(nota_corte2);*/
    suma2 = String.valueOf(Integer.parseInt(nota_corte1) + Integer.parseInt(nota_corte2));
      
  
  
   
         
        
       
    }
    @Override
    public String toString() {
        return "Notaas{" + "nota_corte1=" + nota_corte1 + ", nota_corte2=" + nota_corte2 + ", suma2=" + suma2 +  '}';
    }
   
}


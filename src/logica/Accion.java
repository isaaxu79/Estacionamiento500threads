/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Isaac A. Marin
 */
public class Accion {
    public String val;
    public String color;
    public int pos;
    private String colores[]=new String[5];
    
    public Accion(){
        colores[0]="red";
        colores[1]="morado";
        colores[2]="amarillo";
        colores[3]="naranja";
        colores[4]="verde";
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getColor() {
        int numAleatorio=(int)(Math.random()*4);
        return colores[numAleatorio];
        
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
}

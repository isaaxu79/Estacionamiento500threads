/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Isaac A. Marin
 */
public class Recurso {
    Semaphore puertaE;
    Semaphore puertaS;
    Semaphore mutex;
    Semaphore salida;
    boolean posiciones[];
    int numAutoEntrada;
    int numAutoSalida;
    int inStation;
    int salieron;
    public Recurso(){
        this.puertaE = new Semaphore(1);
        this.puertaS = new Semaphore(0);
        this.mutex = new Semaphore(1);
        this.salida = new Semaphore(1);
        this.posiciones = new boolean[10];
        this.numAutoEntrada = 0;
        this.numAutoSalida = 0;
        this.inStation = 0;
        this.salieron = 0;
        iniciar();
    }

    private void iniciar() {
        for (int i = 0; i < 10; i++) {
            posiciones[i]=true;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Isaac A. Marin
 */
public class Lanzador {
    
    int hilos;
    Recurso recurso = new Recurso();
    Observer o;
    public Lanzador(int hilos, Observer obsrvr){
        this.hilos=hilos;
        o= obsrvr;
    }
    
    public void init() throws InterruptedException{

        for (int i = 0; i < 500; i++) {
            Carro car = new Carro(recurso,i,o);
            Thread control = new Thread(car);
            //control.se}
            control.start();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import static java.lang.Thread.sleep;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac A. Marin
 */
public class Carro extends Observable implements Runnable {

    Recurso r;
    int id;
    boolean x =true;
    int i =0;
    
    public Carro(Recurso r, int ind, Observer obsrvr){
        this.r = r;
        id=ind;
        addObserver(obsrvr);
    }
    
    @Override
    public void run() {
        try {
            r.puertaE.acquire();
            r.numAutoEntrada++;
            r.puertaE.release();
            sleep(100);
            System.out.println("Un carro "+id +" entro al estacionamiento pero no se a estacionado");
            r.mutex.acquire();
            while(x){
                if(r.posiciones[i] == true){
                    r.posiciones[i] = false;
                    Accion a = new Accion();
                    a.setVal("p");
                    a.setPos(i);
                    this.setChanged();
                    this.notifyObservers(a);
                    r.inStation++;
                    a = new Accion();
                    a.setVal("conE");
                    a.setPos(r.inStation);
                    this.setChanged();
                    this.notifyObservers(a);
                    r.mutex.release();
                    System.out.println("carro "+id+ " se estaciono en "+i);
                    break;
                    
                }else{
                    i++;
                }
                if(i==10){
                    i=0;
                }
            }
            sleep(5000);
        
            r.salida.acquire();
            if(r.numAutoSalida ==0){
                r.numAutoSalida++;
                r.numAutoEntrada--;
                r.puertaE.acquire();
                r.puertaS.release();
            }else{
                r.numAutoSalida++;
            }
            r.salida.release();
        
            r.puertaS.acquire();
            if(r.numAutoSalida == 1){
                r.numAutoSalida--;
                System.out.println("carro "+id+" saliendo ultimo");
                r.posiciones[i] = true;
                Accion a = new Accion();
                    a.setVal("s");
                    a.setPos(i);
                    this.setChanged();
                    this.notifyObservers(a);
                r.salieron++;
                a = new Accion();
                    a.setVal("sal");
                    a.setPos(r.salieron);
                    this.setChanged();
                    this.notifyObservers(a);
                r.puertaE.release();
            }else{
                r.numAutoSalida--;
                r.posiciones[i] = true;
                Accion a = new Accion();
                    a.setVal("s");
                    a.setPos(i);
                    this.setChanged();
                    this.notifyObservers(a);
                System.out.println("carro "+id+" saliendo");
                r.salieron++;
                a = new Accion();
                    a.setVal("sal");
                    a.setPos(r.salieron);
                    this.setChanged();
                    this.notifyObservers(a);
                r.puertaS.release();
            }
            sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void proceso() throws InterruptedException {
        
        
    }
    
}

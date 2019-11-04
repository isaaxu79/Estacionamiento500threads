/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamientoc;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import logica.Accion;
import logica.Carro;
import logica.Lanzador;
import logica.Recurso;

/**
 *
 * @author Isaac A. Marin
 */
public class FXMLDocumentController implements Initializable, Observer  {
    
    @FXML
    private Rectangle p1;
    @FXML
    private Rectangle p2;
    @FXML
    private Rectangle p3;
    @FXML
    private Rectangle p4;
    @FXML
    private Rectangle p5;
    @FXML
    private Rectangle p6;
    @FXML
    private Rectangle p7;
    @FXML
    private Rectangle p8;
    @FXML
    private Rectangle p9;
    @FXML
    private Rectangle p10;
    @FXML
    private Button start;
    @FXML
    private Button sal;
    @FXML
    private Button ent;
    @FXML
    private Label contadorE;
    @FXML
    private Label contadorS;
    
    Recurso recurso = new Recurso();
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void update(Observable o, Object o1) {
        Platform.runLater(new Runnable(){
            @Override
            public void run() {
                Accion a = (Accion)o1;
                if(a.getVal().equals("p")){
                    change(a.getPos(), a.getColor());                    
                }else if(a.getVal().equals("s")){
                    salida(a.getPos());
                }else if(a.getVal().equals("conE")){
                    contadorE.setText(String.valueOf(a.getPos()));
                }else if(a.val.equals("sal")){
                    contadorS.setText(String.valueOf(a.getPos()));
                }
            }
        
        });
    }
    
    @FXML
    private void begin(ActionEvent event) throws InterruptedException {
        start.setDisable(true);
        Lanzador n = new Lanzador(30,this);
        n.init();
    }

    private void change(int pos, String c) {
        switch(pos){
            case 0:
                if(c.equals("red")){
                    p1.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p1.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p1.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p1.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p1.setFill(Color.GREEN);
                }
                break;
            case 1:
                if(c.equals("red")){
                    p2.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p2.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p2.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p2.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p2.setFill(Color.GREEN);
                }
                break;
            case 2:
                if(c.equals("red")){
                    p3.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p3.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p3.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p3.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p3.setFill(Color.GREEN);
                }
                break;
            case 3:
                if(c.equals("red")){
                    p4.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p4.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p4.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p4.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p4.setFill(Color.GREEN);
                }
                break;
            case 4:
                if(c.equals("red")){
                    p5.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p5.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p5.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p5.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p5.setFill(Color.GREEN);
                }
                break;
            case 5:
                if(c.equals("red")){
                    p6.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p6.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p6.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p6.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p6.setFill(Color.GREEN);
                }
                break;
            case 6:
                if(c.equals("red")){
                    p7.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p7.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p7.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p7.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p7.setFill(Color.GREEN);
                }
                break;
            case 7:
                if(c.equals("red")){
                    p8.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p8.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p8.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p8.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p8.setFill(Color.GREEN);
                }
                break;
            case 8:
                if(c.equals("red")){
                    p9.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p9.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p9.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p9.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p9.setFill(Color.GREEN);
                }
                break;
            case 9:
                if(c.equals("red")){
                    p10.setFill(Color.RED);
                }else if(c.equals("morado")){
                    p10.setFill(Color.VIOLET);
                }else if(c.equals("amarillo")){
                    p10.setFill(Color.YELLOW);
                }else if(c.equals("naranja")){
                    p10.setFill(Color.ORANGE);
                }else if(c.equals("verde")){
                    p10.setFill(Color.GREEN);
                }
                break;
        }
    }
    
    private void salida(int pos){
        switch(pos){
            case 0:
                p1.setFill(Color.GREY);
                break;
            case 1:
                p2.setFill(Color.GREY);
                break;
            case 2:
                p3.setFill(Color.GREY);
                break;
            case 3:
                p4.setFill(Color.GREY);
                break;
            case 4:
                p5.setFill(Color.GREY);
                break;
            case 5:
                p6.setFill(Color.GREY);
                break;
            case 6:
                p7.setFill(Color.GREY);
                break;
            case 7:
                p8.setFill(Color.GREY);
                break;
            case 8:
                p9.setFill(Color.GREY);
                break;
            case 9:
                p10.setFill(Color.GREY);
                break;
        }
    }
    
}

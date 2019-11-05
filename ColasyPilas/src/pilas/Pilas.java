/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pila=new  int [10];
       pila objctopilaenteros = new pila (pila);
       int op=3;
       //agregamos (operacion push )elementos  a la pila de datos 
       //el fondo fr la pila seria 90 y la sima 12
    objctopilaenteros.insertar(90);
    objctopilaenteros.insertar(56);
    objctopilaenteros.insertar(23);
    objctopilaenteros.insertar(12);
    
    while (op!=6)
    {
        JOptionPane.showInputDialog("1.- insertar  \n"+"2.- Retitar \n"
                + "3.- mostrar \n"
                + "4.-Cima \n"
                + "5.-fondo \n");
        switch (op){
            case 1:
              objctopilaenteros.insertar(89);
                objctopilaenteros.insertar(20);
                break;
            case 2:
                objctopilaenteros.retirar();
                break;
            case 3:
                objctopilaenteros.mostrarPila();
                break;
            case 4:
                   objctopilaenteros.cima();
                break;
            case 5:
                objctopilaenteros.fondo();
                break;
            
                        
        }
        
    }
    }
    
}

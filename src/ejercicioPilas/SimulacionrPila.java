/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package ejercicioPilas;

import java.util.Arrays;

/**
 * Clase que me permite verifiar 
 * @author Romero
 */
public class SimulacionrPila {
    public static void main(String[] args) {
        MiStack miPila= new MiStack(4);
        miPila.push("Uno");
        miPila.push("Dos");
        miPila.push("Tres");
        
        System.out.println("Valor que esta en el tope "+
                miPila.peek());
        miPila.pop();
        
        System.out.println("Todos los valores "+
                Arrays.toString(miPila.viewStack()));
        
    }
}

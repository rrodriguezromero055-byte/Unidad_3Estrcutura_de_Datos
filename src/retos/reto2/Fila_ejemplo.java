/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;

/**
 * Programa que simula una fila de un servicio, solo que con cosas distintas 
 * @author Romero
 */
import java.util.Scanner;
public class Fila_ejemplo {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("TORTILLERIA TEC");
        Persona inicioFila = null;
        Persona finFila = null;

        do {
            System.out.println("1) Agregar cliente a la fila");
            System.out.println("2) Atender cliente");
            System.out.println("3) Cliente sale de la fila");
            System.out.println("4) Imprimir fila normal");
            System.out.println("5) Imprimir fila en orden inverso");
            System.out.println("6) Terminar servicio");
            System.out.print("Selecciona una opcion: ");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre: ");
                    String nombre = leer.nextLine();
                    Persona personaNueva = new Persona();
                    personaNueva.nombre = nombre;

                    if (inicioFila == null) { // lista vacía
                        inicioFila = personaNueva;
                        finFila = personaNueva;
                    } else {
                        personaNueva.vieneAtras = inicioFila;
                        inicioFila.vieneAdelante = personaNueva;
                        inicioFila = personaNueva;
                    }
                    System.out.println("Cliente agregado al inicio.");
                    break;
                case 2:
                      // Atender al cliente del frente
                    if (inicioFila != null) {
                        System.out.println("Atendiendo a: " + inicioFila.nombre);
                        inicioFila = inicioFila.vieneAtras;
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }

                    imprimirLista(inicioFila);
                    break;
                case 3:
                   if (inicioFila == null) {
                       System.out.println("No hay clientes en la fila.");
                       break;
                    }

                       System.out.print("Ingresa el nombre del cliente que salio: ");
                       String atender = leer.nextLine();
                       Persona actual = inicioFila;

                       // Buscamos el cliente con ese nombre
                       while (actual != null && !actual.nombre.equals(atender)) {
                           actual = actual.vieneAtras;
                    }

                       if (actual == null) {
                        System.out.println("No se encontró el cliente: " + atender);
                    } else {
                       System.out.println("Atendiendo a: " + actual.nombre);

                       // Si es el primero
                       if (actual == inicioFila) {
                       inicioFila = inicioFila.vieneAtras;
                       if (inicioFila != null)
                       inicioFila.vieneAdelante = null;
                       else
                       finFila = null;
                    }
                      // Si es el último
                      else if (actual == finFila) {
                        finFila = finFila.vieneAdelante;
                      if (finFila != null)
                       finFila.vieneAtras = null;
                    }
                     // Si está en medio
                     else {
                      actual.vieneAdelante.vieneAtras = actual.vieneAtras;
                      actual.vieneAtras.vieneAdelante = actual.vieneAdelante;
                    }
                }
                    break;
                case 4:
                     System.out.println("=== Clientes en la fila ===");
                    imprimirLista(inicioFila);
                    break;
                case 5: 
                 System.out.println("=== Clientes en orden inverso ===");
                    imprimirListaInversa(finFila);
                    break;   
                case 6: 
                    int contador=0;
                    while (inicioFila !=null){
                        contador ++;
                        inicioFila=inicioFila.vieneAtras;
                    }
                    System.out.println("Servicio terminado, personas "
                            + "sin atdender: " +contador);
                    break;
             
            }

        } while (opcion != 6);

        
    }
    public static void imprimirLista(Persona persona){
        if(persona != null){
            System.out.println(persona.nombre);
            imprimirLista(persona.vieneAtras);
        }
    }
    public static void imprimirListaInversa(Persona persona) {
        while (persona != null) {
            System.out.println(persona.nombre);
            persona = persona.vieneAdelante;
        }
    }
}
class Persona{
    String nombre;
    Persona vieneAtras;
    Persona vieneAdelante;
}

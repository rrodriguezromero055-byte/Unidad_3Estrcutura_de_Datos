/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;

/**
 *
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
            System.out.println("4) Terminar servicio");
            System.out.println("5) Imprimir fila normal");
            System.out.println("6) Imprimir fila en orden inverso");
            System.out.println("7) Terminar servicio");
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
                    System.out.print("Ingresa el nombre: ");
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

                       System.out.print("Ingresa el nombre del cliente a atender: ");
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
                     if (inicioFila == null) {
                        System.out.println("No hay clientes para eliminar.");
                        break;
                    }

                    System.out.print("Ingresa el nombre del cliente a eliminar: ");
                    String eliminar = leer.nextLine();
                    Persona buscado = inicioFila;

                    while (buscado != null && !buscado.nombre.equals(eliminar)) {
                        buscado = buscado.vieneAtras;
                    }

                    if (buscado == null) {
                        System.out.println("Cliente no encontrado.");
                    } else {
                        if (buscado == inicioFila) {
                            inicioFila = inicioFila.vieneAtras;
                            if (inicioFila != null)
                                inicioFila.vieneAdelante = null;
                        } else if (buscado == finFila) {
                            finFila = finFila.vieneAdelante;
                            if (finFila != null)
                                finFila.vieneAtras = null;
                        } else {
                            buscado.vieneAdelante.vieneAtras = buscado.vieneAtras;
                            buscado.vieneAtras.vieneAdelante = buscado.vieneAdelante;
                        }
                        System.out.println("Cliente eliminado: " + eliminar);
                    }
                    break;

                case 5:
                     System.out.println("=== Clientes en la fila ===");
                    imprimirLista(inicioFila);
                    break;
                case 6: 
                 System.out.println("=== Clientes en orden inverso ===");
                    imprimirListaInversa(finFila);
                    break;   
                case 7: 
                    int contador=0;
                    while (inicioFila !=null){
                        contador ++;
                        inicioFila=inicioFila.vieneAtras;
                    }
                    System.out.println("Servicio terminado, personas "
                            + "sin atdender: " +contador);
                    break;
             
            }

        } while (opcion != 7);

        
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

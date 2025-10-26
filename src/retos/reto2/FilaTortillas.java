/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;

/**
 * Programa que simula una fila de un servicio 
 * @author Romero
 * 21 de octubre 2025
 */
import java.util.LinkedList;
import java.util.Scanner;
public class FilaTortillas {
    
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        Scanner leer = new Scanner(System.in); 
        boolean activo = true;

        while (activo) {
            System.out.println("\n-- MENU--");
            System.out.println("1: Agregar cliente a la fila");
            System.out.println("2: Atender al cliente");
            System.out.println("3: Cliente sale de la fila");
            System.out.println("4: Terminar servicio");
            System.out.print("Elija una opcion: ");

            int opcion;

            // Verifica que la entrada sea un número
            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
                leer.nextLine(); // limpiar el buffer
            } else {
                System.out.println("Por favor, ingrese un numero valido.");
                leer.nextLine(); // limpiar entrada inválida
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = leer.nextLine();
                    fila.add(cliente);
                    System.out.println("El cliente " + cliente + " ha sido agregado a la fila.");
                    break;

                case 2:
                    if (!fila.isEmpty()) {
                        String atendido = fila.removeFirst(); // remueve al primero
                        System.out.println("Se atendio a: " + atendido);
                    } else {
                        System.out.println("La fila esta vacia.");
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("No hay clientes en la fila.");
                    } else {
                        System.out.print("Nombre del cliente que sale de la fila: ");
                        String salido = leer.nextLine();
                        if (fila.remove(salido)) { // si se encuentra, se elimina
                            System.out.println("El cliente " + salido + " ha salido de la fila.");
                        } else {
                            System.out.println("El cliente " + salido + " no esta en la fila.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Servicio terminado. Quedan " + fila.size() + " personas en la fila.");
                    activo = false;
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }

        leer.close();
    }
}

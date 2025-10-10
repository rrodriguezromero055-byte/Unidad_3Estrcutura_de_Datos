/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 * Ejerccicio para probar arreglos
 * @author Romero
 */
import java.util.Scanner;
public class Tabla {
    public static void main(String[] args) {
          int arreglo[]=new int[20];
          int[] arreglo2={4,3,2,1,2};
          int matriz[][]= new int[3][4];
          int[] matriz2[]= {{2,4,2},{1,2,3,5,3,2}};
          
          System.out.println("Valor: " 
                  + matriz2[1][2]);
          System.out.println("La matriz tiene: "+
                  matriz2.length);
          System.out.println(matriz2[0].length);
          System.out.println("El segundo arrglo tiene: " 
                  +arreglo.length +" posiciones ");
          System.out.println("El segundo arrglo tiene: " 
                  +arreglo2.length +" posiciones ");
          //Pedri 3 nombre , 3 carreras, pedir 3 edades, acomodar en una tabla
          // que sea nombre carrera edad
          
          String[][] misdatos=new String[5][3];
          Scanner sc=new Scanner(System.in);
          for (int i=0;i<5;i++){
          System.out.println("Escribe el nombre: ");
          var nombre=sc.nextLine();
          System.out.println("Escribe la carrera: ");
          var carrera=sc.nextLine();
          System.out.println("Escribe la edad: ");
          var edad=sc.nextLine();
          /*String otro[]={nombre,carrera,edad};
          for (int j=0;j<3;j++){
              misdatos[i][j]=otro[j];
          }*/
          misdatos[i][0]=nombre;
          misdatos[i][1]=carrera;
          misdatos[i][2]=edad;
          }
        for (String[] misdato : misdatos) {
            for (String dato : misdato) {
                System.out.printf("%10s",dato);   
            }
            System.out.println("");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1.datos;

/**
 *
 * @author Romero
 */
public class Materia {
     String nombre; 
     int calificaciones;
     int semestre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public String[] aArreglo(){
        String[] arreglo = new String[3];
        arreglo[0]= nombre;
        arreglo[1]= "" + semestre;
        arreglo[2]= "" + calificaciones;
        return arreglo;
    }
     
     

     
     

     
     
    
}

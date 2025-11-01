/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicioPilas;

/**
 * Programa que me permite trabajar con los datos en forma de LIFO
 * Es una pila estatioca para manipular datos 
 * @author Romero
 */
public class MiStack {
    
    private final int MAXIMO;
    private final String[] STACK;
    private int tope;
    
    /**
     * Metodo que permite ver el contenido de la pila
     * @return regresa un arreglo con los datos 
     */
    public String[] viewStack(){
        int topeVirtual= tope+1;
        String[] value= new String[topeVirtual];
        int index=0;
        for(int i=tope; i>=0; i--){
            value[index]= STACK[i];
            index++;
        }
        return value;
    }
    /**
     * Metodo que permite mostrar los elementos que tiene la pila en el tope
     * @return regresa el valor, si no exite regresa vacio 
     */
    public String peek(){
        String value= "";
        if(tope>=0){
            value= STACK[tope];
        }
        return value;
    }
    
    /**
     * Metodo que permite sacar el valor que tenemos en el tope de a pila
     * @return regeresa el valor que tenemos en el final de la fila 
     * Si el valor no existe regresa vacia
     */
    public String pop(){
        String value= "";
        if(tope>=0){
            value= STACK[tope];
            tope--;
        }   // trown new Exception("Asaaasas")
            return value;
         }
 
    /**
     * Metodo que permite agregar elementos a la pila
     * @param value es el elemento que se agrega
     * @return un verdadero si se logro inserar 
     */
    public boolean push(String value){
        boolean isSuccess;
        if(tope<MAXIMO){
            tope ++;
            STACK[tope]= value;
            isSuccess= true;
        }else{
            isSuccess= false;
        }
        return isSuccess;
    }
    
    public MiStack(){
        this(10);
    }
    
    public MiStack(int max){
        MAXIMO = max;
        STACK = new String[MAXIMO];
        tope = -1;
    }
    
    
 
}

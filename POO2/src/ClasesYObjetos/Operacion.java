
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {    
    //Métodos:    
    
    //Se declaran los parámetros para enviarlos
    //como parámetros
    
    //Método para sumar ambos números.    
    public int sumar(int numero1,int numero2){        
        int suma = numero1 + numero2;
        return suma;
    }
    
    //Método para restar ambos números.
    public int resta(int numero1,int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    
    //Método para multiplicar ambos números.
    public int multiplicacion(int numero1,int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    
    //Método para dividir ambos números.
    public int division(int numero1,int numero2){
        int division = numero1 / numero2;
        return division;
    }
    
    //Se llaman las variables locales
    public void Mostrar_Resultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("El producto es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
    

}









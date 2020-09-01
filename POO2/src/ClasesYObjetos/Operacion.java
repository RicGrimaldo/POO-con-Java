
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos:    
    
    //Se declaran los parámetros para enviarlos
    //como parámetros
    
    //Método para sumar ambos números.    
    public void sumar(int numero1,int numero2){        
        suma = numero1 + numero2;
    }
    
    //Método para restar ambos números.
    public void resta(int numero1,int numero2){
        resta = numero1 - numero2;
    }
    
    //Método para multiplicar ambos números.
    public void multiplicacion(int numero1,int numero2){
        multiplicacion = numero1 * numero2;
    }
    
    //Método para dividir ambos números.
    public void division(int numero1,int numero2){
        division = numero1 / numero2;
    }
    
    public void Mostrar_Resultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("El producto es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
    

}









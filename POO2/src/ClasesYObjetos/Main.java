
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        
        //Creación de objeto
        Operacion op = new Operacion();
        
        //Se envían los argumentos a los métodos
        System.out.println("La suma es: "+op.sumar(n1, n2));
        System.out.println("La resta es: "+ op.resta(n1, n2));
        System.out.println("La multiplicación es: "+op.multiplicacion(n1, n2));
        System.out.println("La división es: "+op.division(n1, n2));
                
    }
}

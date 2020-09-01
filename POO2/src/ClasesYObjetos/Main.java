
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        
        //Creación de objeto
        Operacion op = new Operacion();
        
        //Se envían los argumentos a los métodos
        op.sumar(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);
        
        op.Mostrar_Resultados();
    }
}

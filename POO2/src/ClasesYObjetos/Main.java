
package ClasesYObjetos;

public class Main {
    public static void main(String[] args){
        //Creación de un objeto
        Operacion op = new Operacion();
        
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.division();
        op.multiplicacion();        
        op.Mostrar_Resultados();
    }
}

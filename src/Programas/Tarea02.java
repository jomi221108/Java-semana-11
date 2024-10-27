/*
Diseñar un pseudocódigo que permita registrar compras dentro de una matriz
de 4x4. Visualizar el total y el promedio de las compras.
 */

package Programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args){
    //Definir variables
        int f,c,i=1,tamatriz;
        double[][] matriz=new double[4][4];
        double ventas, suma=0.0, prom=0.0;
        Scanner lector=new Scanner(System.in);
        
        //Entrada de datos
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                System.out.print("Ingrese la "+i+"° venta: ");
                ventas=lector.nextDouble();
                matriz[f][c]=ventas;
                suma+=matriz[f][c];
                i++;
            }
        }
        
        //Proceso de datos
        tamatriz=matriz.length*matriz[0].length;
        prom=suma/tamatriz;
        
        //Salida de datos
        System.out.println("El total de ventas asciende a: "+suma);
        System.out.println("El promedio de ventas es de: "+prom);
    }
}

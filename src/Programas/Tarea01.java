/*
Diseñar un pseudocódigo que permita registrar ventas dentro de una matriz de
4x4. Visualizar el total de las ventas.
 */

package Programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args){
        //Definir variables
        int f,c,i=1;
        double[][] matriz=new double[4][4];
        double ventas, suma=0.0;
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
        //Salida de datos
        System.out.println("El total de ventas asciende a: "+suma);
    }
}

/*
Diseñar un pseudocódigo que permita generar ventas aleatorias (1000-10000)
y asignarlos a una matriz de datos de 3 x 3. Visualizar el total y el promedio
de las ventas.
 */
package Programas;
import java.util.Random;
public class Tarea04 {
    public static void main(String[] args){
        //Definir variables
        int[][] matriz=new int[3][3];
        int c,f,i=1,tamatriz;
        double suma=0.0,prom=0.0;
        Random aleatorio=new Random();
        
        //Entrada de datos
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                matriz[f][c]=aleatorio.nextInt(9001)+1000;
                System.out.print(i+"° venta: S/."+matriz[f][c]+"\t");
                suma+=matriz[f][c];
                i++;
            }
            System.out.println();
        }
        //Proceso de datos
        tamatriz=matriz.length*matriz[0].length;
        prom=suma/tamatriz;
        
        //Salida de datos
        System.out.println("La suma total de las ventas asciende a: S/."+suma);
        System.out.println("El promedio de las ventas es de: S/."+prom);
    }
}

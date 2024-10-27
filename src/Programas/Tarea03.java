/*
Diseñar un pseudocódigo que permita registrar ventas de forma aleatoria
(10 - 5000) dentro de una matriz de 4x4. Visualizar la venta mayor y menor.
 */

package Programas;
import java.util.Random;
public class Tarea03 {
    public static void main(String[] args){
        //Definir variables
        int[][] matriz=new int[4][4];
        int c,f,i=1,mayor,menor;
        Random aleatorio=new Random();
        
        //Entrada de datos
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                matriz[f][c]=aleatorio.nextInt(4991)+10;
                System.out.print(i+"° venta: S/."+matriz[f][c]+"\t");
                i++;
            }
            System.out.println();
        }
        
        //Proceso de datos
        mayor = matriz[0][0];
        menor = matriz[0][0];
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                if(mayor<matriz[f][c]){
                    mayor=matriz[f][c];
                }
                if(menor>matriz[f][c]){
                    menor=matriz[f][c];
                }
            }
        }
        //Salida de datos
        System.out.println("La venta mayor es: S/."+mayor);
        System.out.println("La venta menor es: S/."+menor);
    }
}

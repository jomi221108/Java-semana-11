/*
Crear un programa en Java que permita registrar números enteros dentro de una
matriz de 3x3. Visualizar el número mayor y menor.
Ejemplo:
1 2 3
4 5 6
7 8 9
Mayor=9
Menor=1
 */

package Programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //Declarar variables
        int numero,f,c,mayor,menor;
        int[][] mnumeros=new int[3][3];
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        for(f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                System.out.print("Ingrese el número: ");
                numero=lectura.nextInt();
                mnumeros[f][c]=numero;
            }
        }
        //Proceso de datos
        mayor = mnumeros[0][0];
        menor = mnumeros[0][0];
        for(f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                if(mayor<mnumeros[f][c]){
                    mayor=mnumeros[f][c];
                }
                if(menor>mnumeros[f][c]){
                    menor=mnumeros[f][c];
                }
            }
        }
        //Salida de datos
        System.out.println("El número mayor es: "+mayor);
        System.out.println("El número menor es: "+menor);
    }
}

/*
Crear un programa en Java que permita registrar números enteros dentro en una
matriz de 3x3. Visualizar la suma y el promedio de los números.
Ejemplo:
1 2 3
4 5 6
7 8 9
sn=45
pnum=5

 */
package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //Declaración de variables
        int numero,f,c,cem;
        double promedio=0.0,suma=0.0;
        int[][] mnumeros=new int[3][3];
        Scanner lectura=new Scanner(System.in);
        //Entrada
        for(f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                System.out.print("Ingrese el número: ");
                numero=lectura.nextInt();
                mnumeros[f][c]=numero;
            }
        }
        //Proceso
        for(f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                suma+=mnumeros[f][c];
            }
        }
        cem=mnumeros.length*mnumeros[0].length;
        promedio=suma/cem;
        
        //Salida
        System.out.println("La suma de los números es: "+suma);
        System.out.println("El promedio de los números es: "+promedio);
    }
}

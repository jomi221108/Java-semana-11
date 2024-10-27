/*
Crear un programa en Java que genera sueldos aleatorios (1025-10000)
y asignarlos a una matriz de datos de 5 x 5. Visualizar la suma de sueldos y
el sueldo promedio.
 */

package Programas;
import java.util.Scanner;
import java.util.Random;
public class Programa04 {
    public static void main(String[] args){
        //Definir variables
        Scanner lectura=new Scanner(System.in);
        int[][] matriz=new int[5][5];
        int c,f,tamatriz,i=1;
        Double prom=0.0,suma=0.0;
        Random aleatorio=new Random();
        
        //Entrada de datos
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                matriz[f][c]=aleatorio.nextInt(8976)+1025;
                System.out.print(i+"° sueldo: S/."+matriz[f][c]+"\t");
                suma+=matriz[f][c];
                i++;
            }
            System.out.println();
        }
        
        //Proceso de datos
        tamatriz=matriz.length*matriz[0].length;
        prom=suma/tamatriz;
        
        //Salida de datos
        System.out.println("La suma de todos los sueldos es de: S/."+suma);
        System.out.println("El promedio de los sueldos es: S/."+prom);
    }
}

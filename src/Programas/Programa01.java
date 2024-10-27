/*
Crear un programa en Java que permita registrar n�meros enteros dentro de una
matriz de 3x3. Visualizar la suma de los n�meros pares y la cantidad de los
n�meros impares.
Ejemplo:
1 2 3 
4 5 6
7 8 9

sp:20
ci=5

 */
package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //Declarar variables
        int sp,ci,r,numero,c,f;
        int[][] mnumeros=new int[3][3];
        Scanner lectura=new Scanner(System.in);
        //Entrada
        for(f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                System.out.print("Ingresar n�mero: ");
                numero=lectura.nextInt();
                mnumeros[f][c]=numero;
            }
        }
        //Proceso
        sp=0;
        ci=0;
        for(f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                r=mnumeros[f][c]%2;
                if(r==0){
                    sp+=mnumeros[f][c];
                }else{
                    ci++;
                }
            }
        }
        //Salida
        System.out.println("La suma de n�meros pares es: "+sp);
        System.out.println("La cantidad de n�meros impares es: "+ci);
    }
}

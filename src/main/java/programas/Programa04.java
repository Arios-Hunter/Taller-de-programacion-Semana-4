/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Programa04 {
    public static void main(String [] args){
        // Declarar variables
        int numero;
        String estacion;
        Scanner lectura=new Scanner (System.in);
        // Entrada de datos
         System.out.print("Ingresar un numero [1-12]:");
         numero=lectura.nextInt();
         // Proceso de datos
         switch (numero){
             case 1:
             case 2:
             case 3:
                 estacion="Invierno";
                 break;
            case 4:
            case 5:
            case 6:
                 estacion="Primavera";
                 break;
            case 7:
            case 8:
            case 9:
                 estacion="Verano";
                 break;
            case 10:
            case 11:
            case 12:
                 estacion="Otoño";
                 break;
            default:
            estacion="No se encontro dato";
            break;     
         }
         //Salida de datos
    System.out.println("El estacion del año:"+estacion);        
    }
    
}

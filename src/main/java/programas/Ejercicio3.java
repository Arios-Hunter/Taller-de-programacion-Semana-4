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
public class Ejercicio3 {
    public static void main(String [] args){
        // Declarar variables
        int ingles;
     String numIngles;
    Scanner lectura=new Scanner (System.in);
        // Entrada de datos
         System.out.print("Ingresar un numero [1-6]:");
         ingles=lectura.nextInt();
         // Proceso de datos
    switch (ingles){
        case 1:
                 numIngles="One";
                 break;
        case 2:
                 numIngles="Two";
                 break;
        case 3:
                 numIngles="Three";
                 break;
        case 4:
                 numIngles="Four";
                 break;     
        case 5:
                 numIngles="Five";
                 break;
        case 6:
                 numIngles="Six";
                 break;         
        default:
            numIngles="No se encontro dato";
            break;            
           }
     // Salida de datos
    System.out.println("El numero en ingles es:"+numIngles);           
    }     
    
}

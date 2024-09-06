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
public class Ejercicio1 {
    public static void main(String [] args){
        // Declarar variables
        int Palabra;
        String numPalabra;
        Scanner lectura=new Scanner (System.in);
        // Entrada de datos
         System.out.print("Ingresar un numero [1-5]:");
         Palabra=lectura.nextInt();
         // Proceso de datos
         switch (Palabra){
             case 1:
                 numPalabra="Uno";
                 break;
            case 2:
                 numPalabra="Dos";
                 break;
            case 3:
                 numPalabra="Tres";
                 break;
            case 4:
                 numPalabra="Cuatro";
                 break;     
            case 5:
                 numPalabra="Cinco";
                 break;   
        default:
            numPalabra="No se encontro dato";
            break;         
         }
     //Salida de datos
    System.out.println("La palabra del numero:"+numPalabra);      
    }
    
}

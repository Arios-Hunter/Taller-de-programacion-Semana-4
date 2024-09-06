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
public class Ejercicio4 {
    public static void main(String [] args){
        // Declarar variables
        int periodo;
     String periodoAnual;
    Scanner lectura=new Scanner (System.in);
        // Entrada de datos
    System.out.print("Ingresar un numero [1,2,3,4,6,12]:");
         periodo=lectura.nextInt();
         // Proceso de datos
    switch (periodo){
        case 1:
                 periodoAnual="Mensual";
                 break;
        case 2:
                 periodoAnual="Bimestral";
                 break;
        case 3:
                 periodoAnual="Trimestral"; 
                 break;
        case 4:
                 periodoAnual="Cuatrimestral";
                 break;     
        case 6:
                 periodoAnual="Semestral";
                 break;
        case 12:
                 periodoAnual="Anual";
                 break;         
        default:
            periodoAnual="No se encontro dato";
            break; 
         
    }    
    // Salida de datos
    System.out.println("El numero del periodo es:"+periodoAnual);   
}
}


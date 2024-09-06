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
public class Ejercicio2 {
    public static void main(String [] args){
        // Declarar variables
        int Romano;
        String numRomano;
    Scanner lectura=new Scanner (System.in);
        // Entrada de datos
         System.out.print("Ingresar un numero [1-10]:");
         Romano=lectura.nextInt();
         // Proceso de datos    
    switch (Romano){
        case 1:
                 numRomano="I";
                 break;
        case 2:
                 numRomano="II";
                 break;
        case 3:
                 numRomano="III";
                 break;
        case 4:
                 numRomano="IV";
                 break;     
        case 5:
                 numRomano="V";
                 break;   
        case 6:
                 numRomano="VI";
                 break;
        case 7:
                 numRomano="VII";
                 break;
        case 8:
                 numRomano="VIII";
                 break;
        case 9:
                 numRomano="IX";
                 break;     
        case 10:
                 numRomano="X";
                 break;   
        default:
            numRomano="No se encontro dato";
            break;            
           }
     // Salida de datos
    System.out.println("El numero romano es:"+numRomano);    
}
}

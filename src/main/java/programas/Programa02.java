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
public class Programa02 {
    public static void main(String [] args){
    // Declara variables
    int n;
    String diasem;
    Scanner lectura=new Scanner (System.in);
    // Entrada de datos
    System.out.print("Ingresar un numero [1-7]:");
    n=lectura.nextInt();
    // Proceso de datos
    switch (n){
        case 1:
            diasem="Lunes";
            break;
        case 2:
            diasem="Martes";
            break;
        case 3:
            diasem="Miercoles";
            break;
        case 4:   
            diasem="jueves";
            break;
        case 5:
            diasem="Viernes";
            break;
        case 6:
            diasem="Sabado";
            break;
        case 7:
            diasem="Domingo";
            break;
        default:
            diasem="Solo numero del 1-7";
            break;
              
    }
    // Salida de datos
    System.out.println("El dia de la semana es:"+diasem);
        }
    
}

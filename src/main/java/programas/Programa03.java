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
public class Programa03 {
    public static void main(String [] args){
        // Declara variables
    int n;
    String mes;
    Scanner lectura=new Scanner (System.in);
    // Entrada de datos
    System.out.print("Ingresar un numero [1-12]:");
    n=lectura.nextInt();
    // Proceso de datos
    switch (n){
        case 1:
            mes="Enero";
            break;
        case 2:
            mes="Febrero";
            break;
        case 3:
            mes="Marzo";
            break;
        case 4:   
            mes="Abril";
            break;
        case 5:
            mes="Mayo";
            break;
        case 6:
            mes="Junio";
            break;
        case 7:
            mes="Julio";
            break;
        case 8:
            mes="Agosto";
            break;
        case 9:
            mes="Septiembre";
            break;
        case 10:
            mes="Octubre";
            break;
        case 11:   
            mes="Noviembre";
            break;
        case 12:
            mes="Diciembre";
            break;    
        default:
            mes="No se encontro dato";
            break;
            
    }
        //Salida de datos
    System.out.println("El mes del año:"+mes);
    }
}

package programas;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        // Declarar variable
        int n1,n2,opc,r;
        Scanner lectura=new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresar numero 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar numero 2:");
        n2=lectura.nextInt();
        System.out.print("Ingresar la opcion(1=suma,2=resta,3=mult,4=division):");
        opc=lectura.nextInt();
        // Proceso de datos
        r=0;
        switch (opc){
            
                case 1:r=n1+n2;break;
                case 2:r=n1-n2;break;
                case 3:r=n1*n2;break;
                case 4:r=n1/n2;break;
        }
        // Salida de datos
        System.out.print("El resultado es:"+r);
    }
}

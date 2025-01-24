
package Proyecto_final;
//Paquete de datos e/s de datos por consola
import java.util.Scanner;
//clase principal
public class Ingresos_vendedor {
//Metodo principal
public static void main (String args[]){
//Declarar variables
int vt1,vt2,vt3;
double sm,pt,c;
String vendedor;
Scanner lectura=new Scanner(System.in);
//entrada de datos
System.out.print("Nombre del vendedor:");
vendedor=lectura.next();
System.out.print("Sueldo mensual:");
sm=lectura.nextDouble();
System.out.print("Venta 1:");
vt1=lectura.nextInt();
System.out.print("Venta 2:");
vt2=lectura.nextInt();
System.out.print("Venta 3:");
vt3=lectura.nextInt();
//proceso de datos
c=(vt1+vt2+vt3)*0.10;
pt=sm+c;
//Salida de datos
System.out.println("La comision de la venta es       : " + c);
System.out.println("El sueldo mensual del vendedor es: " + pt);
}
    
}

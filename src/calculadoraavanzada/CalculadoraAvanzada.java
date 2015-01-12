/*
 * Programa que dando opciones al usuario simula una calculadora
 * Aitor Ibañez- Ivan Sanchez
 * 08/01/2015 21:00
 * v1.0
 */

package calculadoraavanzada;
import java.util.Scanner;
public class CalculadoraAvanzada {

    public static void main(String[] args) {
        int a, num1=0, num2=0, res;
        double num3=0, resultado;
        Scanner introducir=new Scanner(System.in);
        System.out.println("Selecciona la operación que quieres realizar (1-6):");
        System.out.println("1.-SUMAR");
        System.out.println("2.-RESTAR");
        System.out.println("3.-MULTIPLICAR");
        System.out.println("4.-DIVIDIR");
        System.out.println("5.-RAIZ CUADRADA");
        System.out.println("6.-POTENCIA");
        a=introducir.nextInt();
        if(a!=5){
            System.out.print("Introduce el primer numero: ");
            num1=introducir.nextInt();
        }
        else{
            do{
            System.out.print("Introduce el numero: ");
            num3=introducir.nextInt();
            }while(num3<0);
        }
        switch(a){
            case 1:
                System.out.print("Introduce el segundo numero: ");
                num2=introducir.nextInt();
                res=num1+num2;
                System.out.println(num1+" + "+num2+" = "+res);
                break;
            case 3:
                System.out.print("Introduce el segundo numero: ");
                num2=introducir.nextInt();
                res=num1*num2;
                System.out.println(num1+" * "+num2+" = "+res);
                break;
            case 5:
                resultado=Math.sqrt(num3);
                System.out.println("La raiz de "+num3+" es "+resultado);
                break;
        }
    }
    
}

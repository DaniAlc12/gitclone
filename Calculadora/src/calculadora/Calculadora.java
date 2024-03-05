package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int modo;
        do{
            System.out.println("Que modo de calculadora quieres?");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Division");
            System.out.println("4-Multiplicacion");
            System.out.println("0-Salir");
            modo=datos.nextInt();
            if(modo<0 || modo>4){
                System.out.println("Solo puedes elegir modos del 1 al 4");
            }
            else if(modo==1){
                System.out.println("Has elegido el modo suma");
                System.out.println("Introduce el primer numero que desea sumar");
                double sum1=datos.nextDouble();
                System.out.println("Introduce el segundo numero");
                double sum2=datos.nextDouble();
                System.out.println("El resultado es:" + (sum1+sum2));
            }
            else if(modo==2){
                System.out.println("Has elegido el modo restar");
                System.out.println("Introduce el primer numero que desea restar");
                double res1=datos.nextDouble();
                System.out.println("Introduce el segundo numero");
                double res2=datos.nextDouble();
                System.out.println("El resultado es:" + (res1-res2));
            }
            else if(modo==3){
                System.out.println("Has elegido el modo division");
                System.out.println("Introduce el primer numero que desea dividir");
                double div1=datos.nextDouble();
                System.out.println("Introduce el segundo numero");
                double div2=datos.nextDouble();
                System.out.println("El resultado es:" + (div1/div2));
            }
            else if(modo==4){
                System.out.println("Has elegido el modo multiplicacion");
                System.out.println("Introduce el primer numero que desea multiplicar");
                double mult1=datos.nextDouble();
                System.out.println("Introduce el segundo numero");
                double mult2=datos.nextDouble();
                System.out.println("El resultado es:" + (mult1*mult2));
            }
        }while(modo!=0);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class SentenciaSwitch {

    public static void main(String[] args) {
     
        //Variales
        final double pi = 3.14;
        final String OPC_SALIR = "0";
        String opc;
        double largo, ancho,perimetro, area, radio;  
        
        System.out.println("Seleccione una opcion: \n"
        +"Ingrese 1 o a Calcular perimetro y area de un rectangulo\n"
        +"Ingrese 2 o b Calcular perimetro y area de un circulo\n"
        +"Ingrese 0 o c para salir\n");  
        Scanner entrada = new Scanner(System.in);    
        opc=entrada.nextLine();
    
        switch(opc){
            case "1","a":    
                System.out.println("Ingrese largo: ");
                largo = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Ingrese ancho: ");
                ancho = entrada.nextDouble();
                entrada.nextLine();
                perimetro = largo*2 + ancho*2;
                area = largo*ancho;
                System.out.println("El perimetro es: "+perimetro+" el area es: "+area);
                break;
            case "2", "b":
                System.out.println("Ingrese radio ");
                radio = entrada.nextDouble();
                entrada.nextLine();     
                perimetro=radio*2*pi;
                area=radio*radio*pi;
                System.out.println("El perimetro es: "+perimetro+" el area es: "+area);
                break;
            case OPC_SALIR , "c":
                System.out.println("Nos vemos! Presione enter para salir");
                entrada.nextLine();//asi hacemos que quede esperando enter para seguir
                break;
            default:
                System.out.println("Las opciones son 1,2 o 3");
                break;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //PIDE AL USUARIO ADIVINAR UN NUMERO 
      //TERMINA CUANDO ADIVINA EL 
      Scanner captu = new Scanner (System.in);
      int numero;
      
      do{ 
      System.out.println("-------ESCOJE UN NUMERO-------");
      System.out.println("1.");
      System.out.println("2.");
      System.out.println("3.");
      System.out.println("4.");
      System.out.println("5.");
      System.out.println("6.");
      System.out.println("7.");
      System.out.println("8.");
      
      
      
      numero = captu.nextInt();
      captu.nextLine();
      }while (numero !=  8); //EL SIGNO DE EXCLAMACION ! AYUDA PARA QUE EL NUMERO NO SEA IGUAL  O DIFERENTE EN JAVA 
      System.out.println("ADIVINASTE EL NUMERO ");

   }
   
}

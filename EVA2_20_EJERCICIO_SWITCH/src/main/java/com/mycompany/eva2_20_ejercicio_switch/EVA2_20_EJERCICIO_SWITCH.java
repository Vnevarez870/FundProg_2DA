/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SWITCH {

    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
        int valor1,valor2,valor,resultado;
        
        System.out.println("///////CALCULADORA//////////");
        System.out.println("introduce tu primer valor ");
        valor1 = captu.nextInt();
        System.out.println("introduce tu segundo valor ");
        valor2 = captu.nextInt();
        
        System.out.println("Que te gustria hacer 1= suma, 2= resta, 3= multiplicacion,4 divicion");
       
        valor = captu.nextInt();
        switch(valor){
          case 1:
              resultado = valor1+valor2;
              System.out.println("Suma " + resultado);
              
          case 2:
              resultado = valor1 - valor2;
              System.out.println("Resta"+resultado);
              
          case 3:
              resultado = valor1* valor2;
               System.out.println("Multiplicacion"+resultado);
              
              case 4:
                  resultado = valor1/valor2;
                  System.out.println("Division "+resultado);
                 
                  
                  break;
              default: //OPCIONAL: QUE HAGO CUANDO NO ES NINGUNA OPCION ANTERIOR 
                 System.out.println("operacion no valido "); 
                 
        //CALCULADORA
        //PEDIR DOS NUMEROS ENTEROS
        //PEDIR LA OPERACION: USA SWITCH 
        // 1 SUMA
        //2 RESTA 
        //3 MULTIPLICACION 
        //4DIVICION 
        //CUALQUIER OTRO VALOR --> OPERACION INVALIDA
        //RESULTADO
        
        
        
        
        
        
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_SWITCH {

    public static void main(String[] args) {
      Scanner captu = new Scanner (System.in);
      System.out.println("Introduce el numero del dia (1-7: ");
      int dia = captu.nextInt();
      
      switch(dia){
          case 1:
              System.out.println("Domingo");
              //AQUI PODEMOS PONER CUANTAS INTRUCCIONES NECESITAMOS 
              break;
          case 2:
              System.out.println("lunes");
              
          case 3:
               System.out.println("Martes");
              
              case 4:
                  System.out.println("Miercoles");
              
              case 5:
                  System.out.println("Jueves");
                  
              case 6 :
                 System.out.println("Viernes");
                  
              case 7:
                  System.out.println("Sabado");
                  
                  break;
              default: //OPCIONAL: QUE HAGO CUANDO NO ES NINGUNA OPCION ANTERIOR 
                 System.out.println("Dia no valido ");
                       
                  
      }
              
              
    }
}

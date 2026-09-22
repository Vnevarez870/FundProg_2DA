/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_1_IF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int edad;
       Scanner captu = new Scanner (System.in );
       System.out.println("Cual es tu edad ?");
       edad = captu.nextInt();
       //PARENTESIS OBLIGTORIOS DENTRO DE LA EXTENCIÓN CONDICIONAL ( VERDADERO O FALSO)
       if(edad >= 18 ){ //   QUE HACEMOS SI ES VERDAD
       System.out.println("Bienvenido puedes pasar !!");
       }else {  //QUE HACEMOS SI ES FALSO (OPCIONAL)
           System.out.println("NO PUEDES ENTAR ( le da su estatequieto)");
       }
       }
       
      
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_calificaciones;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificaciones;
       Scanner captu = new Scanner (System.in );
       System.out.println("Cual es tu Calificación ?");
        calificaciones = captu.nextInt();
       //PARENTESIS OBLIGTORIOS DENTRO DE LA EXTENCIÓN CONDICIONAL ( VERDADERO O FALSO)
       if(calificaciones >= 70 ){ //   QUE HACEMOS SI ES VERDAD
       System.out.println("felicidades pasaste  !!");
       }else {  //QUE HACEMOS SI ES FALSO (OPCIONAL)
           System.out.println("NO PASATE ( Mamá te va a pegar )");
       }
    }
    
}

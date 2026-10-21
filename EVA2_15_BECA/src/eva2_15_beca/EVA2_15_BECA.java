/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu =new Scanner (System.in);
        int promedio, ingresos;
        System.out.println("Cuantos son tus ingresos");
        ingresos = captu.nextInt();
        System.out.println("Cual es tu promedio");
        promedio = captu.nextInt();
        
        if ((promedio >80)&&(ingresos < 10000)){
        System.out.println("BECA CONSEDIDA");
        
    }else{
    System.out.println("Beca Denegada"); 
    

    }
    
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_menu;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_8_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner captu = new Scanner (System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>MENU DEL RESTAURANTE <<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("1.Ventas");
        System.out.println("2.Provedores");
        System.out.println("3.Empleados");
        System.out.println("4.Inventario");
        System.out.println("5.Salir");
        System.out.println("Seleccione una opción:");
        
        opcion = captu.nextInt();
                
        if(opcion ==1){
        
        System.out.println("PANTALLAS DE VENTAS");
        }else if (opcion ==2){
            
         System.out.println("PANTALLAS DE PROVEDORES");
        }else if (opcion ==3){
            
         System.out.println("PANTALLAS DE EMPELEADOS");
        }else if (opcion ==4){
            
         System.out.println("PANTALLAS DE INVENTARIO ");
        }else if (opcion ==5){
             System.out.println("BYE");
        
            
            
            
            
            
        }
        
        
        System.out.println("2.Provedores");
        System.out.println("3.Empleados");
        System.out.println("4.Inventario");
        System.out.println("5.Salir");
        System.out.println("Seleccione una opción:");
        
       
        
    }
    
}

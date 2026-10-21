/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Usuario
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     boolean entarAntro,tieneCredencial = false;  //NO DA ENTEROS SOLO DA VERDADERO O FLASO 
        int edad = 18 ;
        
        //AND -->PARA QUE SEA VERDAD AMBAS EXPRESIONES DEBEN SER VERDAD (TRUE)
        entarAntro = edad >= 18 && (tieneCredencial == true);
        System.out.println(entarAntro);
        
        //OR -->PARA QUE SEA VERDAD, SOLO UNA (CUALQUIERA) DEBE SER VERDAD
        boolean estaSoleado = false, tienesDinero = false;
        boolean permisoSalir;
        
        permisoSalir = (estaSoleado == true) || (tienesDinero == true);
        System.out.println("permiso para salir de paseo:" +permisoSalir);
        
        //AND -> Y --> &&
        //OR -> 0 
        //NOT --> 
        
        
        
    }
    
}

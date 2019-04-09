/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesenjava;

/**
 *
 * @author nicolas.fanin
 */
public class ClasesEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto miAuto = new Auto();
        miAuto.setColor("MARRON");
        miAuto.setAño(2019);
        miAuto.setKilometros(1000f);
        miAuto.setMarca("Fiat");
        miAuto.setModelo("Uno");
        miAuto.setReservado(true);
        
        if( miAuto.getReservado() ) {
            System.out.println("El auto esta Reservado...");
        } else {
            System.out.println("El auto no esta reservado...");
        }
        
        System.out.println("Los datos son:");
        
        System.out.println("Color:" + miAuto.getColor());
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        float kilometros = 500 + miAuto.getKilometros();
        System.out.println("Kilometros: " + kilometros);
        
        
    }
    
}

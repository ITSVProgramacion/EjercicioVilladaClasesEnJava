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
public class Auto {
    
    private String color;
    private String marca;
    private int año;
    private boolean reservado;
    private String modelo;
    private float kilometros;
    
    public void setColor(String colorAuto) {
        color = colorAuto;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setMarca(String marcaAuto){
        marca = marcaAuto;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setAño(int año) {
        año = año;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setReservado(boolean autoReservado) {
        reservado = autoReservado;
    }
    
    public boolean getReservado() {
        return reservado;
    }
    
    public void setModelo(String modeloAuto) {
        modelo = modeloAuto;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setKilometros(float kilometrosActuales) {
        kilometros = kilometrosActuales;
    }
    
    public float getKilometros() {
        return kilometros;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Monedas;

import java.util.Random;

/**
 *clase para modelar monedas
 * @author ACR
 */
public final class Moneda {
    private static final String[] caras={"AGUILA","SELLO"};
    private String caraVisible;
    private Random rmd;
    
    public Moneda()
    {
     rmd = new Random();
     lanzarMoneda();
    }
    /**
     * para lanzar moneda
     */
    public void lanzarMoneda()
    {
    this.caraVisible=caras[rmd.nextInt(2)];
    }
    
    /**
     *para poder regresar como cadena el objeto
     * @return
     */
    @Override
    public String toString()
    {
    return caraVisible;    
    }
}

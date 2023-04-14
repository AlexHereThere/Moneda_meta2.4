/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Monedas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 01806
 */
public class ConjuntoDeMonedas {

    ArrayList<Moneda> monedas;
    
    public ConjuntoDeMonedas()
    {
        monedas=new ArrayList<>();
    }
    
    public void agregarMonedaLanzada()
    {
    monedas.add(new Moneda());
    }
    
    public void mostrarMonedas()
    {
     Iterator<Moneda> it = monedas.iterator();
     do{
         System.out.println(it.next());    
     }while(it.hasNext());  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ConjuntoDeMonedas monedas=new ConjuntoDeMonedas();
    monedas.agregarMonedaLanzada();
    monedas.agregarMonedaLanzada();
    monedas.agregarMonedaLanzada();
    monedas.agregarMonedaLanzada();
    monedas.mostrarMonedas();
    }
    
}

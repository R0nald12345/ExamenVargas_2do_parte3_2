/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p2;

/**
 *
 * @author pumar
 */
public class Nodo {

    public Nodo izq;
    public Nodo der;
    public String cad;
    public int frecuencia;

    //Constructor del Nodo
    public Nodo(String cad,int frecuencia) {
        izq = der = null;
        this.cad = cad; 
        this.frecuencia = frecuencia;
    }
    
    
}

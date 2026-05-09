/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

import java.util.Date;

/**
 *
 * @author luisa
 */
public class Salida {
    
    private Date fechaSalida;
    private Bus  myBus;
    private Ruta myRuta;
    private String estado;

    public Salida(Date fechaSalida, Bus myBus, Ruta myRuta) {
        this.fechaSalida = fechaSalida;
        this.myBus = myBus;
        this.myRuta = myRuta;
        this.estado = "PROGRAMADA";
    }
    
}

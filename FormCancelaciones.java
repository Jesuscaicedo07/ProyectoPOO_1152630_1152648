/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author luisa
 */
public class Persona {
private String cedula;
private String nombre;

    public Persona(String CEDULA, String NOMBRE) {
        this.cedula = CEDULA;
        this.nombre = NOMBRE;
    }

    public String getcedula() {
        return cedula;
    }

    public String getnombre() {
        return nombre;
    }

    public void setcedula(String CEDULA) {
        this.cedula = CEDULA;
    }

    public void setnombre(String NOMBRE) {
        this.nombre = NOMBRE;
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author luisa
 */
public class Asiento {
private int numero;
private String disponible;

    public Asiento(int Numero) {
        this.numero = Numero;
        this.disponible = "DISPONIBLE";
    }

    public int getNumero() {
        return numero;
    }

    public String getDISPONIBLE() {
        return disponible;
    }

    public void setDISPONIBLE(String DISPONIBLE) {
        this.disponible = DISPONIBLE;
    }

}

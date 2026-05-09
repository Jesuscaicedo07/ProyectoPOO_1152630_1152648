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
public class Bus {
private String placa;
private Asiento[] myAsientos;
private String tipo;
private String estado;
    public Bus(String tipo,String placa) {
        this.tipo = tipo;
        this.placa = placa;
            if (this.tipo.equalsIgnoreCase("EJECUTIVO")){
                this.myAsientos=new Asiento[30];}
            else {this.myAsientos=new Asiento[40];}
            this.estado = "DISPONIBLE";
    } 

    public Asiento getMyasientos(int N) {
        return myAsientos[N];
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }


            
        
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

/**
 *
 * @author favya
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String Ncomuna;
    private String ocupacion;
    private int cantidadFamilia;
    private String NCensista;
    private Comuna comuna;
    private Censista censista;

    public Persona(String nombre, int edad, String Ncomuna, String ocupacion, int cantidadFamilia, String Ncensista) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.cantidadFamilia = cantidadFamilia;
        this.NCensista = Ncensista;
        this.Ncomuna = Ncomuna;
        comuna = null;
        censista = null;
    }

    public String getNcomuna() {
        return Ncomuna;
    }

    public void setNcomuna(String Ncomuna) {
        this.Ncomuna = Ncomuna;
    }

    public String getNCensista() {
        return NCensista;
    }

    public void setNCensista(String NCensista) {
        this.NCensista = NCensista;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getCantidadFamilia() {
        return cantidadFamilia;
    }

    public void setCantidadFamilia(int cantidadFamilia) {
        this.cantidadFamilia = cantidadFamilia;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public Censista getCensista() {
        return censista;
    }

    public void setCensista(Censista censista) {
        this.censista = censista;
    }
 
}

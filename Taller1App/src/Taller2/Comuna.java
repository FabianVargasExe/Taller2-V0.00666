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
public class Comuna {
    
     private int codigo;
     private String nombre;
     private int canthabitantes;
     private int numcensistas;
     private ListaCensistas listaCensistas;
     private ListaPersonas listaPersonas;

    public Comuna(int codigo, String nombre, int numcensistas, int canthabitantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numcensistas = numcensistas;
        this.canthabitantes = canthabitantes;
        listaCensistas = new ListaCensistas(10);
        listaPersonas = new ListaPersonas(1000);
    }

    public ListaPersonas getListaPersonas() {
        return listaPersonas;
    }

  

    public int getCodigo() {
        return codigo;
    }

    public ListaCensistas getListaCensistas() {
        return listaCensistas;
    }



    public int getNumcensistas() {
        return numcensistas;
    }

    public void setNumcensistas(int numcensistas) {
        this.numcensistas = numcensistas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanthabitantes() {
        return canthabitantes;
    }

    public void setCanthabitantes(int canthabitantes) {
        this.canthabitantes = canthabitantes;
    }
     
}

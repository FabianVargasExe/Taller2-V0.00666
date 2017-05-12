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
public class ListaPersonas {
    
    
    private Persona [] lp;
    private int cantPersonas;
    private int max;
    
    public ListaPersonas(int max){
        this.max = max;
        lp = new Persona[max];
        cantPersonas = 0;
    }
    
   public int getCantPersonas (){
       return cantPersonas;
   }

   
   public boolean ingresarPersonas (Persona p){
       if(cantPersonas < max){
           lp[cantPersonas] = p;
           cantPersonas++;
           return true;
       }else{
           return false;
       }
   }
   
   public Persona buscarPersona (String cod) {
       int i;
       for(i = 0; i < cantPersonas; i++){
           if(lp[i].getNombre().equals(cod)){
               break;
           }
       }
       if (i == cantPersonas){
          return null;
       }else{
            return lp[i];
       }

   }
   
   public Persona getPersonaI(int i){
       if(i < cantPersonas && i >= 0){
           return lp[i];
       }else{
            return null;
       }
   }
    
}

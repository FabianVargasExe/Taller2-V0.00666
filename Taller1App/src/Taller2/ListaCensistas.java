

package Taller2;

/**
 *
 * @author favya
 */
public class ListaCensistas {
    
    private Censista [] lc;
    private int cantCensistas;
    private int max;
    
    public ListaCensistas(int max){
        this.max = max;
        lc = new Censista[max];
        cantCensistas = 0;
    }
    
   public int getCantCensistas (){
       return cantCensistas;
   }
   
   public boolean ingresarCensistas (Censista c){
       if(cantCensistas < max){
           lc[cantCensistas] = c;
           cantCensistas++;
           return true;
       }else{
           return false;
       }
   }
   
   public Censista buscarPorNombre (String nom) {
       int i;
       for(i=0; i < cantCensistas; i++){
           if(lc[i].getNombre().equals(nom)){
               break;
           }
       }
       if (i == cantCensistas){
       return null;
       }else {
           return lc[i];
       
       }
   }
   
   public Censista buscarPorCodigo (int cod) {
       int i;
       for(i=0; i < cantCensistas; i++){
           if(lc[i].getCodigo() == cod){
               break;
           }
       }
       if (i == cantCensistas){
       return null;
       }else {
           return lc[i];
       }

   }      
   public Censista getCensistaI(int i){
       if(i < cantCensistas && i >= 0){
           return lc[i];
       }else{
            return null;
       }
   }
}

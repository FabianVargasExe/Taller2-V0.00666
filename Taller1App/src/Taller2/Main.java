

package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ucn.StdOut;


public class Main {
    
 public static void main(String[] args) throws IOException  {
 
 
    App app = new App();
    
    app.leerComunas();     
    app.leerCensistas();
    app.leerPersonas();

    //app.AsociarListas();
     
  
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  
    StdOut.println(" 1.- Datos Censo." );
    StdOut.println(" 2.- Datos Censistas. " );
    StdOut.println(" 3.- Datos Censista Según Código. " );
    StdOut.println(" 4.- Datos Comuna Según Código. " );
    StdOut.println(" 5.- Salir. " );
    
    int op;
        do{  
            StdOut.println("\nIngrese una opción del menú: " );
            op = Integer.parseInt(bf.readLine()); 
            switch(op){
                
                case 1: 
                    app.CensoRF1(); 
                    break;
                case 2:             
                    app.DatosCensistasRF2();
                    break;
                case 3:
                    app.CensistaRF3();
                    break;
                case 4:
                    app.DatosComunaRF4();
                    break;
                case 5:
                    StdOut.println("Usted está saliendo del menú..." );
                    break;    
                default:
                    StdOut.println("OPCION NO VALIDA" );
                    break;               
            }
            }while( op != 5 );
  } 
}


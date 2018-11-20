
package extraordenador;

import java.util.Scanner;

public class Ordenador {
    Rato raton; //2 formas de instanciar
    Cpu procesador = new Cpu();
    Teclado teclas;
    Monitor pantalla;
   
    
public Ordenador(){
    raton = new Rato();
}
Scanner sc= new Scanner(System.in);
public void visualizarAtributos(){
    
    
    System.out.println("Introduce a marca de rato:");
    raton= sc.nextLine();
    
    System.out.println("Introduce o número de núcleos:");
    procesador.setNucleos(sc.nextInt());
    
    
    
}
public void calcularPrezo(){
    System.out.println("Introduce a RAM:");
    procesador.setRam(sc.nextInt());
    
}

}

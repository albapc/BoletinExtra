
package extraordenador;

import java.util.Scanner;

public class Ordenador {
//    Rato raton= new Rato(); //2 formas de instanciar
    private Rato raton = new Rato();
    private Cpu procesador= new Cpu();
    private Teclado teclas= new Teclado();
    private Monitor pantalla= new Monitor();

public Ordenador(){
}
Scanner sc= new Scanner(System.in);

public void visualizarAtributos(){
    System.out.println("Introduce o modelo de raton");
    raton.setModelo(sc.nextLine());
    
    System.out.println("Introduce a marca de monitor:");
    pantalla.setMarca(sc.nextLine());

    System.out.println("Introduce a RAM:");
    procesador.setRam(sc.nextInt());

    System.out.println("Introduce o número de teclas:");
    teclas.setNumTeclas(sc.nextInt());

    System.out.println("Introduce as pulgadas:");
    pantalla.setPulgadas(sc.nextFloat());
    
    System.out.println(raton.toString());    
    System.out.println(procesador.toString());
    System.out.println(teclas.toString());
    System.out.println(pantalla.toString());    
}

public boolean lerInalambrico(){
    if("si".equalsIgnoreCase("inalambrico ??"))
        return true;
    else
        return false;
}
public float valorInalambrico(){
    if(lerInalambrico()/*==true*/)
        return 1.5f;
    else
        return 1;
}
public void calcularPrezo(){
    float prezo= procesador.getRam()*5+valorInalambrico()+ teclas.getNumTeclas()+ pantalla.getPulgadas();
    System.out.println("Prezo total: "+prezo);

}   
}

package exemplonotas;

import java.util.Scanner;

public class Evaluacions {

    int notaFinal, notaBoletins, boletinsFeitos, boletinsTotais;
    float notaEx1, notaEx2, notaTeoricas, notaPracticas;

    public float probasTeoricas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a nota do primeiro exame:");
        notaEx1 = sc.nextFloat();
        System.out.println("Introduce a nota do segundo exame:");
        notaEx2 = sc.nextFloat();
        do{
        if(notaEx1<1||notaEx1>10)
                System.out.println("error");
        }while(notaEx1<1||notaEx1>10);   
        do{
        if(notaEx2<1||notaEx2>10)
                System.out.println("error");
        }while(notaEx2<1||notaEx2>10);
        float mediaExames= (notaEx1+notaEx2)/2;
        notaTeoricas= mediaExames*40/100;
        System.out.println("Nota nesta parte:"+notaTeoricas);
        return notaTeoricas;
    }
    public float probasPracticas(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce a nota do traballo práctico:");
        notaEx1= sc.nextFloat();
        do{
        if(notaEx1<1||notaEx1>10)
                System.out.println("error");
        }while(notaEx1<1||notaEx1>10);
        notaPracticas= notaEx1*40/100;
        System.out.println("Nota na parte práctica: "+notaPracticas);
        return notaPracticas;
    }
    public void parteBoletins(){
        Scanner sc= new Scanner(System.in);//boletinsfeitos/totais*100
        System.out.println("Introduce o número de boletíns da avaliación:");
        boletinsTotais= sc.nextInt();
        System.out.println("Introduce o número de boletíns feitos do alumno:");
        boletinsFeitos= sc.nextInt();
        
//        notaBoletins= calcularBoletins();
       

    }
    
    public int calcularBoletins(){
     notaBoletins= (int)((float) boletinsFeitos/boletinsTotais)*100;
       if (notaBoletins>=90)
           notaFinal= 2;
        else if (notaBoletins>=70)
           notaFinal= 1;
         else
           notaFinal=0;      
         System.out.println("Nota na parte de boletíns: "+notaFinal);
        
         return notaFinal;
    }
    public int calcularNotaFinal(){
        notaFinal= (int) (probasTeoricas()+probasPracticas()+calcularBoletins());
        System.out.println(Math.round(notaFinal));
        return notaFinal;
    }
}


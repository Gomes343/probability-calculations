
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException{
        
        Calculator master = new Calculator();
      
        
        master.lista.add(1.);
        master.lista.add(33.);
        master.lista.add(74.);
        master.lista.add(153.);
        master.lista.add(37.);
        master.lista.add(52.);
        master.lista.add(998.);
        master.lista.add(2.);
        master.lista.add(29.);
        
        System.out.println("TESTE DE MÉDIA");
        System.out.println("Média é: "+master.Média());
        System.out.println(" ------------ ");
        
        System.out.println("TESTE DE MEDIANA");
        System.out.println("Mediana é: "+master.Mediana());
        System.out.println(" ------------ ");
        
        System.out.println("TESTE DE MODA");
        System.out.println("Moda é:");
        master.moda();
        System.out.println(" ------------ ");
        
        System.out.println("TESTE DE VARIANCIA");
        System.out.println("Variança é: "+master.Variancia());
        System.out.println(" ------------ ");
        
        System.out.println("TESTE DE DESVIO PADRÃO");
        System.out.println("Desvio Padrão é: "+master.DesvioPadrao(master.Variancia()));
        System.out.println(" ------------ ");
        
    }
}

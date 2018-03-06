
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException{
        
        Calculator master = new Calculator();
      
        master.LerArquivo();
        
        master.Exibir();
        
        Double x = master.Variancia();
        System.out.println("Variancia é : "+ master.Variancia());
        System.out.println("Desvio é: "+ master.DesvioPadrao(x));
        
        
    }
}

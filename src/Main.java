
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException{
        
        Calculator master = new Calculator();
      
        //tira o lista.size!!!;
        
        master.lista.add(5.);
        master.lista.add(7.);
        master.lista.add(10.);
        master.lista.add(5.);
        master.lista.add(7.);
        

        master.moda();
        
    }
}

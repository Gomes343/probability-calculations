public class Main {
    public static void main(String[]args){
        
        Calculator master = new Calculator();

        master.RandomInteiro(4);
        master.OrdenarLista();

        
        System.out.println("----------");
        
        System.out.println("mediana");master.Mediana();
        master.Size();
        
    }
}

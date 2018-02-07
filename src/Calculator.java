
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Calculator{

ArrayList<Double> armazen = new ArrayList(); //Armazenamento em ArrayList

public void Inserir(double d){  //Alimentação via Digitação
    armazen.add(d);
}

public void LerArquivo( ){
    
    
    
}

public void RandomInteiro(double fim){
    Random gerador = new Random();
    int tamanho = (int) (fim+1);
    
    for(int i = 0 ; i <= fim ; i++){
        armazen.add((double)gerador.nextInt(tamanho));
    }
}

public void RandomDecimal(double inicio, double fim){
    
    
    
}

//FIM DA ALIMENTAÇÃO


public int Size(){   // Valor de N
    return armazen.size();
}

public void OrdenarLista(){     // Ordenar Lista
    int i;
    Collections.sort(armazen);
    for(double dados:armazen){
        System.out.println(dados);
    }
}

public double Média(){      // Fazer a Média
    int i;
    double soma = 0,media = 0;
    
    for(i = 0 ; i <= armazen.size() ; i++){
        soma =+ armazen.get(i);
    }
    
    media = soma / armazen.size();
    
    return media;
}

public void Exibir(){
    for(double dados:armazen){
        System.out.println(dados);
    } 
}

public void ExibirInteiro(){
    DecimalFormat df = new DecimalFormat("0");
    for(double dados:armazen){
        System.out.println(df.format(dados));
    }
}
 
}

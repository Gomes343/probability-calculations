
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
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
    Random gerador = new Random();
    
    System.out.println(gerador.nextDouble());

}

//FIM DA ALIMENTAÇÃO


public double Size(){   // Valor de N
    return armazen.size();
}

public void OrdenarLista(){     // Ordenar Lista

    Collections.sort(armazen);

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

public double Média(){      // Fazer a Média
    int i;
    double soma = 0,media = 0;
    
    for(i = 0 ; i <= armazen.size() ; i++){
        soma =+ armazen.get(i);
    }
    
    media = soma / armazen.size();
    
    return media;
}

public double Mediana(){    // Fazer a Mediana
    Collections.sort(armazen);
    double mediana = 0;
    if(armazen.size()%2==0){
        int posicao1 = (armazen.size()/2)-1;
        int posicao2 = (armazen.size()/2);
        mediana = armazen.get(posicao1)/armazen.get(posicao2);
    }
    if(armazen.size()%2!=0){
        int posicao = (int) (armazen.size()/2);
        mediana = armazen.get(posicao);
    }
    return mediana;    
}

public double moda(){
    Collections.sort(armazen);
    ArrayList<Double> contagem = new ArrayList();
    int i,j;
    for (i = 0 ; i <= armazen.size() ; i++){
        
        vet[armazen.get(i)] = 0;
    }
    
    for (i = 0 ; i <= armazen.size() ; i++){
        if()
        
    }
    
    
}

}

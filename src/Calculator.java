
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Calculator{

ArrayList<Double> lista = new ArrayList(); //Armazenamento em ArrayList

//INICIO DE ALIMENTAÇÃO

public void Inserir(double d){  //Alimentação via Digitação
    lista.add(d);
}

public void LerArquivo( ) throws IOException{
  // LEITURA

        // Escolhendo o arquivo que será lido
        String arqLeitura = "\\alturas.txt";
       
        //filtro
        FileFilter filter = new FileNameExtensionFilter("Só TXT ou DOC carai...","txt","doc");
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(chooser);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            arqLeitura = chooser.getSelectedFile().getAbsolutePath();
        }
        
        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura));
        String linha = buffRead.readLine();
        double x;
        while (linha != null) {
            x = Double.parseDouble(linha);
            this.lista.add(x);
            linha = buffRead.readLine();
        }
        buffRead.close();

    }

public void RandomInteiro(double fim){
    Random gerador = new Random();
    int tamanho = (int) (fim+1);
    
    for(int i = 0 ; i <= fim ; i++){
        lista.add((double)gerador.nextInt(tamanho));
    }
}

public void RandomDecimal(double inicio, double fim){
    Random gerador = new Random();
    
    System.out.println(gerador.nextDouble());

}

public void AdicionarVetor(double v[]){
    for(int i = 0 ; i < v.length ; i++){
        lista.add(v[i]);
    }
    
}

//FIM DA ALIMENTAÇÃO


//INICIO DE FUNCIONALIDADES

public double Size(){   // Valor de N
    return lista.size();
}

public void OrdenarLista(){     // Ordenar Lista

    Collections.sort(lista);

}

public void Exibir(){
    for(double dados:lista){
        System.out.println(dados);
    } 
}

public void ExibirInteiro(){
    DecimalFormat df = new DecimalFormat("0");
    for(double dados:lista){
        System.out.println(df.format(dados));
    }
}

//FIM DE FUNCIONALIDADES

    
//INICIO DE MÉTODOS
public double Média(){      // Fazer a Média
    int i;
    double soma = 0,media = 0;
    
    for(i = 0 ; i < lista.size() ; i++){
        soma += lista.get(i);
    }
    
    media = soma / lista.size();
    
    return media;
}

public double Mediana(){    // Fazer a Mediana
    Collections.sort(lista);
    double mediana = 0;
    if(lista.size()%2==0){
        int posicao1 = (lista.size()/2)-1;
        int posicao2 = (lista.size()/2);
        double soma = lista.get(posicao1)+lista.get(posicao2);
        mediana = soma/2;
    }
    if(lista.size()%2!=0){
        int posicao = (int) (lista.size()/2);
        mediana = lista.get(posicao);
    }
    return mediana;    
}
	
public void moda() {

        // Se não souber qual é o valor máximo ou tiver números
        // muito dispersos ou negativos, use um Map<Integer, Integer>
        int d = lista.size();
        Double count[] = new Double[d];
        double maior = 0.0;
        
        for (int num = 0 ; num < lista.size() ; num ++) {
            count[num]++;
            
            if (maior < count[num]){
                maior = count[num];
        }
            
        //for (int i = 0; i < count.length; i++){
         //   if (count[i] == maior)
          //      System.out.println(i);
        //}
        
    }
}
    
public double Variancia(){
    double variancia = 0,v1 = 0,media = 0,somatorio = 0;
    
    for(int i = 0 ; i < lista.size() ; i++){
        somatorio += lista.get(i);
    }
    media = this.Média();
    
    
    for(int i = 0 ; i < lista.size() ; i++){        
        v1 += pow((lista.get(i) - media),2);
    }
    variancia = v1/lista.size();
    
    return variancia;
}

public double VarianciaVetor(double v[]){
    double variancia = 0,v1 = 0,media = 0,somatorio = 0;
    
    for(int i = 0 ; i < v.length ; i++){
        somatorio += v[i];
    }
    media = somatorio / v.length;
    
    for(int i = 0 ; i < v.length ; i++){        
        v1 += pow((v[i] - media),2);
    }
    variancia = v1/v.length;
    
    return variancia;
}

public double DesvioPadrao(double variancia){
    Double Desvio = Math.sqrt(variancia);

    return Desvio;
}


}

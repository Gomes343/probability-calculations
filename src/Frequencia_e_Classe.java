
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frequencia_e_Classe {
    int h,k;
    // k = número de classes, h = amplitude das classes
    
    double Limite_Inferior = 999999999,Limite_Superior = 0;
    double Amplitude_Total;
    double[] classe_esquerda = new double[100];
    double[] classe_direita = new double[100];
    double[] frequencia = new double[100];
    
    ArrayList<Double> dados = new ArrayList();
    
    //FONTES
    //http://professorguru.com.br/estatistica/estat%C3%ADstica%20descritiva/Classes%2C%20amplitude%2C%20limite%20inferior%20e%20superior%2C%20ponto%20m%C3%A9dio.html
    //http://professorguru.com.br/estatistica/estat%C3%ADstica%20descritiva/constru%C3%A7%C3%A3o%20de%20classes%20-%20quantidade%20e%20tamanho%20das%20classes.html        
    
    
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
            linha = linha.replace(",",".");
            x = Double.parseDouble(linha);
            this.dados.add(x);
            linha = buffRead.readLine();
        }
        buffRead.close();
    } 
    
    public void Definir_LimiteInferior(){
        for(int i = 0 ; i < dados.size() ;i ++){
            for(int j = 0 ; j < dados.size() ; j++){
               if(dados.get(i) < Limite_Inferior){
                   Limite_Inferior = dados.get(i);
               }               
            } 
        }
    }
    
    public void Definir_LimiteSuperior(){
        for(int i = 0 ; i < dados.size() ;i ++){
            for(int j = 0 ; j < dados.size() ; j++){
               if(dados.get(i) > Limite_Superior){
                   Limite_Superior = dados.get(i);
               }               
            } 
        }
    }
   
    public void Definir_AmplitudeTotal(){
       Amplitude_Total = Limite_Superior - Limite_Inferior;
    }
    
    public void Definir_NumeroDeClasses(){
       k = (int)(1+(3.3 * Math.log10(dados.size())));
    }

    public void Definir_Amplitude_de_Classe(){
        h = (int)Amplitude_Total / k;
    }
    

    public void Definir_Classes(){
        double cont1 = 0, cont2 = 0;
        classe_esquerda[0] = Limite_Inferior;
        classe_direita[0] = Limite_Inferior + h;
        
        for(int i = 1 ; i < k ; i ++){
            classe_esquerda[i] = (classe_direita[0] + 1) + (h*cont1) + (cont2*1);
            cont1++;
            cont2++;
        }

            cont1 = 1;
            cont2 = 1;
        for(int i = 1 ; i < k ; i++){
            classe_direita[i] = (classe_direita[0] + (h*cont1) + (cont2*1));
            cont1++;
            cont2++;
        }

        
    }
   
   public void Definir_Frenquencias(){
       for(int i = 0; i < dados.size() ; i ++){
           for(int j = 0; j<k ; j++){
               if(dados.get(i)>=classe_esquerda[j]&&dados.get(i)<classe_direita[j]){
                   frequencia[j]++;
               }
           }
       }
   }
   
   public void Exibir(){
       
               System.out.println("CLASSES--------------FREQUENCIA");
        for(int i = 0 ; i < k ; i++){
            System.out.println("|"+classe_esquerda[i]+" |- "+classe_direita[i]+"      "+frequencia[i]+"|");
        }
   }
   
    
}

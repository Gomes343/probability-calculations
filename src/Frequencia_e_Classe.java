
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frequencia_e_Classe {
    int h,k,n;
    double Limite_Inferior,Limite_Superior;
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
        n = dados.size();
    } 
    
    public void Definir_LimiteInferior(){
        for(int i = 0 ; i < dados.size() ;i ++){
            for(int j = 0 ; j < i ; j++){
               if(dados.get(i) < Limite_Inferior){
                   Limite_Inferior = dados.get(i);
               }               
            } 
        }   
    }
    
    public void Definir_LimiteSuperior(){
       
    }
   
    public void Definir_NumeroDeClasses(){
       
    }
   
    public void Definir_AmplitudeTotal(){
       
    }
    
    public void ExibirClasses(){
       
    }
   
   public void ExibirFrenquencias(){
       
   }
   
    
}


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
    
    double Limite_Inferior = 999999,Limite_Superior = 0;
    double Amplitude_Total;
    double[] classe_esquerda = new double[100];
    double[] classe_direita = new double[100];
    double[] frequencia = new double[100];
    
    ArrayList<Double> dadosDouble = new ArrayList();
    ArrayList<Integer> dadosInt = new ArrayList();
    ArrayList<String> dadosString = new ArrayList();
    ArrayList<String> classes = new ArrayList();
    
    boolean inteiro = true;
    
    //FONTES
    //http://professorguru.com.br/estatistica/estat%C3%ADstica%20descritiva/Classes%2C%20amplitude%2C%20limite%20inferior%20e%20superior%2C%20ponto%20m%C3%A9dio.html
    //http://professorguru.com.br/estatistica/estat%C3%ADstica%20descritiva/constru%C3%A7%C3%A3o%20de%20classes%20-%20quantidade%20e%20tamanho%20das%20classes.html        
    
  // LEITURA    
    public void LerArquivoDouble() throws IOException{

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
            this.dadosDouble.add(x);
            linha = buffRead.readLine();
        }
        buffRead.close();
        inteiro = false;
    } 
    
    public void LerArquivoInt() throws IOException{


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
        Double x;
        int y;
        while (linha != null) {
            x = Double.parseDouble(linha);
            y = x.intValue();
            this.dadosInt.add(y);
            linha = buffRead.readLine();
        }
        buffRead.close();
    } 
       
    public void LerArquivoString() throws IOException{


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
        while (linha != null) {
            this.dadosString.add(linha);
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
  // FIM LEITURA
    
    
    
    
  // DEFINIÇÃO VALORES INT E DOUBLE  
    public void Definir_LimiteInferior(){
        if(inteiro == false){
        for(int i = 0 ; i < dadosDouble.size() ;i ++){
            for(int j = 0 ; j < dadosDouble.size() ; j++){
               if(dadosDouble.get(i) < Limite_Inferior){
                   Limite_Inferior = dadosDouble.get(i);
               }               
            } 
        }
        }else{
        for(int i = 0 ; i < dadosInt.size() ;i ++){
            for(int j = 0 ; j < dadosInt.size() ; j++){
               if(dadosInt.get(i) < Limite_Inferior){
                   Limite_Inferior = dadosInt.get(i);
               }               
            } 
        }
        }
    }
    
    public void Definir_LimiteSuperior(){
        if(inteiro == false){
        for(int i = 0 ; i < dadosDouble.size() ;i ++){
            for(int j = 0 ; j < dadosDouble.size() ; j++){
               if(dadosDouble.get(i) > Limite_Superior){
                   Limite_Superior = dadosDouble.get(i);
               }               
            } 
        }
        }else{
        for(int i = 0 ; i < dadosInt.size() ;i ++){
            for(int j = 0 ; j < dadosInt.size() ; j++){
               if(dadosInt.get(i) > Limite_Superior){
                   Limite_Superior = dadosInt.get(i);
               }               
            } 
        }
        }
    }
   
    public void Definir_AmplitudeTotal(){
       Amplitude_Total = Limite_Superior - Limite_Inferior;
    }
    
    public void Definir_NumeroDeClasses(){
        if(inteiro == false){
       k = (int)(1+(3.3 * Math.log10(dadosDouble.size())));
        }else{
       k = (int)(1+(3.3 * Math.log10(dadosInt.size())));            
        }
    }

    public void Definir_Amplitude_de_Classe(){
        h = (int)Amplitude_Total / k;
    }
    
    public void Definir_Classes(){
        double cont1 = 0, cont2 = 0;
        classe_esquerda[0] = Limite_Inferior;
        classe_direita[0] = Limite_Inferior + h;
        
        if(inteiro == false){
        for(int i = 1 ; i < k ; i ++){
            classe_esquerda[i] = (classe_direita[0] + 0.01) + (h*cont1) + (cont2*1);
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
        }else{
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
        
    }
   
    public void Definir_Frenquencias(){
       if(inteiro == false){
       for(int i = 0; i < dadosDouble.size() ; i ++){
           for(int j = 0; j<k ; j++){
               if(dadosDouble.get(i)>=classe_esquerda[j]&&dadosDouble.get(i)<classe_direita[j]){
                   frequencia[j]++;
               }
           }
       }
       }else{
       for(int i = 0; i < dadosInt.size() ; i ++){
           for(int j = 0; j<k ; j++){
               if(dadosInt.get(i)>=classe_esquerda[j]&&dadosInt.get(i)<classe_direita[j]){
                   frequencia[j]++;
               }
           }
       }
       }
   }
  // FIM DEFINIÇÃO VALORES INT E DOUBLE
    
    
    

  // DEFINIÇÃO CLASSES E FREQUENCIA DO STRING
    public void Definir_ClassesString(){
        int cont = 0;
        boolean finalizador = false;
        for(int i = 0; i < this.dadosString.size() ; i++){
            String temp = dadosString.get(i);
                if(classes.contains(temp) == true){
                    finalizador = true;
                }else{
                    classes.add(temp);
                }
                
                if(finalizador == false){
                for(int j = 0; j < this.dadosString.size() ; j++){
                    if(temp.equals(dadosString.get(j)) ){
                        frequencia[cont]++;
                }
                } 
                cont++;                
                }

             finalizador = false;   
        }
    
    }
  // FIM DEINIFÇÃO CLASSES E FREQUENCIA DO STRING
    
    
    
    
    
  // EXIBIDORES
    public void ExibirQuantitativos(){
       
               System.out.println("CLASSES--------------FREQUENCIA");
        for(int i = 0 ; i < k ; i++){
            System.out.println("|"+classe_esquerda[i]+" |- "+classe_direita[i]+"      "+frequencia[i]+"|");
        }
   }

    public void ExibirQualitativos(){
        System.out.println("CLASSES----------FREQUENCIA");
        for(int i = 0; i < classes.size() ; i++){
            System.out.println("|"+classes.get(i)+"   |-       "+frequencia[i]+"|");
            
        }
    }
  // FIM EXIBIDORES
    
    
}

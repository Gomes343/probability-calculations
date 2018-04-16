package Probabilidade_e_Estatistica;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException{
        
        Calculator master = new Calculator();
        Frequencia_e_Classe fc = new Frequencia_e_Classe();
        Scanner sc = new Scanner(System.in);
        System.out.println("LEMBRETE: \n"
                + "O sistema funciona apenas por leitura de arquivo \n"
                + "existe um arquivo exemplo para cada tipo na pasta do projeto\n"
                + "Separados em Double, Int e String.");
        
        System.out.println("======================================");
        System.out.println("Qual tipo de arquivo deseja analisar?\n"
                + "Double, int, String \n");
        
        String x = sc.nextLine();
        switch(x){
            case "Double":
                fc.LerArquivoDouble();
                fc.GerarValoresQuantitativos();
                fc.ExibirQuantitativos();
                fc.GraficoQuantitativo();
                break;
            case "int":
                fc.LerArquivoInt();
                fc.GerarValoresQuantitativos();
                fc.ExibirQuantitativos();
                fc.GraficoQuantitativo();
                break;
            case "String":
                fc.LerArquivoString();
                fc.Definir_ClassesString();
                fc.ExibirQualitativos();
                fc.GraficoQualitativo();
                break;
        }
        
        
        
        
        
        /*
        fc.LerArquivoString();

        for(int i = 0 ; i < fc.dadosString.size() ; i++){
            System.out.println(fc.dadosString.get(i));
        }
        
        fc.Definir_ClassesString();
        
        fc.ExibirQualitativos();
        
        System.out.println("=");
        
        fc.GraficoString();
        */
        
        /*
        fc.LerArquivoInt();
        
        fc.Definir_LimiteInferior();
        System.out.println("Limite inferior: "+fc.Limite_Inferior);
        fc.Definir_LimiteSuperior();
        System.out.println("Limite Superior: "+fc.Limite_Superior);
        fc.Definir_AmplitudeTotal();
        System.out.println("Amplitude total: "+fc.Amplitude_Total);
        fc.Definir_NumeroDeClasses();
        System.out.println("numero de classes: "+fc.k);
        fc.Definir_Amplitude_de_Classe();
        System.out.println("amplitude das classes: "+fc.h);
        
        System.out.println("total de dados: "+fc.dadosDouble.size());
        System.out.println("-----------------");
        //System.out.println("TESTE COM CENSO ALEMANHA SALÁRIO");
        
        fc.Definir_Classes();
        fc.Definir_Frenquencias();
        
        //'fc.ExibirQuantitativos();
        
        fc.GraficoQuantitativo();
        */
    }
}

        /* TESTADOR
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
        */
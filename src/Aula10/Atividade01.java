package Aula10;

import java.util.Scanner;


//ESPAÇO AMOSTRAL
public class Atividade01 {
    public static void main(String[]args){
        EspaçoAmostral_e_Probabilidade ep = new EspaçoAmostral_e_Probabilidade();
        Scanner sc = new Scanner(System.in);
        int qt_aluno,qt_h,qt_h25,qt_m25,qt_hc,qt_mc;
        
        
//========================== SOLICITAÇÃO DE INFORMAÇÕES ========================

        System.out.println("Informe quantos Alunos existem na turma: \n");
        //qt_aluno = sc.nextInt();
        qt_aluno = 42;
        
        System.out.println("A quantidade de homens na turma \n");
        //qt_h = sc.nextInt();
        qt_h = 35;
        
        System.out.println("A quantidade de homens com mais de 25 anos \n");
        //qt_h25 = sc.nextInt();
        qt_h25 = 9;
        
        System.out.println("A quantidade de mulheres com mais de 25 anos \n");
        //qt_m25 = sc.nextInt();
        qt_m25 = 3;
        
        System.out.println("A quantidade de homens que nasceram em Caragua \n");
        //qt_hc = sc.nextInt();
        qt_hc = 16;
        
        System.out.println("A quantidade de Mulheres que nasceram em Caragua \n");
        //qt_mc = sc.nextInt();
        qt_mc = 6;
        
//============================ INFORMAÇÕES OBTIDAS =============================
        
        Double t = null;
        System.out.println(" ===== Definindo as probabilidades ===== ");
        
        System.out.println("A probabilidade de sortear um Homem");
            t = (double) qt_h/qt_aluno;
            System.out.println(ep.definirFormatPorcent(t));
            
        System.out.println("A probabilidade de sortear uma Mulher");
            t = (double)(qt_aluno-qt_h)/qt_aluno;
            System.out.println(ep.definirFormatPorcent(t));
            
        System.out.println("A probabilidade de sortear um Homem com menos de 25 anos");
            t = (double)(qt_h - qt_h25)/qt_aluno;
            System.out.println(ep.definirFormatPorcent(t));
        
        System.out.println("A probabilidade de sortear uma Mulher com mais de 25 anos");
            t = (double)((qt_aluno - qt_h)-qt_m25)/qt_aluno;    
            System.out.println(ep.definirFormatPorcent(t));
        
        System.out.println("A probabilidade de sortear um homem com mais de 25 anos e nascido em caragua");
            t = (double)qt_h25/qt_aluno*qt_hc/qt_aluno;
            System.out.println(ep.definirFormatPorcent(t));
       
        System.out.println("A probabilidade de sortear uma mulher com menos de 25 anos e nascida em caragua");
            Double m = (double) qt_aluno - qt_h;
            t = (double)(m-qt_m25)/qt_aluno *qt_mc/qt_aluno;
            System.out.println(ep.definirFormatPorcent(t));
        
        
    }
}

package Aula11;

import Aula10.EspaçoAmostral_e_Probabilidade;
import java.util.ArrayList;

public class Atividade01 {
    public static void main(String[]args){
        EspaçoAmostral_e_Probabilidade ep = new EspaçoAmostral_e_Probabilidade();
        
        System.out.println("1 - Em relação ao lançamento de um dado, determine:");
        
        System.out.println("a) O espaço amostral");
        
        System.out.println(ep.definirEspaçoAmostral(6));
        
        System.out.println("b) O evento de se obter um número primo e par");
        System.out.println("No caso de PAR:");
        ArrayList<Integer> ed = new ArrayList();
        ed.add(2); ed.add(4); ed.add(6);
        System.out.println(ep.definirFormatEvento(ed));
        System.out.println("\n No caso d IMPAR:");
        ed.clear();
        ed.add(1); ed.add(3); ed.add(5);
        System.out.println(ep.definirFormatEvento(ed));
        
        
        
        
        
        
        
    }
}

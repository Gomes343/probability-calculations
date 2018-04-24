package Aula10;

import java.awt.List;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class EspaçoAmostral_e_Probabilidade {
    DecimalFormat df = new DecimalFormat("#0.00");
    int amostraTotal;

    public String definirFormatPorcent(double x){
        x = x * 100;
        String l = df.format(x);
        l = l.concat(" %");
        
        return l;
    }
    
    public String definirFormatEvento(ArrayList x){
        String a = "{";
        for(int i = 0 ; i < x.size() ; i++){
            a = a.concat(Integer.toString((int) x.get(i)));
            if(i != x.size()-1){
                a = a.concat(",");
            }
        }
        a = a.concat("}");
        x.clear();
        return a;
        
    }
    public double definirEspaçoAmostral(int x){
        
        return (double) Math.pow(x, 2);
        
    }
    
    
}

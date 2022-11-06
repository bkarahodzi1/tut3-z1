package ba.unsa.etf.rpr;

import java.util.*;
import java.util.stream.Collectors;

public class Imenik {
    private Map<String,TelefonskiBroj> imenik=new HashMap<>();
    public void dodaj(String ime,TelefonskiBroj broj){
        imenik.put(ime,broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    public String dajIme (TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj>clan: imenik.entrySet())
        {
            if(clan.getValue().equals(broj))
            {
                return clan.getKey();
            }
        }
        return "1";
    }
    public String naSlovo(char s){
        String pom=null;
        for(Map.Entry<String,TelefonskiBroj>clan: imenik.entrySet()){
            char c=clan.getKey().charAt(0);
            int x=1;
            if(s==c){
                pom=x+". "+clan.getKey()+" - "+clan.getValue().ispisi()+"\n";
                x++;
            }
        }
        return pom;
    }
    public Set<String> izGrada(Grad g){
        Set<String>s=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj>clan: imenik.entrySet())
        {
            if(clan.getValue() instanceof FiksniBroj && ((FiksniBroj) clan.getValue()).getGrad().equals(g))s.add(clan.getKey());
        }
        return s;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj>s=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj>clan: imenik.entrySet())
        {
            if(clan.getValue() instanceof FiksniBroj && ((FiksniBroj) clan.getValue()).getGrad().equals(g)) {
                s.add(clan.getValue());
            }
        }
        return s;
    }
}

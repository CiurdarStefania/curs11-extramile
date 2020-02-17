package ro.fasttrackit.curs11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BuquetOfFlowers {
    private final Set<String> flowers= new HashSet<>();
    public void remove(String removeFlowers){
        flowers.remove("lalea");
    }
    public void add(String addFlowers){
        flowers.add("trandafir");
    }

  //  public Collection<String> getAll(){

       // }


}

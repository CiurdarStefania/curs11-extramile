package ro.fasttrackit.curs11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private final List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = fruits;
    }
    

    public int count(){
        for (int i = 0; i<fruits.size();i++){
           return i;
        }
        return -1;
    }

    public void add(String addFruit) {
        fruits.add(addFruit);
    }

    public Collection<String> distinct() {
        return new ArrayList<>(new HashSet<>(fruits));
    }

    public int position(String returnsPosition) {
        for (int i = 0; i < fruits.size(); i++) {
            int pos = fruits.indexOf(returnsPosition);
            return pos;
        }
        return -1;
    }

    public boolean remove(String removeFruits) {
        if (fruits.remove(removeFruits)) {
            return true;
        }
        return false;
    }

    public boolean find(String findFruit) {
        for (String fruit : fruits) {
            if (fruit.equals(findFruit)) {
                return true;
            }
        }
        return false;
    }
}

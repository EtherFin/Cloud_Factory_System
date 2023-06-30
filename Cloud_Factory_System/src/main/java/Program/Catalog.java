package Program;

import java.util.*;
import java.lang.*;

public class Catalog<T> implements Iterable<T>{
    private final ArrayList<T> list;
    public Catalog(){
        list = new ArrayList<T>();
    }
    public ArrayList<T> getList(){
        return list;
    }

    public void add(T t){
        list.add(t);
    }

    public Iterator<T> iterator(){
        return list.iterator();
    }
    public T get(int index){
        if(index < 0 || index >= list.size()) throw new IndexOutOfBoundsException();{
            return list.get(index);
        }
    }
    public int getLengthOfList(){
        return list.size();
    }
    public void remove(T t) {
        int index = list.indexOf(t);
        if (index >= 0) {
            list.remove(index);
        }
    }
    public void change(T t, T newT){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(t)) list.set(i, newT);
        }
    }
}

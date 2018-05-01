import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class MyClass {
    public static void main(String args[]) {
    
    ArrayList names = new ArrayList();
    
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
    
    
 
    Iterator it = names.iterator();
 
         while(it.hasNext()) {
             String obj = (String)it.next();
            System.out.println(obj);
         }
         
    List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        
        
        
        litr=li.listIterator();
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
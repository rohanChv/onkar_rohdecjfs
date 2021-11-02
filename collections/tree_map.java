package string;
import java.util.*;
public class tree_map {  
    public static void main(String[] args) { 

          TreeMap<Long ,contact> treeMap = new TreeMap<Long, contact>(); 
          treeMap.put((long)203010,new contact(10,  "Anil"));
          treeMap.put((long)102030,new contact(10,  "Mahesh"));
          treeMap.put((long)506020,new contact(10,  "John"));
          treeMap.put((long)978940,new contact(10,  "Nagesh"));
          for (Map.Entry<Long,contact> map : treeMap.entrySet()) {
                System.out.println("Key : ("+map.getKey()+ "), Value : "+ map.getValue());
          }
    }
}

class contact { 

    private Integer id;
    private String name; 

    public contact(Integer id, String name) {
         this.id = id;
         this.name = name;
    }
    public Integer getId() {
         return id;
    }
    public void setId(Integer id) {
         this.id = id;
    }
    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public String toString() {
         return this.name+":"+id;
    }
}

class con1 implements Comparator<contact> {

    public int compare(contact o1, contact o2) {
           return o1.getName().compareTo(o2.getName());
    }

}
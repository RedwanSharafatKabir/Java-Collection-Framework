package Collection;
import java.util.*;
public class Array_List_and_InstanceOF {
    public static void main(String [] args){
        List list = new ArrayList();
        
        list.add("Hello world");
        list.add(5);
        
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);
    }
}

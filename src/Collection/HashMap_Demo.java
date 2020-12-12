package Collection;

import java.util.HashMap;

public class HashMap_Demo {
    public static void main(String [] args){
        HashMap<Integer, String> employee = new HashMap<Integer, String>();

        employee.put(100, "Redwan");
        employee.put(101, "Kabila");
        employee.put(102, "Shukahash");

        System.out.println(employee);
        System.out.println(employee.get(101));

        // remove element on basis of index number
        employee.remove(101);
        System.out.println(employee);

        // check if hashmap is empty
        System.out.println(employee.isEmpty());
    }
}

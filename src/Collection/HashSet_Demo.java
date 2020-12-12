package Collection;

import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        // Stores data by Hash Table
        HashSet<String> studentName = new HashSet<String>();

        studentName.add("Redwan");
        studentName.add("Sharafat");

        System.out.println(studentName);

        for(String hashSet: studentName){
            System.out.print(hashSet + " ");
        }

        // HashSet size
        System.out.println("\nSize: " + studentName.size());

        // remove value
        studentName.remove("Sharafat");
        System.out.println(studentName);

        // clear HashSet
        studentName.clear();
        System.out.println("Cleared HashSet: " + studentName);

        // check if empty
        boolean testHashSet = studentName.isEmpty();
        System.out.println("HashSet clearing status: " + testHashSet);
    }
}

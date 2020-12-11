package Collection;

import java.util.LinkedList;

public class LinkedList_Dubly {
    public static void main(String [] args){
        LinkedList<String> countryNames = new java.util.LinkedList<String>();

        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("Canada");
        countryNames.add("Egypt");

        System.out.println(countryNames);
        for(String country: countryNames){ // For each loop
            System.out.println(country);
        }
        System.out.println("Size of linkedlist: " + countryNames.size());

        // add value indicating index
        countryNames.add(2, "West Indies");
        System.out.println(countryNames);

        // addFirst() and addLast() method
        countryNames.addFirst("Armenia");
        countryNames.addLast("Fuzi");
        System.out.println(countryNames);

        countryNames.remove("Canada"); // remove the element writing direct value
        countryNames.remove(3); // remove element of index number
        countryNames.removeFirst(); // remove first element
        countryNames.removeLast(); // remove last element
        System.out.println(countryNames);

        System.out.println("First element: " + countryNames.getFirst()); // print first element
        System.out.println("Last element: " + countryNames.getLast()); // print last element
        System.out.println("Value of index 1: " + countryNames.get(1)); // print value of specific index

        // clear the linkedlist
        countryNames.clear();
        System.out.println("Cleared linkedlist: " + countryNames);
    }
}

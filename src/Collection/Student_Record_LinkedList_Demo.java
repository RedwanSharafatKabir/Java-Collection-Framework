package Collection;

import java.util.LinkedList;

public class Student_Record_LinkedList_Demo {
    public static void main(String[] args){
        LinkedList<Student_Record_LinkedList> list = new LinkedList<Student_Record_LinkedList>();

        Student_Record_LinkedList s1 = new Student_Record_LinkedList(8737, "Redwan", "B.Sc.");
        Student_Record_LinkedList s2 = new Student_Record_LinkedList(8787, "Ayon", "B.Sc.");
        Student_Record_LinkedList s3 = new Student_Record_LinkedList(9087, "Discount", "B.Sc.");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(Student_Record_LinkedList studentList: list){
            System.out.println("ID: " + studentList.id + " Name:  " + studentList.name + " Class: " + studentList.classLevel);
        }
    }
}

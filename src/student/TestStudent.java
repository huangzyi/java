package student;

import java.util.Scanner;
public class TestStudent { 
        public static void main(String[] args) { 
            Scanner in = new Scanner(System.in); 
            String id, name; 
            int h, w; 
            System.out.println("id,name,height,weight:"); 
            id = in.nextLine(); 
            name = in.nextLine(); 
            h = in.nextInt(); 
            w = in.nextInt(); 
            Student stu = new Student(id, name, h, w); 
            System.out.println(stu); 
            stu.setHeight(h + 100); 
            System.out.println(stu); 
            Student stu2 = new Student(stu); 
            stu2.setWeight(stu2.getWeight() + 300); 
            System.out.println(stu2); 
        } 
}
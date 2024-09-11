import java.util.Arrays;

public class newClasses {
    class Student{
        int rollNo;
        String name;
        Float marks;
    }
   public static void main(String[] args) {
    Student str = new Student();
    System.out.println(Arrays.toString(Student));
   System.out.println( str.name);
    System.out.println(str.rollNo);
    System.out.println(str.marks);
    


   } 
}

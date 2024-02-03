import java.util.ArrayList;
import java.util.Scanner;

public class pass_class_to_arraylist {
    public static void main(String[] Args) {
        ArrayList<student> stud = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of student names you want to enter:");
       int n = sc.nextInt();
        int i;
        System.out.println("enter the details");
        for (i = 0; i < n; i++) {
            student names = new student();
            names.getId();
            names.getName();
            names.getAge();
            names.getEmail();
            stud.add(names);
        }
        for (student st : stud) {
            System.out.println("id:"+st.id+"Name"+st.name+"Age:"+st.age+"Email"+st.Email);
        }

    }
}

class student {
 Scanner src = new Scanner(System.in);

 int id;
 String name;
 int age;
 String Email;

 public String getName() {
  name=src.next();
  return name;
 }

 public String getEmail() {
  Email=src.next();
  return Email;
 }

 public int getAge() {
  age=src.nextInt();
  return age;
 }


 public int getId() {
  id=src.nextInt();
  return id;
 }




}





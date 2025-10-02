import java.util.Scanner;
import java.util.ArrayList;

class emptyException extends Exception {
    public emptyException(String message) {
        super(message);
    }
}
class StudentList{
    private ArrayList<String>Students;
    public StudentList(){
        Students=new ArrayList<>();
    }
    public void addStudent(String name){
           Students.add(name);
           System.out.println(name+" Added");
    }
     public void removeStudent(String name) throws emptyException {
        if (Students.isEmpty()) {
            throw new emptyException("Cannot remove. The student list is empty!");
        }
        if (Students.remove(name)) {
            System.out.println(name + " removed from the list.");
        } else {
            System.out.println(name + " not found in the list.");
        }
    }
    public void displayStudents() {
        if (Students.isEmpty()) {
            System.out.println("Student list is empty.");
        } else {
            System.out.println("Students in the list: " + Students);
        }
    }


}


public class ques1 {
    public static  void main(String []args){
        Scanner sc =new Scanner(System.in);
        StudentList list=new StudentList();
         while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name to add: ");
                        String name = sc.nextLine();
                        list.addStudent(name);
                        break;
                    case 2:
                        System.out.print("Enter student name to remove: ");
                        String removeName = sc.nextLine();
                        list.removeStudent(removeName);
                        break;
                    case 3:
                        list.displayStudents();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (emptyException e) {
                System.out.println("Error: " + e.getMessage());
            }
        
    } 
    }}

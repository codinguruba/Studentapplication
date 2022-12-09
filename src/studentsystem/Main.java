package studentsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int id;
        StudentImp ob = new StudentImp();
        System.out.println("Welcome to Student management application");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                               1. Add Student
                               2. Show All Student
                               3. Update the Student
                               4. Delete the Student
                               """);

            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Student s1 = new Student();
                    System.out.println("Enter ID : ");
                    id = sc.nextInt();
                    System.out.println("Enter name ");
                    name = sc.next();
                    System.out.println("Enter Address ");
                    String address = sc.next();
                    System.out.println("Enter Marks");
                    double marks = sc.nextDouble();
                    s1.setSid(id);
                    s1.setName(name);
                    s1.setAddress(address);
                    s1.setMarks(marks);
                    ob.createStudent(s1);
                    break;
                case 2:
                    ob.showAllStudent();
                    break;

                case 3:
                    System.out.println("Enter id to update the details");
                    int sid1 = sc.nextInt();
                    System.out.println("Enter the new name");
                    name = sc.next();
                    ob.updateStudent(sid1, name);
                    break;
                case 4:
                    System.out.println("Enter the id to delete");
                    id = sc.nextInt();
                    ob.deleteStudent(id);
                    break;

                case 5:
                    System.out.println("Thank you  !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;

            }

        } while (true);

    }
}

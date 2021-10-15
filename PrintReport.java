import java.util.ArrayList;
import java.util.Scanner;

public class PrintReport {
    ArrayList<Displayable> givenClassrooms;
    public PrintReport(){
        Scanner input= new Scanner(System.in);

        givenClassrooms = new ArrayList<Displayable>();
        String userInput ="";
        do{
            Displayable newClassroom = enterClassroom();
            givenClassrooms.add(newClassroom);
            System.out.println("Would you like to enter a new classroom? (Yes to continue  // quit to stop)");
            userInput =input.next();
        } while(!userInput.equals("quit"));

    }
    public Displayable enterClassroom(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Classroom number");
        int cclassroom = input.nextInt();
        if(cclassroom< 100){
            while(cclassroom < 100){
                System.out.println("Enter classroom number must be greater or equal to 100. Try again");
                cclassroom = input.nextInt();
            }

        }
        ArrayList<Displayable> givenStudents = new ArrayList<Displayable>();
        String userInput ="";
        do{
            Displayable newStudent = enterStudents();
            givenStudents.add(newStudent);
            System.out.println("Would you like to enter a new student? (Yes to continue  // quit to stop)");
            userInput =input.next();
        } while(!userInput.equals("quit"));
        Displayable teacher = enterTeacher();

        Classroom enteredClassroom = new Classroom( cclassroom,teacher,givenStudents);
        return (Displayable) enteredClassroom;


    }
    public Displayable enterTeacher(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter teacher's first name:  ");
        String fName = input.next();
        System.out.println(" Enter teacher's last name:  ");
        String lName= input.next();
        System.out.println("Enter teacher's subject:   ");
        String sSubject=input.next();

        Teacher entryTeacher = new Teacher(fName, lName, sSubject);
        return (Displayable) entryTeacher;
    }
    public Displayable enterStudents() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student id:  ");
        int sstudentid = input.nextInt();
        if (sstudentid < 0) {
            while (sstudentid < 0) {
                System.out.println("Entered Student ID must be greater than 0. Try again :");
                sstudentid = input.nextInt();
            }
        }
        System.out.println("Enter firstname:   ");
        String sfirstname = input.next();
        System.out.println("Enter lastname:    ");
        String slastname = input.next();
        System.out.println("Enter Student Final Grade:     ");
        int sFinalGrade = input.nextInt();
        if (sFinalGrade < 0 || sFinalGrade > 100) {
            while (sFinalGrade < 0 || sFinalGrade > 100) {
                System.out.println("Entered Student grade must be greater than 0 or less than a 100. Try again :");
                sFinalGrade = input.nextInt();

            }
        }
        Student entryStudent = new Student(sfirstname, slastname, sstudentid, sFinalGrade);
        return (Displayable) entryStudent;
    }





    public void report(ArrayList<Displayable> givenClassrooms){
        for(int i= 0; i < givenClassrooms.size(); i++){
              givenClassrooms.get(i).display();
        }
    }

}

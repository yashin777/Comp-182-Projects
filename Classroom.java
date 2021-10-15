 import java.util.ArrayList;
    public class Classroom  extends Person implements Displayable {
        // delcare variable
        public int roomNumber;
        public Displayable teacher;
        public ArrayList<Displayable> students;

        // cosntructor
        public Classroom() {

        }

        public Classroom(int givenRoomNumber, Displayable giventeacher, ArrayList<Displayable> givenstudents) {
            roomNumber = givenRoomNumber;
            Displayable teacher = giventeacher;
            ArrayList<Displayable> students = givenstudents;
        }
        @Override
        public String display() {
            String result = "";
            //Add room number
            result += "Room Number: " + roomNumber + "\n";
            result += teacher.display() + "\n";
            for(int i = 0; i < students.size();i++){
                result += students.get(i).display() + "\n";
            }
            return result;

        }
    }


    public class Student  extends Person implements Displayable{
        // declare variables
        private int studentID;
        private int finalGrade;
        // getter and setter
        public int  getStudentID(){
            return this.studentID;
        }
        public void setStudentID(int studentID) {
            this.studentID=studentID;
        }
        public int getFinalGrade() {
            return this.finalGrade;
        }
        public void setFinalGrade(int finalGrade) {
            this.finalGrade=finalGrade;
        }
        // constructor
        public Student(String firstName,String lastName, int studentID, int finalGrade) {
            setfirstName(firstName);
            setlastName(lastName);
            int StudentID=studentID;
            int FinalGrade=finalGrade;
        }
        @Override
        public String display() {
            // TODO Auto-generated method stub
            return "Student ID " + this.studentID + "\t" + getFullName() + " Final Grade: " + this.finalGrade ;
        }
    }


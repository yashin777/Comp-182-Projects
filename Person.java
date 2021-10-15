
    public abstract class Person{
        private String firstName;
        private String lastName;

        public String getfirstName() {
            return firstName;
        }
        public void setfirstName(String firstName) {
            this.firstName=firstName;
        }
        public String  getlastName(String lastName) {
            return lastName;
        }
        public void setlastName(String lastName) {
            this.lastName=lastName;
        }
        public  String getFullName() {
            return  firstName + " " + lastName;
        }
}

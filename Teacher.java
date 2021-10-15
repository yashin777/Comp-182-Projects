public class Teacher extends Person implements Displayable{
    public String subject;

    public Teacher(String firstName,String lastName,String givenSubject) {
        setfirstName(firstName);
        setlastName(lastName);
        subject = givenSubject;
    }

    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject=subject;
    }
    @Override
    public String display() {

        return getFullName() + " teaches " + subject;
    }
}
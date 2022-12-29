public class Teacher extends Person{
    private String mySubject;


    public Teacher() {
    }

    public Teacher(String name, int id, int dateYearStudy) {
        super(name, id, dateYearStudy);
    }

    public Teacher(String name, int id, int dateYearStudy, String subject) {
        super(name, id, dateYearStudy);
        mySubject = subject;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

}

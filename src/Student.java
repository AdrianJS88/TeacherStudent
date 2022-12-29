public class Student extends Person {
    private boolean  stdTax;

    private String name;
    private int id;
    private int dateYearStudy ;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDateYearStudy() {
        return dateYearStudy;
    }

    public void setDateYearStudy(int dateYearStudy) {
        this.dateYearStudy = dateYearStudy;
    }









    public void setStdTax(boolean stdTax) {
        this.stdTax = stdTax;
    }

    public Student(String name, int id, int dateYearStudy, boolean tax ) {
        super(name, id, dateYearStudy);
       boolean stdTax = true ;


    }
}

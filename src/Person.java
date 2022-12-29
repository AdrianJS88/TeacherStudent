public class Person {
    private String myname;

    private int myAge;

    public int getMydateYearStudy() {
        return mydateYearStudy;
    }

    public void setMydateYearStudy(int mydateYearStudy) {
        this.mydateYearStudy = mydateYearStudy;
    }

    private int  mydateYearStudy;

    public Person() {
    }

    public  Person (String name , int id,int dateYearStudy ){
         myname = name;
         myAge = id;
         mydateYearStudy = dateYearStudy;

    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

}

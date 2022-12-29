public class Main {
    public static void main(String[] args) {
        //person info
        Person person1= new Person();
        person1.setMyname("Adrian");



        //Student info
        Student student1= new Student("Marin",12,2002,true);
        LearnMaterial std1 =new LearnMaterial("Java","www.google.ro","tema1");
        student1.setId(1200);
        student1.setDateYearStudy(2022);
        System.out.println("Student1 name : " + student1.getMyname() + " ;  id: " + student1.getId() + "; Books to read:" + std1.getBooks()
              + " ; YEAR OF STUDY : " + student1.getDateYearStudy() + ";");




         //Teacher info

         Teacher teacher1= new Teacher();
         teacher1.setMyname("Maria");
         teacher1.setMySubject("Romana");
         teacher1.setMyAge(28);
        System.out.println("Teacher1 Name : "+teacher1.getMyname());
        System.out.println("Teacher1 Subject :" + teacher1.getMySubject());
        System.out.println("Teacher1 Age : " + teacher1.getMyAge());




    }
}
package LeanAndHomeExams;

public class ExamsDetails {

    public static void main(String[] args){
        //Object of the StudentResults class
        StudentResults aStudents = new StudentResults();
        String sName = aStudents.fullName("Testers Test");
        System.out.println(sName);
        String exam = aStudents.examName("c#");
        System.out.println(exam);
        String score = aStudents.examScore(70);
        System.out.println(score);
        String grade = aStudents.examGrade(70);
        System.out.println(grade);

        //This get all the methods in the StudentResults class
        Certificates c1 = new Certificates();
        String award = c1.certificatAwarded(70);
        System.out.println(exam+ " "+ award);



    }

}

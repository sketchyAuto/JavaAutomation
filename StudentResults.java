package LeanAndHomeExams;

public class StudentResults {
    //Note: The variables you set up inside of methods are only available to those methods.
    // They are not available to other methods. They are said to have local scope
    //These four fields will be available to all the methods that we write in this class,
    // and won't be local to any one method. They are said to have global scope.

    //To make a field variable available only to a particular class, you add the Java keyword private just before the field declaration.

    private String full_Name;
    private String exam_Name;
    private String exam_Score;
    private String exam_Grade;

    /*Because we've made the field variables private, we need another way to assign values to them.
    One way to do this is with something called a constructor. This is a method you can use to set
    initial values for field variables. Constructor methods take the same name as the class.
    Unlike normal methods, class constructors don't need a return type like int or double, nor any return value.
    You can, however, pass values over to your constructors.
     */
    StudentResults(String name, String grade){
        full_Name = name;
        exam_Grade = grade;
    }
    StudentResults(){
        full_Name = "No Name Given";
        exam_Name = "Unknown";
        exam_Score = "No Score";
        exam_Grade = "Unknown";
    }

    String fullName(String aName){
        full_Name = aName;
        return full_Name;
    }

    String examName(String examCode){
        if(examCode.equalsIgnoreCase("M")){
            exam_Name = "Maths";
        }
        else if(examCode.equalsIgnoreCase("JV")){
            exam_Name = "Java";
        }
        else if(examCode.equalsIgnoreCase("C#")){
            exam_Name = "C# .NET";
        }
        else{
            exam_Name = "No Exam Selected";
        }
        return exam_Name;
    }

    String examScore(int aScore){
        exam_Score = aScore + " out of 100";
        return exam_Score;
    }

    //this method is private. Just like field variables, making a method private means it can only be seen inside of this class.
    //To get the grade, we'll set up another method inside of the StudentResults class
    private String getGrade(int aScore){
        String examGrade = "";
        if((aScore>=0)&&(aScore<=20)){
            examGrade = "E";
        }
        else if(aScore>=21 && aScore <=40){
            examGrade = "D";
        }
        else if(aScore >= 41 && aScore <=60){
            examGrade = "C";
        }
        else if(aScore >= 61 && aScore <=80){
            examGrade = "B";
        }
        else if(aScore >= 81){
            examGrade = "A";
        }
        return examGrade;
    }

    //The this keyword means "this class", rather than another class that may have the same method name.
    String examGrade(int aScore){
        exam_Grade = this.getGrade(aScore);
            return exam_Grade;

    }


}

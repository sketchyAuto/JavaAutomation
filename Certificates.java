package LeanAndHomeExams;

public class Certificates extends StudentResults {
    /*To create a sub class (child) from a Java super class (parent), the keyword extends is used.
    You then follow the "extends" keyword with the parent class you want to extend.
     */
    private String certificate;

    /*Just like the StudentResults class we can create a constructor for this new Certificates class.
    When we create an object from the class, Java will first of all call our constructor.
    However, only one constructor can be called. If we call a new constructor from the Certificates class
    all those default values we set up for the StudentResults class fields won't get set. To get around this,
    there is a keyword called super. This makes a call to the constructor from the super class.
    Add the following constructor to your Certificates class:
     */
    Certificates() {
        super();
        certificate = "No Certificate Awarded";
    }

    String certificatAwarded(int aScore){
        String aGrade = examGrade(aScore);
        if(aGrade.equals("A")){
            this.certificate = "Certificate of Excellence";
        }
        else if(aGrade.equals("B")){
            this.certificate = "Certificate of Achievement";
        }
        else if(aGrade.equals("C")){
            this.certificate = "Lower Certificate of Achievement";
        }
        else{
            this.certificate ="No Certificate awarded";
        }
        return this.certificate;
    }
}

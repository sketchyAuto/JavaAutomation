package BasicsStarter;

public class ReturnTypeDemo {
    /*
    Return means it can return a value from the method after doing some calculations
    Return value is captured where we call the method
    if a method does not return anything we use void
    */
    private int cadence;
    private int gear;
    private int speed;
    private int id;

    private static int numberOfBicycles = 0;

    public static void main(String[] args) {
        String grade;
        String studentName;

        studentName = "John";
        grade = findGrades(90);
        displayGrade(studentName, grade);

        //You can enter studentName in the displayGrade or can do the above
        grade = findGrades(79);
        displayGrade("James", grade);
        new ReturnTypeDemo(100,20,4);


    }

    public static String findGrades(int score){
        String grade;
        if(score >= 90 && score <= 100){
            grade = "A";
        } else if (score >= 80 && score < 90){
            grade = "B";
        } else if (score >= 70 && score < 80){
            grade = "C";
        }else{
            grade = "D";
        }
        return grade;

    }

    public static void displayGrade(String studentName, String grade){
        System.out.println("Grade of "+ studentName + " is: " + grade);

    }

    public ReturnTypeDemo(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID(){
        return id;
    }

    public static int getNumberOfBicycles(){
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed(){
        return speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }


}

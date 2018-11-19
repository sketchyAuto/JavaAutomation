package ProjectGrades;

import javax.swing.*;

public class StudentMarking {
    public static void main(String[] args){
        String answer = "";
        String r1 = "wrong";
        String r2 = "wrong";
        String r3 = "wrong";

        int count = 0;

        while (count != 3){
            count++;
            r1 = JOptionPane.showInputDialog("Q1: 5 + 5 \nAnswers \nA: 10 \nB: 5 \nC:15" );
            count++;
            r2 = JOptionPane.showInputDialog("Q1: 5 + 5 \nAnswers \nA: 10 \nB: 5 \nC:15" );
            count++;
            r3 = JOptionPane.showInputDialog("Q1: 5 + 5 \nAnswers \nA: 10 \nB: 5 \nC:15" );

        }



    }



}

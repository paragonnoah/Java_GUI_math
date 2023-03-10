import java.util.Scanner;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.Color;

import java.GraphicalUserInterface;
import java.WeightedGrades;


/**
 *
 * For example, if a 200 point assignment accounts for 35% of the class grade, and the student earned 175 points, then the different attributes would be as follows:
 * Point Total = 200
 * Earned Points = 175*
 * Assignment % = 35%
 * Total Weighted grade = 175 / 200 * .35 *100 = 30.625 for the weighted grade.
 *
 * In this case the student earned 87.5% of the 35% of the class.
 * That total is 30.625 and there will be other parts of the class that add up to 100 possible points.
 */

public class Main {

    public static void main(String[] args) { // implement main method here to execute whole java file

        //create an instance of GraphicalUserInterface.java
         GraphicalUserInterface gui = new GraphicalUserInterface();

        // Create an instance of the WeightedGrades class
        WeightedGrades wg = new WeightedGrades(100, 90, 20);
        // Initialize GUI
        gui.initialize();

        // Calculate weighted grades
        grades.calculate();

        // create a new scanner object to take user input from the console
        Scanner scanner = new Scanner(System.in);
        // 1. input total Points:
        System.out.println("Please enter total points (e.g. 200)");
        int totalPoint = scanner.nextInt();

        // 2. input earned Points:
        System.out.println("Please enter student's earned points (e.g. 175) ");
        double earnedPoints = scanner.nextDouble();

        // 3. input assignment Percentage:
        System.out.println("Please enter student's assignment percentage(e.g. 35%, please type in '35' )");
        double assignmentPercentage = scanner.nextDouble();

        // create a new object here with the 3 input parameters:
        WeightedGrades weightedGrades =
                new WeightedGrades(totalPoint, earnedPoints, assignmentPercentage);

        // utilize the object to call calculation method here:
        weightedGrades.calculateWeightedGrades();

        //to print out the whole results:
        System.out.printf("This is your input overview: " +'\n'+
                        "Total point is: " + weightedGrades.getTotalPoint() +'\n'+
                        "Earned point is: " + weightedGrades.getEarnedPoints() +'\n'+
                        "Assignment percentage is: " + weightedGrades.getAssignmentPercentage()+'\n'+
                        "Total weighted grade is: " + weightedGrades.getTotalWeightedGrade());





    }
}

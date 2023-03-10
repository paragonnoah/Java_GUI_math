// here you write the code to finish the GUI interface with the existed two java clas
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalUserInterface extends JFrame {
    // Declare labels, text fields and button
    private JLabel lblTotalPoints, lblEarnedPoints, lblAssignmentPercentage, lblTotalWeightedGrade;
    private JTextField txtTotalPoints, txtEarnedPoints, txtAssignmentPercentage, txtTotalWeightedGrade;
    private JButton btnCalculate;

    public GraphicalUserInterface() {
        // Set the frame properties
        setTitle("Weighted Grade Calculator");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel to hold components
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        // Create labels, text fields and button
        lblTotalPoints = new JLabel("Total points:");
        txtTotalPoints = new JTextField(10);
        lblEarnedPoints = new JLabel("Earned points:");
        txtEarnedPoints = new JTextField(10);
        lblAssignmentPercentage = new JLabel("Assignment percentage:");
        txtAssignmentPercentage = new JTextField(10);
        lblTotalWeightedGrade = new JLabel("Total weighted grade:");
        txtTotalWeightedGrade = new JTextField(10);
        txtTotalWeightedGrade.setEditable(false);
        btnCalculate = new JButton("Calculate");

        // Add components to panel
        panel.add(lblTotalPoints);
        panel.add(txtTotalPoints);
        panel.add(lblEarnedPoints);
        panel.add(txtEarnedPoints);
        panel.add(lblAssignmentPercentage);
        panel.add(txtAssignmentPercentage);
        panel.add(lblTotalWeightedGrade);
        panel.add(txtTotalWeightedGrade);
        panel.add(btnCalculate);

        // Add action listener to button
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input values from text fields
                    int totalPoints = Integer.parseInt(txtTotalPoints.getText());
                    double earnedPoints = Double.parseDouble(txtEarnedPoints.getText());
                    double assignmentPercentage = Double.parseDouble(txtAssignmentPercentage.getText());

                    // Calculate weighted grades
                    WeightedGrades weightedGrades = new WeightedGrades(totalPoints, earnedPoints, assignmentPercentage);
                    weightedGrades.calculateWeightedGrades();

                    // Set output value in text field
                    txtTotalWeightedGrade.setText(Double.toString(weightedGrades.getTotalWeightedGrade()));
                } catch (NumberFormatException ex) {
                    // Handle invalid input values
                    JOptionPane.showMessageDialog(panel, "Invalid input. Please enter numeric values.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Create and show GUI
        GraphicalUserInterface gui = new GraphicalUserInterface();
        gui.setVisible(true);
    }
}

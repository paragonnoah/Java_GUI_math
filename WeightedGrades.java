import java.text.DecimalFormat;

public class WeightedGrades {
    // 4 private attributes/fields declarations as following:
    // All 4 attributes should be private to be hidden from users.
    private int totalPoint;
    private double earnedPoints;
    private double assignmentPercentage;
    private double totalWeightedGrade;

    // import and create a helper method to precise the calculated result to round to 3 decimals
    // DecimalFormat can help to format the output
    private static final DecimalFormat df = new DecimalFormat("0.000");

    // 1 Constructor:
    public WeightedGrades(int totalPoint, double earnedPoints, double assignmentPercentage) {
        this.totalPoint = totalPoint;
        this.earnedPoints = earnedPoints;
        this.assignmentPercentage = assignmentPercentage;
    }

    // 4 public setter methods:
    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
    public void setAssignmentPercentage(double assignmentPercentage) {
        this.assignmentPercentage = assignmentPercentage;
    }

    // this is the formula to calculate the total weighted grade:
    public void calculateWeightedGrades(){
        totalWeightedGrade = Double.parseDouble(df.format((earnedPoints/totalPoint) * assignmentPercentage/100 *100));
    }

    // 4 public getter methods as following:
    public double getEarnedPoints() {
        return earnedPoints;
    }

    public double getAssignmentPercentage() {
        return assignmentPercentage;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public double getTotalWeightedGrade() {
        return totalWeightedGrade;
    }



    // the following method is for main class's second method to print out the results list
//    @Override
//    public String toString() { // toString method here is to convert the non-string type to string type
//        return "CalculateWeightedGrades{" +
//                "totalPoint=" + totalPoint +
//                ", earnedPoints=" + earnedPoints +
//                ", assignmentPercentage=" + assignmentPercentage +
//                ", totalWeightedGrade=" + totalWeightedGrade +
//                '}';
//    }

}

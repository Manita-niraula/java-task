// 9 Take marks of five subjects and calculate the total, percentage, and grade using if-else.
public class q9 {
    public static void main(String[] args) {
        int[] marks = new int [4];
        marks[0]= 77;
        marks[1]= 73;
        marks[2]= 66;
        marks[3]= 65;
        int totalMarks = (marks[0] + marks[1] + marks[2]+ marks[3]);
        double percentage= totalMarks/4.0;

        String result= (percentage >= 70) ? "First Class" :
                       (percentage > 59) ? "Upper Second Class" :
                       (percentage > 49) ?  "Second class" :
                       (percentage > 39) ? "Third class" : "Fail"; 
        System.out.println("The total Marks secured = " + totalMarks);               
        System.out.println("The total percentage secured = " + percentage + "%"); 
        System.out.println("Result = " + result);        
    }
}
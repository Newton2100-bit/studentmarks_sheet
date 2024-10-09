import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name, roll_no, recommendation, firstName;
        int semester, databaseScore, systemsScore, algorithimScore, statisticsScore, total;
        char grade;
        float averageMark;
        Scanner input = new Scanner(System.in);
        //getting the student's name
        System.out.println();
        System.out.println();
        System.out.print("Good morning student please enter your name : ");
        name = input.nextLine();
        int space = name.indexOf(" ");
        firstName = name.substring(0, space);//getting the student's first name
        System.out.println("\nThank you " + name);
        //getting the roll number from the student
        System.out.print(firstName + " Kindly enter registration number: ");
        roll_no = input.nextLine();
        //getting the users current semester
        System.out.print(firstName + " Kindly enter your current semester of study : ");
        semester = input.nextInt();
        //getting database marks from the student
        System.out.print(firstName + " Kindly enter the marks you obtained in the database unit exam (0-100): ");
        databaseScore = input.nextInt();
        //getting systems marks from the student
        System.out.print(firstName + " kindly enter the marks you obtained in the Systems unit exam (0-100): ");
        systemsScore = input.nextInt();
        //getting statistics marks from the user
        System.out.print(firstName + " kindly enter the marks you obatained in the algorithims unit exam (0-100): ");
        algorithimScore = input.nextInt();
        //getting statistics marks from the user
        System.out.print(firstName + " kindly enter the marks you obatained in the Statistics unit exam (0-100): ");
        statisticsScore = input.nextInt();

        //calculating the total marks
        total = databaseScore + systemsScore + algorithimScore + statisticsScore;
        //assigning the grade with the respect to the grade obtained
        int unitsStudied = 4;
        averageMark = (float) total / unitsStudied;
        if (averageMark >= 70 && averageMark <= 100)
            grade = 'A';
        else if (averageMark >= 60)
            grade = 'B';
        else if (averageMark >= 50)
            grade = 'C';
        else if (averageMark >= 40)
            grade = 'D';
        else
            grade = 'F';
        //assigning the recommendation with respect to the garde obtained
        if (averageMark >= 70 && averageMark <= 100)
            recommendation = "Excellent";
        else if (averageMark >= 60)
            recommendation = "Very Good";
        else if (averageMark >= 50)
            recommendation = "Good";
        else if (averageMark >= 40)
            recommendation = "Fair";
        else
            recommendation = "repeat";

        String space1 = "                             ";

        System.out.println();
        System.out.println(space1 + "***********************This is your marks sheet****************************");
        System.out.println();
        System.out.println(space1 + "                    Department of Computer Science              ");
        System.out.println(space1 + "                         End Semester Results                    ");
        System.out.println(space1 + "----------------------------------------------------------------------------");
        System.out.println(space1 + "|Name: " + name + "    |RollNo:  " + roll_no + "     |Semester:  " + semester);
        System.out.println(space1 + "_____________________________________________________________________________");
        System.out.println(space1 + "|Unit Code                |Unit Name                   |Score");
        System.out.println(space1 + "-----------------------------------------------------------------------------");
        System.out.println(space1 + "|CCS2101                  |Database                    |" + databaseScore);
        System.out.println(space1 + "|CCS2102                  |Systems                     |" + databaseScore);
        System.out.println(space1 + "|CCS2103                  |Algorithm                   |" + algorithimScore);
        System.out.println(space1 + "|CCS2104                  |Statistics                  |" + statisticsScore);
        System.out.println(space1 + "-----------------------------------------------------------------------------");
        System.out.println(space1 + "|Total:                                                |" + total);
        System.out.println(space1 + "-----------------------------------------------------------------------------");
        System.out.println(space1 + "|Average:                                              |" + averageMark);
        System.out.println(space1 + "-----------------------------------------------------------------------------");
        System.out.println(space1 + "|Grade:                                                |" + grade);
        System.out.println(space1 + "-----------------------------------------------------------------------------");
        System.out.println(space1 + "                                         recoomendation|" + recommendation);
        System.out.println(space1 + "-----------------------------------------------------------------------------");
        System.out.println(space1 + "Grading Criteria                     Overrall Grade(A-D)  Recommend pass");
        System.out.println(space1 + "70-100                                      A             Excellent ");
        System.out.println(space1 + "60-69                                       B             Very Good");
        System.out.println(space1 + "50-59                                       C              Good");
        System.out.println(space1 + "40-49                                       D              Fair");
        System.out.println(space1 + "Below 40                                    F              Failed");
        System.out.println(space1 + "-----------------------------------------------------------------------------");
    }
}
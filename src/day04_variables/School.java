package day04_variables;

/*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
public class School {
    public static void main(String[] args) {
        int numberOfStudentsInGradeOne = 40;
        int numberOfStudentsInGradeTwo = 25;
        int numberOfStudentsInGradeThree = 34;
        int numberOfStudentsInGradeFour = 19;
        int numberOfStudentsInGradeFive = 28;

        //int totalNumber = 40 + 25 + 34 + 19 + 28; //146
        int totalNumber = numberOfStudentsInGradeOne + numberOfStudentsInGradeTwo + numberOfStudentsInGradeThree + numberOfStudentsInGradeFour + numberOfStudentsInGradeFive;
        System.out.println(totalNumber);
        double numberOfSchoolDay = 100.5;
        double numberOfSnowDays = 5.5;
        double фaverageGraInSchool = 3.6;

        System.out.print("Total number of students: " + totalNumber);



    }
}
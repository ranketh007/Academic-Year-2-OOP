import java.util.Scanner;

public class Week01_Tutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Object-Oriented Programming");
        System.out.println("Java Refresher – Week 01");

        //String studentName = "Dinitha";
        //int age = 19;
        //double averageMark = 80.0;
        //char grade = 'B';
        //boolean passed = true;
        //System.out.println(studentName);
        //System.out.println(averageMark);
        //System.out.println(grade);
        //System.out.println(passed);

        //System.out.println("Enter your name:");
        //String sName = sc.nextLine();

        //System.out.println("Enter your age");
        //int age = sc.nextInt();

        //System.out.print("Enter your mark: ");
        //double mark = sc.nextDouble();

        //System.out.println(sName + " obtained " + mark + " marks");

        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Addition: %d".formatted(num1 + num2));
        System.out.println("Subtraction: %d".formatted(num1 - num2));
        System.out.println("Multiplication: %d".formatted(num1 * num2));
        System.out.println("Division: %d".formatted(num1 / num2));
        System.out.println("Remainder: %d".formatted(num1 % num2));

        //Circle area calculation
        System.out.println("Enter radius:");
        int radius = sc.nextInt();
        double area = 0.0;
        area = Math.PI * radius * radius;
        System.out.println("Area: %.2f".formatted(area));

        //conditional statements
        System.out.println("Enter your mark");
        int mark2 = sc.nextInt();
        if (0 < mark2 && mark2 < 40) {
            System.out.println("Fail");
        }else if(40 <= mark2 && mark2 <= 59){
            System.out.println("Pass");
        }else if(60 <= mark2 && mark2 <=69){
            System.out.println("Merit");
        }else if(70 <= mark2 && mark2 <=100){
            System.out.println("Distinction");
        }else {
            System.out.println("Invalid mark");
        }

        for(int num = 2; num < 21; num++){
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Enter a number to multiply");
        int multiNum = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println("%d x %d = %d".formatted(multiNum, i, multiNum*i));
        }

        //int inpNum = 1;
        //int total2 = 0;
        //while (inpNum != 0){
        //    System.out.println("Enter number:");
        //    inpNum = sc.nextInt();
        //    total2 += inpNum;
        //    if(inpNum == 0){
        //        System.out.println("Total: " + total2);
        //        System.out.println("Program ended.");
        //    }
        //}

        System.out.println("%.2f".formatted(calculateArea(7)));
        System.out.println("%.2f".formatted(calculateCircumference(14)));

        //Array
        double[] marks = {65, 72, 48, 81, 56};
        double total3 = 0;
        double highestMark = 0;

        for(double val: marks){
            total3 += val;
            if(highestMark < val){
                highestMark = val;
            }
        }
        System.out.println("Total: " + total3);
        System.out.println("Average: %.2f".formatted(total3/marks.length));
        System.out.println("Highest mark: " + highestMark);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}

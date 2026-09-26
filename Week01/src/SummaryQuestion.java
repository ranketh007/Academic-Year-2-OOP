import java.util.Scanner;

public class SummaryQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] values = new int[6];

        for(int i = 1; i < 6; i++){
            System.out.println("Enter number %d".formatted(i));
            int num = sc.nextInt();
            values[i] = num;
        }

    System.out.println("Total: %d".formatted(calculateTotal(values)));
    System.out.println("Average: %.2f".formatted(calculateAvg(values)));
    System.out.println("Highest value: %d".formatted(maxValue(values)));
    }
    public static int calculateTotal(int[] values){
        int total = 0;
        for(int value: values){
            total += value;
        }
        return total;
    }

    public static double calculateAvg(int[] values){
        double total = 0;
        for(int value: values){
            total += value;
        }
        return (total / 5.0);
    }
    public static int maxValue(int[] values){
        int maxVal = 0;
        for(int value: values){
            if(maxVal < value){
                maxVal = value;
            }
        }
        return maxVal;
    }

}

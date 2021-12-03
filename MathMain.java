import java.util.Arrays;
import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {

        System.out.printf("Enter N:");
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();
        int []inputs= new int[x];
        for(int i=0; i<x; i++){
            inputs[i] = scanner.nextInt();
        }
        scanner.close();




        int max = getMax(inputs);
        System.out.printf("Max element : %d in %s%n", max, Arrays.toString(inputs));

        int min = getMin(inputs);
        System.out.printf("Min element : %d in %s%n", min, Arrays.toString(inputs));

    }

    public static int getMax(int ary[]){
        int max = ary[0];
        for (int i = 1; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }
        }
        return max;
    }

    public static int getMin(int ary[]){
        int min = ary[0];
        for (int i = 1; i < ary.length; i++) {
            if (ary[i] < min) {
                min = ary[i];
            }
        }
        return min;
    }
}

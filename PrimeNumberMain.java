import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberMain {

    public static void main(String[] args){

        System.out.printf("Enter a number: ");
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();

        for (int i= 2; i<= x; i++){
            System.out.println("Prime Numbers less than or equal to "+i+" = "+ Arrays.toString(getPrimeNumber(i)));
        }

    }
    private static Integer[] getPrimeNumber (final int n){
       int count=0, count2=0;
        for(int i=2; i<=n; i++){
            boolean isPrime=true;
            for(int j=2; j*j<= i; j++ ){
                if(i%j ==0){isPrime = false; break;}
            }
            if(isPrime){
                count++;
            }
        }
        Integer ary[]= new Integer[count];
        for(int i=2; i<=n; i++){
            boolean isPrime=true;
            for(int j=2; j*j<= i; j++ ){
                if(i%j ==0){isPrime = false; break;}
            }
            if(isPrime){
                ary[count2]=i;
                count2++;
            }
        }

        return ary;
    }

}

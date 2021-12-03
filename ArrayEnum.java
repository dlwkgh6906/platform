import java.util.Scanner;

enum Command {ADD, LIST, SRTA, SRTD, SUM,QUIT, INVALID}
public class ArrayEnum {
    public static void main(String[] args){
        final Scanner scanner= new Scanner(System.in);
        int[] values= new int[100]; int index=0;
        while(true){
            final Command command = getCommand(scanner);
            if(command==Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (  command ) {
                case ADD :
                    final int newValue = getValue(scanner);


                    values[index]=newValue;
                    index++;break;
                case LIST:
                    for(int i = 0; i<index; i++)
                        System.out.print(values[i]+" ");
                    System.out.println("");
                    break;
                case SRTA:
                    for(int i = 0; i<index; i++)
                        System.out.print(values[i]+" ");System.out.println("");break;
                case SRTD:
                    for(int i= index-1; i>=0;i--)
                        System.out.print(values[i]+" ");System.out.println("");break;
                case SUM:
                    int summ=0;
                    for(int i = 0; i<index; i++)
                        summ+=values[i];
                    System.out.println(summ);break;
                default:
                    System.out.println("Invalid Command");

            }
        }
        scanner.close();

    }

    private static int getValue(Scanner scanner) {
        int A= scanner.nextInt();
        return A;
    }
   /* private static void printList(const int* values, int index) {
        System.out.println("Bye!");;
    }*/

    private static Command getCommand(Scanner scanner) {
        String A =scanner.next();
        if(A.equalsIgnoreCase("add"))
            return Command.ADD;
        else if(A.equalsIgnoreCase("list"))
            return Command.LIST;
        else if(A.equalsIgnoreCase("SRTA"))
            return Command.SRTA;
        else if(A.equalsIgnoreCase("SRTD"))
            return Command.SRTD;
        else if(A.equalsIgnoreCase("Sum"))
            return Command.SUM;
        else if(A.equalsIgnoreCase("Quit"))
            return Command.QUIT;
        else return Command.INVALID;
    }

}



import java.util.Scanner;
enum Command {ADD, SORT, REMOVE, CLEAN, QUIT, INVALID}
public class StringSetManager {
        public static void main(String[] args){
            final Scanner scanner= new Scanner(System.in);
            String[] stringSet = new String[1000];
            int index=0;

            while(true){
                final Command command = getCommand(scanner);
                if(command==Command.QUIT){
                    System.out.println("BYE!");
                    break;
                }
                switch (  command ) {
                   case ADD :
                        final String str = getString(scanner);
                        int a=0;
                        for(int i=0; i<index;i++){
                            if(str.equals(stringSet[i]))
                               a++;
                        }
                        if(a!=0){System.out.printf("Element Size: %d, Values = [", index);
                        if(index==1){
                            System.out.print(stringSet[0]+"]\n");break;}
                        for(int i = 0; i<index; i++){
                            System.out.print(stringSet[i]);
                            if(i!=index-1)System.out.print(", ");
                            else System.out.println("]");}break;}

                        stringSet[index]=str;

                        index++;

                        System.out.printf("Element Size: %d, Values = [", index);
                        if(index==1){
                            System.out.print(stringSet[0]+"]\n");break;}
                        for(int i = 0; i<index; i++){
                            System.out.print(stringSet[i]);
                            if(i!=index-1)System.out.print(", ");
                            else System.out.println("]");}break;
                    case SORT:
                        final String str2 = getString(scanner);
                        System.out.printf("Element Size: %d, Values = [", index);
                        if(str2.equalsIgnoreCase("ASC"))
                        {     if(index==1){
                            System.out.print(stringSet[0]+"]\n");break;}
                            String[] BU= new String[index];
                            BU[0]=stringSet[index-1];
                            for(int j=0; j<index-1;j++)
                                BU[j+1]=stringSet[j];
                            for(int k=0; k<index; k++){
                                stringSet[k]=BU[k];
                            }
                            for(int i = 0; i<index-1; i++){
                                System.out.print(stringSet[i]);
                                System.out.print(", ");
                                }
                            System.out.println(stringSet[index-1]+"]");break;
                        }
                        if(str2.equalsIgnoreCase("DESC"))
                        {   if(index==1){
                            System.out.print(stringSet[0]+"]\n");break;}
                            String BU2=stringSet[0];
                            for(int j=0; j<index;j++)
                            stringSet[j]=stringSet[j+1];
                            stringSet[index-1]=BU2;

                        for(int i = 0; i<index; i++){
                            System.out.print(stringSet[i]);
                            if(i!=index-1)System.out.print(", ");
                            else System.out.println("]");}
                        }break;
                    case REMOVE:
                        final String str3 = getString(scanner);
                        for(int i = 0; i<index; i++)
                            if(str3.equals(stringSet[i]))
                            {   for(int j=i; j<index;j++)
                                stringSet[j]=stringSet[j+1];
                                stringSet[index-1]=null;
                                index+=-1;
                            }
                        System.out.printf("Element Size: %d, Values = [", index);
                        if(index==1){
                            System.out.print(stringSet[0]+"]\n");break;}
                        for(int i = 0; i<index; i++){
                            System.out.print(stringSet[i]);
                            if(i!=index-1)System.out.print(", ");
                            else System.out.println("]");}break;

                    case CLEAN:
                        for(int j = 0; j<index; j++)
                            stringSet[j]=null;
                        index=0;

                        System.out.printf("Element Size: %d, Values = []\n", index);

                        for(int i = 0; i<index; i++){
                            System.out.print(stringSet[i]);
                            System.out.print(", ");
                            System.out.println(stringSet[index-1]+"]");}
                        break;

                    default:
                        System.out.println("Invalid Command");

                }
            }
            scanner.close();

        }

        private static String getString(Scanner scanner) {
            String A= scanner.next();
            return A;
        }
   /* private static void printList(const int* values, int index) {
        System.out.println("Bye!");;
    }*/

        private static Command getCommand(Scanner scanner) {
            String A =scanner.next();
            if(A.equalsIgnoreCase("ADD"))
                return Command.ADD;
            else if(A.equalsIgnoreCase("SORT"))
                return Command.SORT;
            else if(A.equalsIgnoreCase("REMOVE"))
                return Command.REMOVE;
            else if(A.equalsIgnoreCase("CLEAN"))
                return Command.CLEAN;
            else if(A.equalsIgnoreCase("Quit"))
                return Command.QUIT;
            else return Command.INVALID;
        }




}

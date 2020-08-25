import java.util.Scanner;

public class lessgreat {
    public static void main( String[]args)
    {

            int number = 10;
            Scanner input=new Scanner(System.in);
        System.out.println("please enter the number: ");
        number = input.nextInt();



            if (number > 10) {
                System.out.println(number+ " is greater than 10.");
            }
           else if(number <10 ){

               System.out.println(number+ " is less than 10.");
                }
           else{System.out.println(number+ " is equal to  10.");

            }

            System.out.println("Application finished.");
        }
    }




package prince;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.*;


public class Main{
    public static void main(String[] args){
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber= 0;
        do{
            System.out.println("Guess my number : ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("Wohoo bro correct number");
                break;
            }
            else if (userNumber>myNumber){
                System.out.println("Your number is greater");
            }
            else {
                System.out.println("Your number is samller");
            }
        }while(userNumber>=0);

        System.out.println("the number was : " + myNumber);




    }
}
import java.util.Scanner;
public class Leapyear {
       public static void main(String[]args) {
           Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the year to be check if its Leap or not"); 
       // year to be checked
      int year = scanner.nextInt();
 
     // if the year is divided by 4
        if(year%4==0) {
             System.out.println("Given year is leap year");
            }
       else{
             System.out.println("Given year is not a leap year");
     }
   }
  }

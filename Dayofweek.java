import java.util.Scanner;
public class Dayofweek
{
     public  static void main(String args[]){
              // Switch case 1->Monday 2.>Tuesday 3.>Wednesday
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the range :");
       //0-100
         int range =scanner.nextInt();
       //for , do-while ,while
               for (int i=0;i<=range;i++){
                  if(i%2==0){
                       System.out.println("Even : "+i);
                   }else
                        System.out.println("Odd :"+i);
         }
      }
  }

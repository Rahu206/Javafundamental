public class EmpWageBuilderUC4 {
     //Constants
      public static final int IS_PART_TIME = 1;
       public static final int IS_FULL_TIME = 2;
       public static final int EMP_RATE_PER_HOUR = 20 ; 

         public static void main(String args[])  {
           //variables
           int empHours = 0;
           int empWages = 0;
                   //Computation
        int empCheck =(int) Math.floor(Math.random() * 10) % 3;
             switch  (empCheck) {
                  case IS_FULL_TIME:
                  empHours =8;
                     break;
             case IS_PART_TIME:
                    empHours = 4;
                     break;
               default :
                     empHours = 0;
   }
             empWages = empHours * EMP_RATE_PER_HOUR;
             System.out.println("Emp Wage: " + empWages );
    }
  }

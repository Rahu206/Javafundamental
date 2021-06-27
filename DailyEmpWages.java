public class DailyEmpWages {
	public static void main(String[] arg) {
	double wages, rate, hours;
	System.out.print("Enter the working hours:");
	hours =20;
	System.out.println();
	System.out.print("Enter the pay rate:");
	rate =8 ;
	System.out.println();
		wages = hours * rate;
	System.out.printf("The wages are $%.2f %n",
				wages);
	System.out.println();
	}
}

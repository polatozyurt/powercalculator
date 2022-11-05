import java.util.Scanner;
public class calculatingpowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		//defining variables
		int num1, num2, total ,i ;
		total = 1 ;
		//taking inputs from the user
		System.out.print("Enter the number to be taken the power of: ");
		num1 = input.nextInt();
		System.out.print("Enter the power: ");
		num2 = input.nextInt();
		//System.out.print(Math.pow(num1, num2));
		

		/*creating loops to calculate 
		for(int i = num1 ; i<=num2 ; ) {
			total *= num1 ;
			i++ ;
		}
		System.out.print(total);
		
	*/
		for (i=1; i<=num2 ; i++) {
			total *=num1 ;
		}
		System.out.print(total);

	}

}

import java.util.Scanner;

public class SmallestAndLargestSum{

	public static void main(String [] args){
		
		try(Scanner sc = new Scanner( System.in ) ){

			System.out.println("Enter first number: ");
			int firstNo = sc.nextInt();

			System.out.println("Enter second number: ");
			int secondNo = sc.nextInt();
	
			System.out.println("Enter third number: ");
			int thirdNo = sc.nextInt();

			int smallest = 0;
			int largest = 0;

			if ( firstNo < secondNo && firstNo < thirdNo ) {
				smallest = firstNo;
				if ( secondNo > thirdNo ){
					largest = secondNo;
				}
			}else if ( secondNo < firstNo && secondNo < thirdNo ){
				smallest = secondNo;
				if ( firstNo > thirdNo ){
					largest = firstNo;
				}
			} else {
				smallest = secondNo;
				largest = thirdNo;
			}
						
			System.out.println("Smallest Number is: "+ smallest);
			System.out.println("Largest Number is: "+ largest);

			int sum = smallest + largest;
			System.out.println("Sum of largest and smallest number is: " + sum);
		}
	}
}

// write a Java program that accepts 3 numbers from the user and finds the sum of the smallest and the largest.

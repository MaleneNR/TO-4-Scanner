import java.util.Scanner;

class MainTask2{
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type your name:");

		String name = scan.nextLine();

		System.out.println("\nHello "+ name +",\nPlease type your age:");

		int age = scan.nextInt();

		System.out.println("You are " + age + " years old\n");

		int yearsUntilRetirement = 67;

		System.out.println("You have " + (yearsUntilRetirement-age) + " years until retirement");



	}
}
import java.util.Scanner;

public class Assignment2 {
	public static void main(final String[] args) {

		final Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter price of item: ");
		int amount = keyboard.nextInt();
		if (amount < 25) {
			System.out.print("Invalid Amount: Cost under 25 cents");
			System.exit(0);
		}
		if (amount > 100) {
			System.out.print("Invalid Amount: cost is more than a Dollar");

			System.exit(1);
		}

		if (amount % 5 != 0) {
			System.out.print("Invalid Amount: cost is not Integer multiple to 5");
			System.exit(2);
		}
		System.out.print("You bought an item for " + amount);

		amount = 100 - amount;
		System.out.println(" And your change is " + amount);

		final int quarter = amount / 25;
		amount -= quarter * 25;
		System.out.println(quarter + " quarter(s)");

		final int dime = amount / 10;
		amount -= dime * 10;
		System.out.println(dime + " dime(s)");

		final int nickel = amount / 5;
		amount -= nickel * 5;
		System.out.println(nickel + " nickel(s)");

		final int pennie = amount / 1;
		amount -= pennie *1;
		System.out.println(pennie + " Pennie(s)");
		
		keyboard.close();
		
	}

}

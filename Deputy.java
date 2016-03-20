package rada;

import java.util.Scanner;

/**
 * This class contains all the information about deputy.
 * The information is entered from the console
 * 
 * @author Ivan
 *
 */
public class Deputy {

	Scanner sc = new Scanner(System.in);

	String name;
	String gender;
	int age;
	boolean grafter;

	public Deputy() {
		System.out.println("Enter deputy's name");
		this.name = readName();
		System.out.println("Enter person's gender.\n\"M\", if male.\n\"W\", if female.");
		this.gender = readGender();
		System.out.println("Enter deputy's age");
		this.age = readAge();
		System.out.println("How much of bribe in USD?");
		this.grafter = readBride();
	}

	/**
	 * Reads words from the console
	 * @return the correct name
	 */
	public String readName() {
		while (true) {
			if (!(sc.hasNextInt())) {
				String s = sc.nextLine().trim();
				while (s.contains("  ")) {
					System.out.println("Your input is wrong, try again");
					sc = new Scanner(System.in);
					s = sc.nextLine().trim();
				}
				return s;
			}
		}
	}

	/**
	 * Reads words from the console
	 * @return person's gender
	 */
	public String readGender() {
		while (true) {
			if (!(sc.hasNextInt())) {
				if (!(sc.hasNextInt())) {
					String s = sc.nextLine().trim().toLowerCase();
					while (!(s.startsWith("m") || s.startsWith("ü") || s.startsWith("w") || s.startsWith("ö"))) {
						System.out.println("Your input is wrong, try again");
						sc = new Scanner(System.in);
						s = sc.nextLine().trim().toLowerCase();
					}
					if (s.startsWith("m") || s.startsWith("ü")) {
						return "Man";
					} else {
						return "Woman";
					}
				}
			}
		}
	}

	/**
	 * Reads numbers from the console
	 * @return correct age
	 */
	public int readAge() {
		while (true) {
			if (sc.hasNextInt()) {
				int age = sc.nextInt();
				if (age < 21) {
					System.out.println(
							"Deputy of Ukraine may be a citizen,\nwhich on election day was 21 years old.\nTry again.");
					sc = new Scanner(System.in);
				} else {
					return age;
				}
			}
		}
	}
	
	/**
	 * Reads numbers from the console
	 * @return boolean form whether a person is bribe-taker
	 */
	public boolean readBride() {
		while (true) {
			if (sc.hasNextInt()) {
				int bride = sc.nextInt();
				if (bride < 0) {
					System.out.println("The value can not be less than zero, try again.");
					sc = new Scanner(System.in);
				} else if (bride > 50_000) {
					System.out.println("This deputy should be imprisoned.");
					return true;
				} else if (bride == 0) {
					return false;
				} else {
					return true;
				}
			}
		}
	}
}

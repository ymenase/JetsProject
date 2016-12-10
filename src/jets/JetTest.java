package jets;

import java.util.Scanner;

public class JetTest {
	static Hangar h = new Hangar();
	private static Jet[] jets;

	public static void main(String[] args) {
		// make array of jets
		Jet Wolverine = new Jet("Wolverine", 500F, 1550F, 10, 70F, null);
		Jet Batman = new Jet("Batman", 900F, 2000F, 20, 60F, null);
		Jet Bears = new Jet("Bears", 1000.0F, 1800F, 15, 80F, null);
		Jet Superman = new Jet("Superman", 550.0F, 1700F, 21, 90F, null);
		Jet Spiderman = new Jet("Spiderman", 600.0F, 1500F, 30, 100F, null);
		Jet[] jets = new Jet[5];
		jets[0] = Wolverine;
		jets[1] = Batman;
		jets[2] = Bears;
		jets[3] = Superman;
		jets[4] = Spiderman;
		// make an array of pilots
		Pilot[] pilots = new Pilot[5];
		Pilot Bob = new Pilot("Bob", 500, 4);
		Pilot Hank = new Pilot("Hank", 300, 2);
		Pilot Jessica = new Pilot("Jessica", 1000, 10);
		Pilot Liz = new Pilot("Liz", 300, 5);
		Pilot Hannah = new Pilot("Hannah", 600, 2);
		pilots[0] = Bob;
		pilots[1] = Hank;
		pilots[2] = Jessica;
		pilots[3] = Liz;
		pilots[4] = Hannah;
		randomizePilot(pilots, jets);
		int selection = 0;

		Scanner keyboard = new Scanner(System.in);
		printMenu(keyboard, selection, jets);
		selectionAction(selection, jets, keyboard, pilots);
//		getFastestJet(jets);
//		getLongestRange(jets);
//		addAJet(jets, keyboard, pilots);
		quitProgram(keyboard);

	}

	public static void printMenu(Scanner keyboard, int selection, Jet[] jets) {
		System.out.println("\u2708 Please Choose an Option");
		System.out.println("_______\u2708______\u2708______\u2708______\u2708_____");
		System.out.println("|_______Yvette's Jet Rental_______|");
		System.out.println("|                                 |");
		System.out.println("|Options:                         |");
		System.out.println("|[1]....................List Fleet|");
		System.out.println("|[2]..............View Fastest Jet|");
		System.out.println("|[3]...View Jet with Longest Range|");
		System.out.println("|[4]...........Create a Custom Jet|");
		System.out.println("|[5]..................Hire a Pilot|");
		System.out.println("|[6]..................Exit Program|");
		System.out.println("|_______\u2708________\u2708_______\u2708_______|");
	}

	public static void selectionAction(int selection, Jet[] jets, Scanner keyboard, Pilot[] pilots) {
		
		do {
			selection = keyboard.nextInt();
			if (selection == 1) {
				printJets(jets);
			}

			if (selection == 2) {
				getFastestJet(jets);
			}

			if (selection == 3) {
				getLongestRange(jets);
			}

			if (selection == 4) {
				jets = addAJet(jets, keyboard, pilots);
			}

			if (selection == 5) {
				hirePilot(jets, keyboard, pilots);
			}
			if (selection == 6) {
				quitProgram(keyboard);
			}
			printMenu(keyboard, selection, jets);
		} while (selection != 6);

	}

	public static void printJets(Jet[] jets) {
		for (Jet jet : jets) {
			System.out.println(jet + "\n" + "\u2708");
		}
	}
	public static void printPilots(Pilot[] pilots) {
		for (Pilot pilot : pilots) {
			System.out.println(pilot);
		}
	}

	public static void getFastestJet(Jet[] jets) {
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (fastest.getSpeed() < jets[i].getSpeed()) {
				fastest = jets[i];
			}
		}
		System.out.printf("The fastest jet is " + fastest.getModel() + " with a speed of " + fastest.getSpeed()
				+ " mach, \n a range of %5.2f miles, a seating capacity of " + fastest.getCapacity()
				+ ", \n and a price of $%5.2f million. \n", fastest.getRange(), fastest.getPrice());
		System.out.println("\u2708");
	}

	public static void getLongestRange(Jet[] jets) {
		Jet longest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (longest.getRange() < jets[i].getRange()) {
				longest = jets[i];
			}

		}
		System.out.printf(
				"The jet with the longest range is " + longest.getModel() + " with a range of " + longest.getRange()
						+ " \n miles, a speed of  %5.2f mach, a seating capacity of " + longest.getCapacity()
						+ " people, \n at the price of $" + "%5.2f  million. \n",
				longest.getPrice(), longest.getSpeed());
		System.out.println("\u2708");
	}

	public JetTest() {
		// TODO Auto-generated constructor stub
	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public static void quitProgram(Scanner keyboard) {
		System.exit(0);
	}

	public static Jet[] addAJet(Jet[] jets, Scanner keyboard, Pilot[] pilots) {
		System.out.println("\u2708 Enter the model of the jet: ");
		String model = keyboard.next();

		System.out.println("\u2708 Enter the speed of the jet (in mph): ");
		float speed = keyboard.nextFloat();

		System.out.println("\u2708 Enter the range the jet can fly (in miles): ");
		float range = keyboard.nextFloat();

		System.out.println("\u2708 Enter the fuel capacity of the jet: ");
		int capacity = keyboard.nextInt();

		System.out.println("\u2708 Enter your desired price of the jet, in millions: ");
		float price = keyboard.nextFloat();


		System.out.println("\u2708 Here are the details of the new jet");
		Jet newJet = new Jet(model, speed, range, capacity, price, getRandomPilot(pilots));
		Jet[] addjets = new Jet[jets.length + 1];
		for (int i = 0; i < jets.length; i++) {
			addjets[i] = jets[i];
		}
		addjets[jets.length] = newJet;
		jets = addjets;
		h.addJetToHangar(newJet);
		System.out.println(newJet);
		
		return jets; // return updated jets array
	}

	public static void randomizePilot(Pilot[] pilots, Jet[] jets) {
		for (Jet j : jets) {
			// get index for pilot
			Pilot newPilot = getRandomPilot(pilots);
			j.setPilot(newPilot);
		}
	}

	public static Pilot getRandomPilot(Pilot[] pilots) {
		// generate an index that fits between the pilots array
		int index = ((int) (Math.random() * 10)) % pilots.length;
		Pilot newPilot = pilots[index]; // pull the index of pilot to get new
										// pilot
		return newPilot;
	}

	public static void hirePilot(Jet[] jets, Scanner keyboard, Pilot[] pilots) {
		Jet jet = null;
		// ask user which jet they want to hire a pilot for
		do {
			System.out.println("Which jet would you like to hire a pilot for?");
			printJets(jets);
			int pref = keyboard.nextInt();
			for (int i = 0; i < jets.length; i++) {
				if ((pref - 1) == i) {
					jet = jets[i];
					break;
				}
			}
			if (jet == null)
				System.out.println("You have entered an invalid selection, please re-enter a number: ");
		} while (jet == null);

		// selecting a pilot
		Pilot pilot = null;
		do {
			System.out.println("Which pilot would you like to hire?");
			printPilots(pilots);
			int pilotPref = keyboard.nextInt();
			for (int i = 0; i < pilots.length; i++) { // iterate through array
														// to
				if ((pilotPref - 1) == i) {
					pilot = pilots[i];
					break;
				}
			}
			if (pilot == null)
				System.out.println("You have entered an invalid selection, please re-enter a pilot number: ");
		} while (pilot == null);

		jet.setPilot(pilot);
		printJets(jets);
	}

}

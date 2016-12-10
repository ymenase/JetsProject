package jets;

import java.util.Scanner;


public class JetTest {
	static Hangar h = new Hangar();
	private static Jet[] jets;
	public static void main(String[] args) {
		Jet Wolverine = new Jet("Wolverine", 500F, 1550F, 10, 70F);
		Jet Batman = new Jet("Batman", 900F, 2000F, 20, 60F);
		Jet Bears = new Jet("Bears", 1000.0F, 1800F, 15, 80F);
		Jet Superman = new Jet("Superman", 550.0F, 1700F, 21, 90F);
		Jet Spiderman = new Jet("Spiderman", 600.0F, 1500F, 30, 100F);
		Jet[] jets = new Jet[5];
		jets[0] = Wolverine;
		jets[1] = Batman;
		jets[2] = Bears;
		jets[3] = Superman;
		jets[4] = Spiderman;
	
		// make array of jets
		int selection = 0;
		
		Scanner keyboard = new Scanner(System.in);
	      printMenu(keyboard, selection, jets);
          selectionAction(selection, jets, keyboard);
          getFastestJet(jets);
          getLongestRange(jets);
          addAJet(jets, keyboard);
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
        System.out.println("|[5]..................Exit Program|");
        System.out.println("|_______\u2708________\u2708_______\u2708_______|");
        selection = keyboard.nextInt();
        selectionAction(selection, jets, keyboard);
	}

	public static void selectionAction(int selection, Jet[] jets, Scanner keyboard){
		 do {
             if (selection == 1) {
                 printJet(jets);
                 break;
             }

             if (selection == 2) {
                 getFastestJet(jets);
             }

             if (selection == 3) {
                 getLongestRange(jets);
             }

             if (selection == 4) {
                 addAJet(jets, keyboard);
             }
             
             if (selection == 5) {
          	   quitProgram(keyboard);
             }
             printMenu(keyboard, selection, jets);
         } while (selection != 5);
		
	}
	public static void printJet(Jet[] jets) {
		for (Jet jet : jets) {
			System.out.println(jet + "\n" + "\u2708");
		}
	}
	

	public static void getFastestJet(Jet[] jets){
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
	
	public static void getLongestRange(Jet[] jets){
		 Jet longest = jets[0];
         for (int i = 0; i < jets.length; i++) {
             if (longest.getRange() < jets[i].getRange()) {
                 longest = jets[i];
             }

         }
         System.out.printf("The jet with the longest range is " + longest.getModel() + " with a range of " 
         + longest.getRange() + " \n miles, a speed of  %5.2f mach, a seating capacity of " + longest.getCapacity() + " people, \n at the price of $" +
         "%5.2f  million. \n", longest.getPrice(), longest.getSpeed());
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
	
	public static void quitProgram(Scanner keyboard){
		System.exit(0);
	}
	

	public static void addAJet(Jet[] jets, Scanner keyboard) {
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

		System.out.println("\u2708 Here is the updated jet listing");
		Jet newJet = new Jet(model, speed, range, capacity, price);
		Jet[] addjets = new Jet[jets.length + 1];
		for (int i = 0; i < jets.length; i++) {
			addjets[i] = jets[i];
		}
		h.addJetToHangar(newJet);
		System.out.println(newJet);
	}

}

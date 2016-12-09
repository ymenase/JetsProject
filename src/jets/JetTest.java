package jets;

import java.util.Scanner;

import jets2.Jet;

public class JetTest {
	static Hangar h = new Hangar();
	private static Jet[] jets;
	public static void main(String[] args) {
		Jet Wolverine = new Jet("Wolverine", 500F, 1550F, 10, 70F);
		Jet Batman = new Jet("Batman", 900F, 2000F, 20, 60F);
		Jet Bears = new Jet("Bears", 1000.0F, 1800F, 15, 80F);
		Jet Superman = new Jet("Superman", 550.0F, 1700F, 21, 90F);
		Jet Spiderman = new Jet("Spiderman", 600.0F, 1500F, 30, 100F);
		h.addJet(Wolverine);
		h.addJet(Wolverine);
		h.addJet(Wolverine);
		h.addJet(Wolverine);
//		Jet[] jets = new Jet[5];
//		jets[0] = Wolverine;
//		jets[1] = Batman;
//		jets[2] = Bears;
//		jets[3] = Superman;
//		jets[4] = Spiderman;
		
		h.setJets(jets);
		// make array of jets
		int selection = 0;
		
		Scanner keyboard = new Scanner(System.in);
	
		// create menu

	}

	public  void printMenu(Scanner keyboard, int selection, Jet[] jets) {
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

	public void selectionAction(int selection, Jet[] jets, Scanner keyboard){
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
                 h.addJet(jets, keyboard);
             }
             
             if (selection == 5) {
          	   quitProgram(keyboard);
             }
             printMenu(keyboard, selection, jets);
         } while (selection != 5);
		
	}
	public  void printJet(Jet[] jets1) {
		for (Jet jet : jets1) {
			System.out.println(jet + "\n" + "\u2708");
		}
	}
	

	public  void getFastestJet(){
		//formula for calculating the fastest jet
	}
	
	public void getLongestRange(){
		
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
	
	public void quitProgram(Scanner keyboard){
		System.exit(0);
	}

}

package jets;


public class Hangar {

	Jet[] jets = new Jet[5];

	public Hangar() {

	}

	public void addJetToHangar(Jet newJet) { //populate jet array
		if (jets.length == 0) {
			jets = new Jet[1];
			jets[0] = newJet;
		} else {
			Jet[] newJetList = new Jet[jets.length + 1];
			for (int i = 0; i < jets.length; i++) {
				newJetList[i] = jets[i];
			}
			newJetList[jets.length] = newJet;

			jets = newJetList;
		}
	}



}

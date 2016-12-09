package jets;

public class Hangar {

		Jet[] jets = new Jet[5];
	public Hangar() {

	}
	
	public void addJet(Jet newJet){
		if(jets.length==0){
			jets = new Jet[1];
			jets[0] = newJet;
		}
		else{		
			Jet[] newJetList = new Jet[jets.length+1];
			for(int i = 0; i<jets.length; i++){
				newJetList[i] = jets[i];
			}
			newJetList[jets.length] = newJet;
			
			jets = newJetList;
		}
	}

	public void setJets(Jet[] jets2) {
		// TODO Auto-generated method stub
		
	}
	
	

}

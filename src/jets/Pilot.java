package jets;

public class Pilot {
	private String name;
	private double rate;
	private int yearsExp;

	public Pilot(String n, double r, int yearsExp) {
		this.name = n;
		this.rate = r;
		this.yearsExp = yearsExp;
	}

	@Override
	public String toString() {
		return "Pilot [name=" + name + ", rate=" + rate + ", yearsExp=" + yearsExp + "]";
	}


}

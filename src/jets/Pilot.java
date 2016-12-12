package jets;

public class Pilot {
	private int id;
	private String name;
	private double rate;
	private int yearsExp;

	public Pilot(int id, String n, double r, int yearsExp) {
		this.id = id;
		this.name = n;
		this.rate = r;
		this.yearsExp = yearsExp;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Pilot [id=" + id + ", name=" + name + ", rate=" + rate + ", yearsExp=" + yearsExp + "]";
	}


}

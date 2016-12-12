package jets;

public class Jet {
	private int id;
	private String model;
	private float speed;
	private float range;
	private int capacity;
	private float price;
	private Pilot pilot;

	public Jet(int id, String mod, float sp, float rg, int cap, float pr, Pilot pil) {
		setId(id);
		setModel(mod);
		setSpeed(sp);
		setRange(rg);
		setCapacity(cap);
		setPrice(pr);
		setPilot(pil);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	//to String
	@Override
	public String toString() {
		//print jet with pilot
		String info = String.format("Jet [ID = " + id + "[model=" + model + ", speed= %.2f range= %.2f, "
				+ "capacity=" + capacity + " price=%.2f] pilot=" + pilot.toString(), speed, range, price);
		
		return info;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

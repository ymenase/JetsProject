package jets;

public class Jet {
	private String model;
	private float speed;
	private float range;
	private int capacity;
	private float price;

	public Jet(String mod, float sp, float rg, int cap, float pr) {
		setModel(mod);
		setSpeed(sp);
		setRange(rg);
		setCapacity(cap);
		setPrice(pr);
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
		String info = String.format("Jet [model=" + model + ", speed= %.2f range= %.2f, "
				+ "capacity=" + capacity + " price=%.2f]", speed, range, price);
		return info;
	}

}

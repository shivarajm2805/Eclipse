package Learning_Spring.SpringPrg_AutoWiring;

public class Car {
	Engine e;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine e) {
		super();
		this.e = e;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Car [e=" + e + "]";
	}
	
	
}

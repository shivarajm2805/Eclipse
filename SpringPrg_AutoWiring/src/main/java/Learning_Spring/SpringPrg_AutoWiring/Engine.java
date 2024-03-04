package Learning_Spring.SpringPrg_AutoWiring;

public class Engine {
	int egnNo;
	String type;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int egnNo, String type) {
		super();
		this.egnNo = egnNo;
		this.type = type;
	}
	public int getEgnNo() {
		return egnNo;
	}
	public void setEgnNo(int egnNo) {
		this.egnNo = egnNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [egnNo=" + egnNo + ", type=" + type + "]";
	}
	
	
}

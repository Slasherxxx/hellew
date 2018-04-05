package dp.factory.product;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Veggies veggies[];
	Clam clam;
	
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Cuire durant 25mn à 350°");
		
	}

	public void cut() {
		System.out.println("Couper en morceaux à la diagonale");
		
	}

	public void box() {
		System.out.println("Placer la pizza dans un boitier officiel");
		
	}
	
	public void setName(String s) {
		name=s;	
	}
	
	public String getName() {
		return name;
	}

}

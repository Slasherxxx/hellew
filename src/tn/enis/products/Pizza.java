package tn.enis.products;

public abstract class Pizza {
	
	public void prepare() {
		System.out.println("Prepare pizza ");
	}
	
	public void bake() {
		System.out.println("Cuire pour 25mn à 350 ");
	}
	
	public void cut() {
		System.out.println("couper la pizza en morceaux");
	}
	
	public void box() {
		System.out.println("Placer la pizza dans une boite de PIZZASTORE");
	}

}

package tn.enis.main;

import tn.enis.creatorclient.PizzaStore;
import tn.enis.creatorclient.SfaxPizzaStore;
import tn.enis.creatorclient.TunisPizzaStore;

public class Test {

	public static void main(String[] args) {
		SfaxPizzaStore sfaxPizzaStore = new SfaxPizzaStore();
		TunisPizzaStore tunisPizzaStore = new TunisPizzaStore();
		sfaxPizzaStore.orderPizza("pepperoni");
		tunisPizzaStore.orderPizza("cheese");
		
	}

}

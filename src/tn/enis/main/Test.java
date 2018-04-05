package tn.enis.main;

import dp.factory.clientFactory.PizzaStore;
import dp.factory.clientFactory.SfaxPizzaStore;
import dp.factory.clientFactory.TunisPizzaStore;

public class Test {

	public static void main(String[] args) {
		SfaxPizzaStore sfaxPizzaStore = new SfaxPizzaStore();
		TunisPizzaStore tunisPizzaStore = new TunisPizzaStore();
		sfaxPizzaStore.orderPizza("pepperoni");
		System.out.println("________________________________________________________");
		tunisPizzaStore.orderPizza("cheese");
		
	}

}

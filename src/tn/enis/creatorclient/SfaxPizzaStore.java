package tn.enis.creatorclient;

import tn.enis.products.SfaxStyleCheesePizza;
import tn.enis.products.SfaxStyleClamPizza;
import tn.enis.products.SfaxStylePepperoniPizza;
import tn.enis.products.Pizza;

public class SfaxPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new SfaxStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new SfaxStylePepperoniPizza();
		} else if (type.equals("clamars")) {
			pizza = new SfaxStyleClamPizza();
		}

		return pizza;
	}

}

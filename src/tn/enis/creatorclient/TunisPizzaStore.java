package tn.enis.creatorclient;

import tn.enis.products.Pizza;
import tn.enis.products.TunisStyleCheesePizza;
import tn.enis.products.TunisStyleClamPizza;
import tn.enis.products.TunisStylePepperoniPizza;

public class TunisPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new TunisStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new TunisStylePepperoniPizza();
		} else if (type.equals("clamars")) {
			pizza = new TunisStyleClamPizza();
		}

		return pizza;
	}

}

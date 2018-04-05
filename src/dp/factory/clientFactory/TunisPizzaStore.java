package dp.factory.clientFactory;

import dp.factory.factory.TunisIngrediantFactory;
import dp.factory.product.CheesePizza;
import dp.factory.product.ClamPizza;
import dp.factory.product.PepperoniPizza;
import dp.factory.product.Pizza;

public class TunisPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		TunisIngrediantFactory tunisIngrediantFactory = new TunisIngrediantFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(tunisIngrediantFactory);
			pizza.setName("Tunis Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(tunisIngrediantFactory);
			pizza.setName("Tunis Style Pepperoni Pizza");
		} else if (type.equals("clamars")) {
			pizza = new ClamPizza(tunisIngrediantFactory);
			pizza.setName("Tunis Style Clam Pizza");
		}

		return pizza;
	}

}

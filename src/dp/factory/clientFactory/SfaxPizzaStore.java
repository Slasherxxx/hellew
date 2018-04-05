package dp.factory.clientFactory;


import dp.factory.factory.SfaxIngrediantFactory;
import dp.factory.product.CheesePizza;
import dp.factory.product.ClamPizza;
import dp.factory.product.PepperoniPizza;
import dp.factory.product.Pizza;

public class SfaxPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type){
		Pizza pizza = null;
		SfaxIngrediantFactory sfaxIngrediantFactory = new SfaxIngrediantFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(sfaxIngrediantFactory);
			pizza.setName("Sfax Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(sfaxIngrediantFactory);
			pizza.setName("Sfax Style Pepperoni Pizza");
		} else if (type.equals("clamars")) {
			pizza = new ClamPizza(sfaxIngrediantFactory);
			pizza.setName("Sfax Style Clam Pizza");
		}

		return pizza;
	}

}

package dp.factory.factory;

import dp.factory.product.Cheese;
import dp.factory.product.Clam;
import dp.factory.product.Dough;
import dp.factory.product.Sauce;
import dp.factory.product.Veggies;

public interface PizzaIngredientFactory {

	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Clam createClam();

}

package dp.factory.factory;

import dp.factory.product.Cheese;
import dp.factory.product.Clam;
import dp.factory.product.Dough;
import dp.factory.product.Mozarella;
import dp.factory.product.Olive;
import dp.factory.product.Palourde;
import dp.factory.product.Pepper;
import dp.factory.product.PlumTomatoSauce;
import dp.factory.product.Sauce;
import dp.factory.product.Spinach;
import dp.factory.product.ThickenDough;
import dp.factory.product.Veggies;

public class TunisIngrediantFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickenDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Spinach(),new Pepper(), new Olive()};
		return veggies;
	}

	@Override
	public Clam createClam() {
		return new Palourde();
	}

}

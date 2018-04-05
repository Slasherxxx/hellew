package dp.factory.factory;

import dp.factory.product.Cheese;
import dp.factory.product.Clam;
import dp.factory.product.Clovis;
import dp.factory.product.Dough;
import dp.factory.product.Eggplant;
import dp.factory.product.Garlic;
import dp.factory.product.MarinaraSauce;
import dp.factory.product.Onion;
import dp.factory.product.Parmesan;
import dp.factory.product.Sauce;
import dp.factory.product.ThinDough;
import dp.factory.product.Veggies;

public class SfaxIngrediantFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return new Parmesan();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]= {new Garlic(),new Onion(), new Eggplant()};
		return veggies;
	}

	@Override
	public Clam createClam() {
		
		return new Clovis();
	}

}

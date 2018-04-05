package dp.factory.product;

import dp.factory.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientfactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory=ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Préparons "+name );
		dough=ingredientfactory.createDough();
		sauce=ingredientfactory.createSauce();
		cheese=ingredientfactory.createCheese();
		clam=ingredientfactory.createClam();
		System.out.println("Legumes :");
		veggies=ingredientfactory.createVeggies();
		
	}

}

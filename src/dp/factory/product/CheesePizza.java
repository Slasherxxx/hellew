package dp.factory.product;

import dp.factory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientfactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory=ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Pr�parons "+name );
		dough=ingredientfactory.createDough();
		sauce=ingredientfactory.createSauce();
		cheese=ingredientfactory.createCheese();
		System.out.println("Legumes :");
		veggies=ingredientfactory.createVeggies();
	}

}

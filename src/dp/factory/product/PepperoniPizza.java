package dp.factory.product;

import dp.factory.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientfactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory=ingredientfactory;
	}
	@Override
	public void prepare() {
		System.out.println("Préparons"+name );
		dough=ingredientfactory.createDough();
		sauce=ingredientfactory.createSauce();
		cheese=ingredientfactory.createCheese();
		System.out.println("Legumes :");
		veggies=ingredientfactory.createVeggies();
	}

}

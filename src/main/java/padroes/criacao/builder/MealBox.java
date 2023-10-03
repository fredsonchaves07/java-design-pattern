package padroes.criacao.builder;

import java.util.ArrayList;
import java.util.List;

public class MealBox implements MealCompositeProtocol {

    private List<AbstractMeal> meals = new ArrayList<>();

    @Override
    public int getPrice() {
        int sum = 0;
        for (AbstractMeal mealCompositeProtocol : this.meals) {
            sum += mealCompositeProtocol.getPrice();
        }
        return sum;
    }

    public void add (AbstractMeal meal) {
        this.meals.add(meal);
    }
}

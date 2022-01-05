package CreationalPatterns.BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());
        System.out.println("-----------------");
        Meal meatMeal = mealBuilder.prepareMeatMeal();
        meatMeal.showItems();
        System.out.println("Total Cost: "+meatMeal.getCost());
    }
}

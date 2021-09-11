public class TomatoSource extends ToppingDecorator {
    public Mozzarella(Pizza newPizza){
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost() {
        return tempPizza.getCost() + .35;
    }

}

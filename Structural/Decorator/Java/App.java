public class App {
    public static void main( String[] args )
    {
        Pizza basicPizza = new TomatoSource(new Mozzarella(new PlainPizza));

        System.out.println("Ingredients: "+ basicPizza.getDescription() );
    }
}
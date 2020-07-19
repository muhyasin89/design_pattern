package com.muhyasin89.design_pattern;

/**
 * In the Tutorial the name of class is Pizza Maker
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pizza basicPizza = new TomatoSource(new Mozzarella(new PlainPizza));

        System.out.println("Ingredients: "+ basicPizza.getDescription() );
    }
}

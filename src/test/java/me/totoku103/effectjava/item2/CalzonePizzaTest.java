package me.totoku103.effectjava.item2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CalzonePizzaTest {

    @Test
    public void test() {
        final CalzonePizza pizza = new CalzonePizza.Builder(true).addTopping(Pizza.Topping.MUSHROOM).addTopping(Pizza.Topping.HAM).build();
        Assertions.assertTrue(pizza.isSauceInside());
        Assertions.assertTrue(pizza.getToppings().containsAll(List.of(Pizza.Topping.MUSHROOM, Pizza.Topping.HAM)));
    }

    @Test
    public void testEquals() {
        final CalzonePizza pizzaA = new CalzonePizza.Builder(true).addTopping(Pizza.Topping.MUSHROOM).addTopping(Pizza.Topping.HAM).build();
        final CalzonePizza pizzaB = new CalzonePizza.Builder(true).addTopping(Pizza.Topping.MUSHROOM).addTopping(Pizza.Topping.HAM).build();
        Assertions.assertTrue(pizzaA.isSauceInside());
        Assertions.assertTrue(pizzaA.getToppings().containsAll(List.of(Pizza.Topping.MUSHROOM, Pizza.Topping.HAM)));

        Assertions.assertTrue(pizzaB.isSauceInside());
        Assertions.assertTrue(pizzaB.getToppings().containsAll(List.of(Pizza.Topping.MUSHROOM, Pizza.Topping.HAM)));
        Assertions.assertNotEquals(pizzaA, pizzaB);
    }
}
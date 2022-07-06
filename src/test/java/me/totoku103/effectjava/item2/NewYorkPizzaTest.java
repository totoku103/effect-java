package me.totoku103.effectjava.item2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NewYorkPizzaTest {

    @Test
    public void test() {
        final NewYorkPizza pizza = new NewYorkPizza.Builder(NewYorkPizza.Size.MEDIUM).addTopping(Pizza.Topping.HAM).build();
        Assertions.assertEquals(NewYorkPizza.Size.MEDIUM, pizza.getSize());
        Assertions.assertTrue(pizza.getToppings().contains(Pizza.Topping.HAM));
    }

    @Test
    public void testEquals() {
        final NewYorkPizza pizzaA = new NewYorkPizza.Builder(NewYorkPizza.Size.MEDIUM).addTopping(Pizza.Topping.HAM).build();
        final NewYorkPizza pizzaB = new NewYorkPizza.Builder(NewYorkPizza.Size.MEDIUM).addTopping(Pizza.Topping.HAM).build();
        Assertions.assertEquals(NewYorkPizza.Size.MEDIUM, pizzaA.getSize());
        Assertions.assertTrue(pizzaA.getToppings().contains(Pizza.Topping.HAM));

        Assertions.assertEquals(NewYorkPizza.Size.MEDIUM, pizzaB.getSize());
        Assertions.assertTrue(pizzaB.getToppings().contains(Pizza.Topping.HAM));
        Assertions.assertNotEquals(pizzaA, pizzaB);
    }

}
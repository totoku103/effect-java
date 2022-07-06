package me.totoku103.effectjava.item2;

import java.util.EnumSet;
import java.util.Set;

public class Pizza<T> {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    public Set<Topping> getToppings() {
        return toppings;
    }

    public Pizza(Builder<T> builder) {
        this.toppings = builder.toppings.clone();
    }

    public abstract static class Builder<T> {
        final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        public abstract Pizza build();

        protected abstract T self();
    }
}

package me.totoku103.effectjava.item2;

public class CalzonePizza extends Pizza {
    private final boolean sauceInside;

    public CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final boolean sauceInside;

        public Builder(boolean sauceInside) {
            this.sauceInside = sauceInside;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

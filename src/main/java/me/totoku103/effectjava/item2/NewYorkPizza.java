package me.totoku103.effectjava.item2;

public class NewYorkPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public Size getSize() {
        return size;
    }

    private NewYorkPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

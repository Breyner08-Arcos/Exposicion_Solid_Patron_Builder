public class Pizza {
    private String tamaño;
    private String masa;
    private boolean extraQueso;
    private boolean pepperoni;
    private boolean champinones;
    
    private Pizza(PizzaBuilder builder) {
        this.tamaño = builder.tamaño;
        this.masa = builder.masa;
        this.extraQueso = builder.extraQueso;
        this.pepperoni = builder.pepperoni;
        this.champinones = builder.champinones;
    }
    
    @Override
    public String toString() {
        return "Pizza [tamaño=" + tamaño +
               ", masa=" + masa +
               ", quesoExtra=" + extraQueso +
               ", pepperoni=" + pepperoni +
               ", champinones=" + champinones + "]";
    }

    public static class PizzaBuilder {
        private String tamaño;
        private String masa;
        private boolean extraQueso;
        private boolean pepperoni;
        private boolean champinones;

        public PizzaBuilder(String tamaño) {
            this.tamaño = tamaño;
        }

        public PizzaBuilder masa(String masa) {
            this.masa = masa;
            return this;
        }
        public PizzaBuilder extraQueso(boolean extraQueso) {
            this.extraQueso = extraQueso;
            return this;
        }
        public PizzaBuilder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }
        public PizzaBuilder champinones(boolean champinones) {
            this.champinones = champinones;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

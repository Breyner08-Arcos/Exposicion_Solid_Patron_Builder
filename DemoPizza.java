public class DemoPizza {
    public static void main(String[] args) {
        Pizza miPizza = new Pizza.PizzaBuilder("Grande")
            .masa("Delgada")
            .extraQueso(true)
            .pepperoni(true)
            .build();

        System.out.println(miPizza);
    }
}


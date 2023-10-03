package padroes.criacao.builder;

public abstract class AbstractMeal {

    private String name;

    private int price;

    public AbstractMeal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return 0;
    }
}

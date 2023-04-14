package restaurante;

public class Burger {
    private String type;
    private double price;
    private String[] extra;

    public Burger(String type, double price){
        this.type = type;
        this.price = price;
    }

    public void addExtras(String[] extras){
        for(String f:extras){
            switch (f) {
                case "Picles" -> this.price += 0.80;
                case "Burger" -> this.price += 2.00;
                case "Onion" -> this.price += 0.50;
                default -> this.price += 1.00;
            }

        }
    }


}
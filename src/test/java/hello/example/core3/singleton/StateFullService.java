package hello.example.core3.singleton;

import org.junit.jupiter.api.Test;

public class StateFullService {
    private int price;
    public void order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

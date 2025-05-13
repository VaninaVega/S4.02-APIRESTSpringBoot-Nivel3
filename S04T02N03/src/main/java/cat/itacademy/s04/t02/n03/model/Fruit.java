package cat.itacademy.s04.t02.n03.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("fruits")
public class Fruit {

    @Id
    private String id;
    private String name;
    private int Quantity;

    public Fruit() {
    }

    public Fruit(String name, int Quantity) {
        this.name = name;
        this.Quantity = Quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}


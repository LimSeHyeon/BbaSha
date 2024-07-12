package BbaSha.model.entity.bucket;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class Bucket{
    private String restaurantName;
    private final Map<String, Integer> orderedMenu;
    private int totalPrice;

    public Bucket() {
        this.orderedMenu = new HashMap<>();
    }

    public void addOrderMenu(String menu, int quantity) {
        this.orderedMenu.put(menu, quantity);
    }

    public void deleteOrderMenu(String menu) {
        this.orderedMenu.remove(menu);
    }

    public void deleteAllOrderedMenu(){
        this.orderdMenu.clear();
    }

}

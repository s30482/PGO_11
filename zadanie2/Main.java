package zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item i1 = new Item(1, "MAT");
        Item i2 = new Item(2,"RPG");
        Item i3 = new Item(3, "PGO");
        Item i4 = new Item(4, "TEM");
        Item i5 = new Item(5,"ANG");
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getNazwa());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }
    }
}

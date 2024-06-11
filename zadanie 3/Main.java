import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item i1 = new Item(1, "MAT");
        Item i2 = new Item(2, "RPG");
        Item i3 = new Item(3, "PGO");
        Item i4 = new Item(4, "TEM");
        Item i5 = new Item(5, "ANG");
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);

        Item i6 = new Item(6, "six");
        Item i7 = new Item(7, "sev");
        Item i8 = new Item(8, "eight");
        Item i9 = new Item(9, "nine");
        Item i10 = new Item(10, "ten");
        Item i11 = new Item(11, "elev");
        Item i12 = new Item(12, "twelve");
        Item i13 = new Item(13, "thirteen");
        Item i14 = new Item(14, "fourt");
        Item i15 = new Item(15, "fift");
        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);
        items.add(i11);
        items.add(i12);
        items.add(i13);
        items.add(i14);
        items.add(i15);

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

        List<Item> firstFiveItems = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        System.out.println("HashSet of first five items:");
        for (Item item : itemSet) {
            item.show();
        }
    }
}
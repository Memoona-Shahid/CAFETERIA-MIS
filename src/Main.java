import java.util.ArrayList;

public class Main {
    public static <T extends  MenuItems> void main(String[] args) {
        ArrayList<T> items= new ArrayList<T>();
        //coffees
        items.add((T) new Coffee(ItemType.COFFEE, "IcedLatte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "IcedLatte", "Large", 1000));
        items.add((T) new Coffee(ItemType.COFFEE, "Hazelnut", "Large", 1000));

        items.add((T) new Coffee(ItemType.COFFEE, "Hazelnut", "Large", 1000));
        items.add((T) new Coffee(ItemType.COFFEE, "Hazelnut", "Large", 1000));

        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));




        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));
        items.add((T) new Coffee(ItemType.COFFEE, "Iced Latte", "Large", 900));





    }
}
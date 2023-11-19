public class Coffee extends MenuItems{
    private String size;
    private String name;
    private float price;

    public Coffee(ItemType itemType,  String name, String size,  float price) {
        super(itemType);
        this.name = name;
        this.size = size;
        this.price= price;
    }
}

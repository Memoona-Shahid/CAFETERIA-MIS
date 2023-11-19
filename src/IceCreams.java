public class IceCreams extends MenuItems{
    private String name;
    private float price;
    private String size;

    public IceCreams(ItemType itemType, String name, float price, String size) {
        super(itemType);
        this.name = name;
        this.price = price;
        this.size = size;
    }
}

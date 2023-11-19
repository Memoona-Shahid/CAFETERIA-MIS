public class CupCakes extends MenuItems{
    private String size;
    private String name;
    private float price;

    public CupCakes(ItemType itemType,String name, String size, float price) {
        super(itemType);
        this.name = name;
        this.size = size;

        this.price = price;
    }
}

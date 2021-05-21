
public class OlivesDecorator extends Item {

    private Item myItem;

    public OlivesDecorator(Item myItem) {
        this.myItem = myItem;
    }

    @Override
    public double getCost() {
        return myItem.getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return myItem.getDescription() + " + Olives";
    }

}

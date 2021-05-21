
public class CreamDecorator extends Item{

    private Item myItem;

    public CreamDecorator(Item myItem) {
        this.myItem = myItem;
    }

    @Override
    public double getCost() {
        return myItem.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return myItem.getDescription() + " + Cream";
    }
}


public class Test {
    public static void main(String[] args) {
        /**
         * Decorator - A chain of creation, Support more complex ability but not as in inheritance
         */

        System.out.println("---------------------- Ordering Coffee -------------------");
        Coffee c1 = new Coffee();
        System.out.println("Cost : " + c1.getCost());
        System.out.println("Description : " + c1.getDescription());

        System.out.println("----------------------- Ordering Toast --------------------");
        Toast t1 = new Toast();
        System.out.println("Cost : " + t1.getCost());
        System.out.println("Description : " + t1.getDescription());

        System.out.println("---------------- Ordering Olives on the Toast -------------");
        OlivesDecorator o1 = new OlivesDecorator(t1);
        System.out.println("Cost : " + o1.getCost());
        System.out.println("Description : " + o1.getDescription());

        System.out.println("------------- Ordering dabble Olives on the Toast ---------");
        OlivesDecorator o2 = new OlivesDecorator(o1);
        System.out.println("Cost : " + o2.getCost());
        System.out.println("Description : " + o2.getDescription());

        System.out.println("---------------- Ordering Cream on the Coffee -------------");
        CreamDecorator cr1 = new CreamDecorator(c1);
        System.out.println("Cost : " + cr1.getCost());
        System.out.println("Description : " + cr1.getDescription());
    }
}

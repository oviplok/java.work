package prac16;

public class Main {
    public static void main(String[] ar) {
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        InternetOrder internetOrder = new InternetOrder();
        try {
            Drink cola = new Drink("Cola", "1", 100);
            Drink wine = new Drink("Red Wine", "0.7", 843);
            Drink coffee = new Drink("Americano", "0.3", 80);
            Dish roast = new Dish("Roast", "beef stew with potatoes and vegetables", 180);
            Dish dumplings = new Dish("dumplings", " is a broad class of dishes that consist of pieces of dough wrapped around a filling, or of dough with no filling", 150);
            Dish honey = new Dish("Honey cake", "cake with honey, sponge cake and delicious creamy caramel cream", 95);
            restaurantOrder.add(cola);
            restaurantOrder.add(coffee);
            internetOrder.add(roast);
            internetOrder.add(wine);
            internetOrder.add(honey);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(roast);
            orderManager.add(1, restaurantOrder);
            orderManager.add(2, restaurantOrder);
            orderManager.add("Moscow", internetOrder);
            System.out.println("The cost of ordering in a restaurant");
            System.out.println(restaurantOrder.priceTotal());
            System.out.println("Summary of the cost of ordering in a restaurant");
            System.out.println(orderManager.RestaurantOrdersCostSummary());
            System.out.println("How much dishes");
            System.out.println(restaurantOrder.dishQuantity());
            System.out.println("How mush dishes in delivery");
            System.out.println(internetOrder.getCount());
            System.out.println("The cost of the order in delivery");
            System.out.println(internetOrder.priceTotal());
            internetOrder.remove("Red Wine");
            System.out.println("How mush dishes in delivery");
            System.out.println(internetOrder.getCount());
            System.out.println("The cost of the order in delivery");
            System.out.println(internetOrder.priceTotal());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

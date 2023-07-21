package OOP_java_sem1;

import java.util.ArrayList;

import oop_java.Order;

public class Automat {
    
    ArrayList <Product> list_products = new ArrayList<>();

    public void initProduct(ArrayList <Product> my_List){
        list_products = my_List;
    }

    public Product getProduct(String name){
        for (Product el : list_products) {
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }
    public Order createOrder( ArrayList<Product> shoppingList ){
        return null;
    }


}

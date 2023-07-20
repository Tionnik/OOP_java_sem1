package OOP_java_sem1;

import java.util.Calendar;

public class Food extends Product{

    private double weight;

    public Food(String name, int price, int quantity, Calendar best_before, double weight){
        super(name, price, quantity, best_before);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        
        return "\n"+getName() + "  Цена: " + getPrice() + "  Кол-во: " + getQuantity() + "  Объем: " + weight 
                              + "  Годен до: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }
}

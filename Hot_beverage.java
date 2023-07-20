package OOP_java_sem1;

import java.util.Calendar;

public class Hot_beverage extends Beverage{

    private int temperature;

    public Hot_beverage(String name, int price, int quantity, Calendar best_before, double volume, int temperature ){
        super(name, price, quantity, best_before, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public String toString(){
        
        return "\n"+getName() + "  Цена: " + getPrice() + "  Кол-во: " + getQuantity() + "  Объем: " + getVolume() + "  Температура: " + temperature 
                              + "  Годен до: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }


}

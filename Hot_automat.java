package OOP_java_sem1;

public class Hot_automat extends Automat{

    public Product getProduct(String name,  double volume, int temperature){
        for (Product el : list_products) {
            if (el instanceof Hot_beverage ){
                if ((((Hot_beverage) el).getName().equals(name))&&
                    (((Hot_beverage) el).getVolume() == (volume))&&
                    (((Hot_beverage) el).getTemperature() == temperature)){
                      return el;  
                }
            }
            
        }
        return null;
    }
}

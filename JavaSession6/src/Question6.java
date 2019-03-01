
interface Pizza {
    String getPizzaDetails();
}

class OnionPizza implements Pizza {
    
    private String size;
    private double price;
    
    public OnionPizza(String size, double price){
        this.size=size;
        this.price=price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String getPizzaDetails() {
        return "\nOnion Pizza Details: "+
                "\nSize: "+size+
                "\nPrice: "+price;
                
    }
    
}

class MushroomPizza implements Pizza {

    private int mushroom_quantity;
    private OnionPizza onionPizza;
    
    public MushroomPizza(int mushroom_quantity, OnionPizza onionPizza) {
        this.mushroom_quantity=mushroom_quantity;
        this.onionPizza=onionPizza;
    }
    
    public OnionPizza getOnionPizza() {
        return onionPizza;
    }
    
    public void setOnionPizza(OnionPizza onionPizza) {
        this.onionPizza = onionPizza;
    }
    
    public int getMushroomQuantity() {
        return mushroom_quantity;
    }
    
    public void setMushroomQuantity(int mushroom_quantity) {
        this.mushroom_quantity = mushroom_quantity;
    }
    
    @Override
    public String getPizzaDetails() {
        return onionPizza.getPizzaDetails()+
                "\nWith Toppings Mushroom Included: "+
                "\nQuantity: "+mushroom_quantity+" g";
    
    }
    
}

public class Question6 {
    
    public static void main(String[] args) {
    
        OnionPizza onionPizza=new OnionPizza("Medium",129.25);
        //onionPizza.setPrice(100.00D);
        //onionPizza.setSize("Medium");
    
        System.out.println(onionPizza.getPizzaDetails());
        
        MushroomPizza mushroomPizza=new MushroomPizza(50,onionPizza);
        System.out.println(mushroomPizza.getPizzaDetails());
    
    }
    
}

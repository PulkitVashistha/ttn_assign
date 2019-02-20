class WoodenProducts {
    private String wprod_name;
    private String wprod_type;
    private double wprod_price;
    private boolean wprod_ftest;
    private boolean wprod_stest;
    
    public WoodenProducts(String pn, String pt,double pp){
        wprod_name=pn;
        wprod_type=pt;
        wprod_price=pp;
    }
    
    public void getDetails() {
        System.out.println("\n------Wooden Product Information--------");
        System.out.println("Product Name: "+wprod_name);
        System.out.println("Product Type: "+wprod_type);
        System.out.println("Product Price: "+wprod_price);
    }
    
    public void fireTest() {
        if(wprod_ftest==false){
            wprod_ftest=true;
            System.out.println("Fire test successful!");
        } else {
            System.out.println("Fire test already passed!");
        }
    }
    
    public void stressTest() {
        if(wprod_stest==false){
            wprod_stest=true;
            System.out.println("Stress test successful!");
        } else {
            System.out.println("Stress test already passed!");
        }
    }
    
}

class MetalProducts {
    private String mprod_name;
    private String mprod_type;
    private double mprod_price;
    private boolean mprod_ftest;
    private boolean mprod_stest;
    
    public MetalProducts(String pn, String pt,double pp){
        mprod_name=pn;
        mprod_type=pt;
        mprod_price=pp;
    }
    
    public void getDetails() {
        System.out.println("\n------Metal Product Information--------");
        System.out.println("Product Name: "+mprod_name);
        System.out.println("Product Type: "+mprod_type);
        System.out.println("Product Price: "+mprod_price);
    }
    
    public void fireTest() {
        if(mprod_ftest==false){
            mprod_ftest=true;
            System.out.println("Fire test successful!");
        } else {
            System.out.println("Fire test already passed!");
        }
    }
    
    public void stressTest() {
        if(mprod_stest==false){
            mprod_stest=true;
            System.out.println("Stress test successful!");
        } else {
            System.out.println("Stress test already passed!");
        }
    }
}

public class Question9 {
    
    public static void main(String[] args) {
        WoodenProducts WP1=new WoodenProducts("Wooden Table","Table",1542.2);
        WoodenProducts WP2=new WoodenProducts("Wooden Chair","Chair",452.2);
        WP1.getDetails();
        WP1.fireTest();
        WP1.stressTest();
    
        MetalProducts MP1=new MetalProducts("Metal Table","Table",3598.2);
        MetalProducts MP2=new MetalProducts("Metal Chair","Chair",1745.2);
        MP1.getDetails();
        MP1.fireTest();
        MP1.stressTest();
    }
}

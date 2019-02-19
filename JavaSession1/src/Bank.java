public class Bank {

    protected String bank_name;
    protected String bank_type;
    protected boolean bank_status;
    protected double rate_of_interest;

    public Bank() {
        bank_name="Reserve Bank of India";
        bank_type="Central Bank";
        bank_status=true;
        rate_of_interest=12.00;
    }
    
    void getDetails() {
        System.out.println("----------Bank Details---------");
        System.out.println("Bank Name: "+bank_name);
        System.out.println("Bank Type: "+bank_type);
        System.out.println("Bank Active: "+bank_status);
        System.out.println("Rate of Interest: "+rate_of_interest);
    }
    
}

class SBI extends Bank {
    
    public SBI(double roi,boolean bs) {
        super.bank_name="State Bank Of India";
        super.bank_type="Public Bank";
        super.bank_status=bs;
        super.rate_of_interest=roi;
    }
    
    public SBI() {
        super.bank_name="State Bank Of India";
        super.bank_type="Public Bank";
    }
    
    @Override
    void getDetails() {
        System.out.println("----------State Bank of India Details---------");
        System.out.println("Bank Name: "+super.bank_name);
        System.out.println("Bank Type: "+super.bank_type);
        System.out.println("Bank Active: "+super.bank_status);
        System.out.println("Rate of Interest: "+super.rate_of_interest);
    }
}

class ICICI extends Bank {
    
    public ICICI(double roi,boolean bs) {
        super.bank_name="ICICI Bank";
        super.bank_type="Private Bank";
        super.bank_status=bs;
        super.rate_of_interest=roi;
    }
    
    public ICICI() {
        super.bank_name="ICICI Bank";
        super.bank_type="Private Bank";;
    }
    
    @Override
    void getDetails() {
        System.out.println("----------ICICI Bank Details---------");
        System.out.println("Bank Name: "+super.bank_name);
        System.out.println("Bank Type: "+super.bank_type);
        System.out.println("Bank Active: "+super.bank_status);
        System.out.println("Rate of Interest: "+super.rate_of_interest);
    }
}

class BOI extends Bank {
    
    public BOI(double roi,boolean bs) {
        super.bank_name="Bank of India";
        super.bank_type="Public Bank";
        super.bank_status=bs;
        super.rate_of_interest=roi;
    }
    
    public BOI() {
        super.bank_name="Bank of India";
        super.bank_type="Public Bank";
    }
    
    @Override
    void getDetails() {
        System.out.println("----------Bank of India Details---------");
        System.out.println("Bank Name: "+super.bank_name);
        System.out.println("Bank Type: "+super.bank_type);
        System.out.println("Bank Active: "+super.bank_status);
        System.out.println("Rate of Interest: "+super.rate_of_interest);
    }
}


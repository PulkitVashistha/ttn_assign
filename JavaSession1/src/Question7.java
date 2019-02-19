public class Question7 {
    
    public static String firstName;
    public static String lastName;
    public static int age;
    
    public Question7(String fname, String lname, int a) {
        firstName=fname;
        lastName=lname;
        age=a;
    }
    
    static  {
        System.out.println("\nGetting Details Through Static Block: ");
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
    }
    
    static public void getDetails() {
        System.out.println("\nPrinting Details Through Static Method: ");
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
    }
    
}

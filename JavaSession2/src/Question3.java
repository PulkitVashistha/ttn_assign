public class Question3 {
    void classNFExample() {
        try {
            Class.forName("Testing");
        }catch(ClassNotFoundException ex) {
            System.out.println("Class not found exception caught!");
        }
    }
}

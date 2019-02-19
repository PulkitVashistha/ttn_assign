public enum Question9 {
    
    AXIS_HOUSE(125000),BIRLA_HOUSE(158458);
    
    private int price;
    Question9(int p) {
        price=p;
    }
    
    int getPrice() {
        return price;
    }
    
}

class InfomationSystem {

    int id;
    
    public InfomationSystem(int id) {
        this.id=id;
    }
    
    public void getDetails() {
        if(id==1) {
            System.out.println("Welcome, Shubham Kumar. ID [ "+id+" ]");
        } else {
            System.out.println("Welcome, Guest User. ID [ "+id+" ]");
        }
    }

}

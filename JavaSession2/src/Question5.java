class Question5 implements Cloneable {

    private String name;
    private int id;
    
    
    public Question5(String tName, int tId) {
        name=tName;
        id=tId;
    }
    
    public Question5(Question5 tObj) {
        this.name=tObj.name;
        this.id=tObj.id;
    }
    
    public Question5() {
        name=null;
        id=0;
    }
    
    public Question5 clone() throws CloneNotSupportedException {
        Question5 tClone=(Question5)super.clone();
        return tClone;
    }
    
    public void printInfo() {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }

}

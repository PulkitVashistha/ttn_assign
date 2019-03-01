//Implementor
interface ColorShapeProvider {
    String getColorShapeType();
}

//Concrete Implementor
class Color implements ColorShapeProvider {
    
    @Override
    public String getColorShapeType() {
        return "Color";
    }
    
}

//Concrete Implementor
class Shape implements ColorShapeProvider {

    @Override
    public String getColorShapeType() {
        return "Shape";
    }
    
}

//Abstraction
abstract class ColorShape {
    
    String color;
    String shape;
    ColorShapeProvider colorShapeProvider;
    
    public ColorShape(String color, String shape, ColorShapeProvider colorShapeProvider) {
        
        this.color=color;
        this.shape=shape;
        this.colorShapeProvider=colorShapeProvider;
        
    }
    
}

//Redefined Abstraction
class BlueSquare extends ColorShape {
    
    String description;
    
    public BlueSquare(String description, ColorShapeProvider colorShapeProvider) {
        super("Blue","Square",colorShapeProvider);
        this.description=description;
    }
    
    @Override
    public String toString() {
        return "\nBlueSquare"+
                "\n{"+
                "\nColor: "+color+
                "\nShape: "+shape+
                "\nColorShapeProvider: "+colorShapeProvider.getColorShapeType()+
                "\nDescription: "+description;
    }
}

//Redefined Abstraction
class RedSquare extends ColorShape {
    
    String description;
    
    public RedSquare(String description, ColorShapeProvider colorShapeProvider) {
        super("Red","Square",colorShapeProvider);
        this.description=description;
    }
    
    @Override
    public String toString() {
        return "\nRedSquare"+
                "\n{"+
                "\nColor: "+color+
                "\nShape: "+shape+
                "\nColorShapeProvider: "+colorShapeProvider.getColorShapeType()+
                "\nDescription: "+description;
    }
    
}

//Redefined Abstraction
class PinkTriangle extends ColorShape {
    
    String description;
    
    public PinkTriangle(String description, ColorShapeProvider colorShapeProvider) {
        super("Pink","Triangle",colorShapeProvider);
        this.description=description;
    }
    
    @Override
    public String toString() {
        return "\nPinkTriangle"+
                "\n{"+
                "\nColor: "+color+
                "\nShape: "+shape+
                "\nColorShapeProvider: "+colorShapeProvider.getColorShapeType()+
                "\nDescription: "+description;
    }
    
}

public class Question5 {
    
    public static void main(String[] args) {
    
        BlueSquare blue=new BlueSquare("BlueSquare Coloured.",new Color());
        BlueSquare square=new BlueSquare("BlueSquare Shaped",new Shape());
    
        System.out.println(blue);
        System.out.println(square);
        
        PinkTriangle pink=new PinkTriangle("PinkTriangle Coloured.",new Color());
        PinkTriangle triangle=new PinkTriangle("PinkTriangle Shaped.",new Shape());
    
        System.out.println(pink);
        System.out.println(triangle);
    
    }
    
}

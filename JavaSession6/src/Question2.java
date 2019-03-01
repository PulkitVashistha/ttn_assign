
interface Polygon {
    void getPolygonType();
}

class Triangle implements Polygon {
    
    @Override
    public void getPolygonType() {
        System.out.println("Polygon Type: Triangle");
    }
}

class Pentagon implements Polygon {
    
    @Override
    public void getPolygonType() {
        System.out.println("Polygon Type: Pentagon");
    }
}

class Hexagon implements Polygon {
    
    @Override
    public void getPolygonType() {
        System.out.println("Polygon Type: Hexagon");
    }
}


class Octagon implements Polygon {
    
    @Override
    public void getPolygonType() {
        System.out.println("Polygon Type: Octagon");
    }
}

class Heptagon implements Polygon {
    
    @Override
    public void getPolygonType() {
        System.out.println("Polygon Type: Hectagon");
    }
}


class PolygonFactory {

    public static Polygon getPolygonType(String ptype) {
        
        if(ptype==null) {
            return null;
        } else if(ptype.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else if(ptype.equalsIgnoreCase("Pentagon")) {
            return new Pentagon();
        } else if(ptype.equalsIgnoreCase("Hexagon")) {
            return new Hexagon();
        } else if(ptype.equalsIgnoreCase("Octagon")) {
            return new Octagon();
        } else if(ptype.equalsIgnoreCase("Hectagon")) {
            return new Hexagon();
        }
        return null;
        
    }

}


public class Question2 {
    
    public static void main(String[] args) {
    
        Polygon polygon;
        
        polygon=PolygonFactory.getPolygonType("Triangle");
        polygon.getPolygonType();
        
        polygon=PolygonFactory.getPolygonType("Pentagon");
        polygon.getPolygonType();
        
    
    }
    
}

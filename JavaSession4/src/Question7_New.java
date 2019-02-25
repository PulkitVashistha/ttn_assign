import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

class SpecialStack<T> {
    private final int MAX;
    private final int MIN;
    private int CURR;
    private Stack<T> S=new Stack<>();
    private SortedMap<T,Integer> sortedMap=new TreeMap<>();
    
    public SpecialStack(int max) {
        MAX=max;
        MIN=0;
        CURR=MIN;
    }
    
    public boolean push(T t) {
        if(CURR<MAX) {
            sortedMap.put(t,CURR);
            S.addElement(t);
            CURR++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean pop() {
        if(CURR==MIN) {
            return false;
        } else {
            sortedMap.remove(S.get(CURR-1));
            System.out.println(sortedMap);
            S.removeElement(CURR);
            CURR--;
            return true;
        }
    }
    
    public boolean isFull() {
        if(CURR==MAX) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if(CURR==MIN) {
            return true;
        } else {
            return false;
        }
    }
    
    public void getMin() {
        if(CURR==MIN) {
        
        } else {
    
            System.out.println(sortedMap.firstKey());
            
        }
    }
    
}

public class Question7 {
    
    public static void main(String[] args) {
        
        SpecialStack<Integer> specialStack=new SpecialStack<>(5);
        //System.out.println("Is Stack Empty: "+specialStack.isEmpty());
        specialStack.push(45);
        specialStack.push(25);
        //System.out.println("Is Stack Empty: "+specialStack.isEmpty());
        //System.out.println("Is Stack Full: "+specialStack.isFull());
        specialStack.push(7);
        specialStack.push(65);
        specialStack.push(2);
        //System.out.println("Is Stack Full: "+specialStack.isFull());
        //System.out.println("Minimum Before Pop: "+(Integer)specialStack.getMin());
        specialStack.getMin();
        specialStack.pop();
        specialStack.getMin();
        //System.out.println("Minimum After Pop: "+(Integer)specialStack.getMin());
    }
    
}

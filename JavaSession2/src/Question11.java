public class Question11 {
    
    public Question11() {
    
    }
    
    public void forLoopCode() {
        System.out.println("FOR LOOP EXECUTION");
        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++)
        {
            s = s + i;
            for (int j = i; j > 0; j--)
            {
                t = t * (j - i);
            }
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
    }
    public void whileLoopCode() {
        System.out.println("WHILE LOOP EXECUTION");
        int s=0;
        int t=1;
        int i=0,j;
        
        while(i<10) {
    
            s = s + 1;
            j = i;
    
            while (j > 0) {
                t = t * (j - 1);
                j--;
            }
    
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is "+s);
        
    }
}


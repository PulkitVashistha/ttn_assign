public class Question5 {
    
    private int arr1[],arr2[];
    private boolean flag;
    
    public Question5() {
        arr1=new int[] {10,15,20,14,45,10,45};
        arr2=new int[] {15,14,45,78,175,20};
    }
    
    void printElements() {
        System.out.println("First Array Elements:");
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n\nSecond Array Elements:");
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\nCommon Elements: ");
    }
    
    void printCommonElements() {
        
        for(int i=0;i<arr1.length;i++) {
            
            flag=false;
            
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i]==arr2[j]) {
                    flag=true;
                }
            }
            
            if(flag==true) {
                System.out.print(arr1[i]+" ");
            }
            
        }
        
    }
    
    
}

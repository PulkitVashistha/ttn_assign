public class Question6 {

    private int arr[];
    private int ccnt;
    
    public Question6() {
        arr=new int[] {2,1,5,6,1,2,5};
        ccnt=0;
    }
    
    public void fetchDistinctElement() {
    
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = res ^ arr[i];
    
        System.out.println("Distinct Element: "+res);
    
    }

}

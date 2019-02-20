public class Question2 {

    private char []strArray;
    private int strLength;
    
    public Question2(String tStr) {
        strArray=tStr.toCharArray();
        strLength=tStr.length();
    }
    
    public void sortString() {
        
        StringBuilder SB=new StringBuilder();
        for (int i = 0; i < strLength-1; i++) {
            for (int j = 0; j < strLength - i - 1; j++) {
                if (strArray[j] > strArray[j + 1]) {
                    char tChar=strArray[j];
                    strArray[j]=strArray[j+1];
                    strArray[j+1]=tChar;
                }
            }
        }
        
        System.out.println(strArray);
        
    }
    
}

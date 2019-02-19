import java.util.Map;

public class Question2 {
    
    private int tot_occur;
    private String main_str;
    
    public Question2(String temp) {
        main_str = temp;
    }
    
    public void findOccurance() {
        String[] words = main_str.split(" ");
        int word_len = words.length;
        for(int i=0;i < word_len;i++) {
            
            tot_occur=1;
            
            for(int j=i+1;j < word_len;j++) {
                if(words[i].equals(words[j])) {
                    words[j]="";
                    tot_occur++;
                }
            }
            if(!words[i].equals(""))
            System.out.println(words[i]+" : "+tot_occur);
        }
    }
    
}

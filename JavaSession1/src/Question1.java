import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collection;

public class Question1 {
    private Boolean flag=false;
    private String main_str;
    private String find_str;
    private String replace_str;
    private StringBuilder SB=new StringBuilder();
    public Question1(String mstr, String fstr, String rstr) {
        main_str=mstr;
        find_str=fstr;
        replace_str=rstr;
    }
    
    public void findReplaceString() {
        String []temp=main_str.split(" ");
        for(int i=0;i< temp.length;i++) {
            if(temp[i].equals(find_str)) {
                temp[i]=replace_str;
                flag=true;
            }
            
            SB.append(temp[i]+" ");
        }
        if(flag) {
            main_str= SB.toString();
            System.out.println("Original String: "+main_str);
        } else {
            System.out.println("Substring not found to be replaced.");
        }
    }
}

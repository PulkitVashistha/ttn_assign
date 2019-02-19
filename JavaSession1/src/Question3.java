
public class Question3 {

    private String main_str;
    private Character main_char;
    
    public Question3(String tstr, char tchar) {
        main_str=tstr;
        main_char=tchar;
    }
    
    public void findOccurance() {
        int org_len=main_str.length();
        int temp_len=main_str.replaceAll(main_char.toString(),"").length();
        int clen=org_len-temp_len;
        System.out.println("Length of "+main_char+" in "+main_str+" is : "+clen);
    }

}

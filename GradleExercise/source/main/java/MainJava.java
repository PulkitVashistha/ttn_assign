import org.apache.commons.lang3.StringUtils;

public class MainJava {

    public static void main(String[] args) {
    
        System.out.println("EXAMPLE OF JAR BUILD TOOL, GRADLE");
        InfomationSystem infomationSystem;
        infomationSystem=new InfomationSystem(1);
        infomationSystem.getDetails();
        System.out.println("----------------UBER JAR EXAMPLE----------------");
    
        String str="THIS IS STRING";
        System.out.println(StringUtils.reverse(str));
    }
    
}
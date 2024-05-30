import java.util.LinkedHashSet;
import java.util.Scanner;
public class removed {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a Sting");
        String input=scanner.nextLine();
        String result=removesd(input);
        System.out.println("resultant string after removal of duplicates: "+result);    
        
    }
    public static String removesd(String input){
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            set.add(c);

        }
    

    StringBuffer sb=new StringBuffer();
    for(char c:set){
        sb.append(c);
    }

    return sb.toString();
}


    
}

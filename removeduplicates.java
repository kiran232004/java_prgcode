import java.util.Scanner;
public class removeduplicates {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string: ");
        String input=scanner.nextLine();
        String result=removeduplicates(input);
        System.out.println("resultantstring after removing dupliactes: "+result);
    }
    public static String removeduplicates(String input){
        StringBuffer result=new StringBuffer();
        System.out.println(result);
        for(int i=0;i<input.length();i++){
            char cchar=input.charAt(i);
            System.out.println(String.valueOf(cchar));
            if(result.indexOf(String.valueOf(cchar))==-1){
                result.append(cchar);

            }

        }
        return result.toString();
    }
    
}

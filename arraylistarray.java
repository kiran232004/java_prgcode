import java.util.*;
public class arraylistarray {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        System.out.println("the contents of a is:" + a);
        Integer inarr[] = new Integer[a.size()];
        inarr = a.toArray(inarr);
        int sum=0;
        for(int i:inarr)sum+=i;
        System.out.println("the sum is:" + sum);
    }
    
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args){
        String s = "this is test string";
        int size = s.length();
        String[] words = s.split(" ");
        String s1 = "";
        for(String w:words){
            s1 += Character.toUpperCase(w.charAt(0))+ w.substring(1)+ " ";
        }
        System.out.println("New string: "+s1);

        StringBuffer str = new StringBuffer(s1);
        str.reverse();
        System.out.println("Reversed string: "+str);
    }

}

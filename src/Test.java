import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args){
        List<String> liststr = new ArrayList<String>();
        liststr.add("One");
        liststr.add("Two");
        liststr.add("Three");
        System.out.println("The original list: "+liststr);
        Collections.reverse(liststr);
        System.out.println("The updated list: "+liststr);

    }

}

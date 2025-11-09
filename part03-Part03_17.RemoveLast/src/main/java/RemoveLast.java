
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("asdjioajodoas");
        
        removeLast(list);
        System.out.println(list);
        // Try your method in here
    }
    public static void removeLast (ArrayList<String> strings){
        if (strings.size()>=1){
            strings.remove(strings.size()-1);
        } else {
            return;
        }
    }

}

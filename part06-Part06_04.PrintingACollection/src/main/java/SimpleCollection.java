
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
<<<<<<< HEAD
=======
    @Override
public String toString() {
    if (this.elements.isEmpty()) {
        return "The collection " + this.name + " is empty.";
    }

    StringBuilder output = new StringBuilder();
    output.append("The collection ").append(this.name)
          .append(" has ").append(this.elements.size())
          .append(this.elements.size() == 1 ? " element:\n" : " elements:\n");

    for (String element : this.elements) {
        output.append(element).append("\n");
    }

    return output.toString().trim(); // trim to remove last newline
}

    
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
}

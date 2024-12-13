import java.util.ArrayList;

public class ListOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();  // Type-safe list
        
        // Adding elements
        numbers.add(1);                // append in Python
        numbers.add(0, 2);    // insert in Python
        
        // Accessing elements
        int first = numbers.get(0);    // numbers[0] in Python
        int last = numbers.get(numbers.size() - 1);  // numbers[-1] in Python
        
        // Removing elements
        numbers.remove(numbers.size() - 1);  // pop() in Python
        numbers.remove(Integer.valueOf(1));   // remove(1) in Python
        numbers.remove(0);             // del numbers[0] in Python

        list = [1, 2, 3]
        list.append(4)        # Addtoend
        length = len(list)    # Getlength
        // Java
        numbers.add(4);           // Add to end
        int length =  numbers.size();  // Get length

        numbers = [1, 2, 3, 4, 5]
        subset = numbers[1:4]
    }
}
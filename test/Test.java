
import com.williamngo.business.MyLinkedList;

/**
 *
 * @author Willy
 */
public class Test {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        
        list.addNode("1");
        list.addNode("five");
        list.addNode("454");
        list.addNode("again");
        
        list.addNodeAt(1, "Hello");
        list.printList();
        System.out.println("Testing order");
    }
}

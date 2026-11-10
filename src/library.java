import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class library {

    private ArrayList<transaction> transactions = new ArrayList<>();

    private Queue<borrowTransaction> borrowedBooks = new LinkedList<>();
    
    
    public void borrowBook(String name, String id, String institute,
                           String bookTitle) {

        borrowTransaction borrow = new borrowTransaction(
            name, id, institute, bookTitle
        );

        transactions.add(borrow);
        borrowedBooks.add(borrow);
}


}

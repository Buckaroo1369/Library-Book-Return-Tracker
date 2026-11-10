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
    public boolean returnBook(String id, String bookTitle, String condition) {

    Iterator<borrowTransaction> iterator = borrowedBooks.iterator();

    while (iterator.hasNext()) {

        borrowTransaction borrow = iterator.next();

        if (borrow.getId().equalsIgnoreCase(id.trim()) &&
            borrow.getBookTitle().equalsIgnoreCase(bookTitle.trim())) {

            returnTransaction returned = new returnTransaction(
                borrow.getName(),
                borrow.getId(),
                borrow.getInstitute(),
                borrow.getBookTitle(),
                condition
            );

            borrow.setStatus(returned.getStatus());
            borrow.setCondition(returned.getCondition());

            iterator.remove();

            return true;
        }
    }

    return false;
}


}

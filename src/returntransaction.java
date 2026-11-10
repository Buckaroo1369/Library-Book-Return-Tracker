
public class returntransaction extends transaction {
    public returntransaction(String name, String id, String institute, String bookTitle, String condition) {

        super(name, id, institute, bookTitle, "Returned", condition);  
    }
    
}

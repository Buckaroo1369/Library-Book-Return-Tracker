public class borrowTransaction extends transaction {

    public borrowTransaction(String name, String id, String institute,  String bookTitle) {
        super(name, id, institute, bookTitle, "Borrowed", "-");
    }
}

public class transaction {
    private student student;
    private String bookTitle;
    private String status;
    private String condition;

    public transaction(student student, String bookTitle) {
        this.student = student;
        this.bookTitle = bookTitle;
        this.status = "Borrowed";
        this.condition = "Not yet returned";
    }

    public student getStudent() {
        return student;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getStatus() {
        return status;
    }

    public String getCondition() {
        return condition;
    }

    public void returnBook(String condition) {
        this.status = "Returned";
        this.condition = condition;
    }
}
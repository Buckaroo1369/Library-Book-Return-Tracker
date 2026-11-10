
public class transaction {
    private String name;
    private String id;
    private String institute;
    private String bookTitle;
    private String status;
    private String condition;
    
     public transaction(String name, String id, String institute,
                       String bookTitle, String status, String condition) {

        this.name = name;
        this.id = id;
        this.institute = institute;
        this.bookTitle = bookTitle;
        this.status = status;
        this.condition = condition;
        
     }
     
     public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getInstitute() {
        return institute;
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

}

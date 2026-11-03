


public class borrowingRecord {
    private Student student;
    private Book book;
    private String borrowDate;
    private String dueDate;
    
    private String returnDate;
    private String condition;
    private String status;
    
    public borrowingRecord(Student student, Book book, String borrowDate; String dueDate){
         this.student = student;
         this.book = book;
         this.borrowDate = borrowDate;
         this.dueDate = dueDate;
         this.status = "Borrowed";
        
    }
    
    public void returnBook(String returnDate, String condition){
        this.returnDate = returnDate;
        this.condition = condition;
        this.status = "Returned";
        
    }
    
    public Student getStudent(){
        return student;
    }
    
    public Book getBook(){
        return book;
        
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getReturnDate)(){
        return returnDate;
    }
    
    public String getCondition(){
        return condition;
        
    }
    
    
}

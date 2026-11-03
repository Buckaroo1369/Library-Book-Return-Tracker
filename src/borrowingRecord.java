
public class borrowingRecord {
    private student student;
    private books books;
    private String borrowDate;
    private String dueDate;
    
    private String returnDate;
    private String condition;
    private String status;
    
    public borrowingRecord(student student, books books, String borrowDate, String returnDate, String dueDate){
         this.student = student;
         this.books = books;
         this.borrowDate = borrowDate;
         this.dueDate = dueDate;
         this.status = "Borrowed";
        
    }
    
    public void returnBook(String returnDate, String condition){
        this.returnDate = returnDate;
        this.condition = condition;
        this.status = "Returned";
        
    }
    
    public student getStudent(){
        return student;
    }
    
    public books getBook(){
        return books;
        
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getReturnDate(){
        return returnDate;
    }
    
    public String getCondition(){
        return condition;
        
    }
    
    
}

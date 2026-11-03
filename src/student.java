
public class student extends client {
    public student(String id, String name){
        super(id, name);
        
    }
    
    public String getDetails(){
        return "Student: " +
                super.getDetails();
    }
}

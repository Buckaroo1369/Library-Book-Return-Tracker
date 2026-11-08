import javax.swing.*;
import java.awt.*;


public class mainFrame {
        
     private Library library;
     
     private JTextField txtSearch;
     private JTextField txtStudentId;
     private JTextField txtName;
     private JTextField txtBookId;
     private JTextField txtBorrowDate;
     private JTextField txtDueDate;
     
     
     private JTextField txtReturnStudentId;
     private JTextField txtReturnBookId;
     private JTextField txtReturnDate;
     private JComboBox<String>cmbCondition;
     private JTextArea txtDisplay;
     
     public mainFrame(){
         
         library = new library();
         
         library.addBook(new books("B001", "Java Programming", "Author A", 3));
         
         library.addBook(new books("B002", "Database Systems", "Author B", 2));
         
         library.addBook(new books("B003", "Computer Networks", "Author C", 4));
         
         setTitle("Library Book Return Tracker");
         
         setSize(750, 750);
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         setLocationRelativeTo(null);
         
         setLayout(new BorderLayout(10, 10));
         
         JLabel title = new Jlabel("LIBRARY BOOK RETURN TRACKER" , SwingConstant.CENTER
         
         
         
         
     }
     
    
}

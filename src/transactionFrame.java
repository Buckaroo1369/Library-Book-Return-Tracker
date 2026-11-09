import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class transactionFrame {
    private Library library;
    
    private JTextField txtSearch;
    private JTable tblTransaction;
    private DefaultTableModel tableModel;
    
    public TransactionFrame(){
        
        library = new Library();
        
        setTitle("Library Transaction DashBoard");
        setSize(800, 500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        
        createSampleRecords();
        initializeComponents();
        
        displayTransaction(library.getTransaction());
        }
        
        private void initializeComponents(){
            setLayout(new BorderLayout(10,10));
            
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        
        JLabel lblTitle = new JLabel("Library Transactions");
            lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
            
            txtSearch = new JTextField();
            
            JButton btnSearch =  new JButton("Search");
            JButton btnClear = new JButton("Clear");
            
            
    }
}

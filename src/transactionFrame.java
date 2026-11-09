import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class transactionFrame extends JFrame{
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
            
            JPanel searchButtons = new JPanel();
            
            searchButtons.add(btnSearch);
            searchButtons.add(btnClear);
            
            searchPanel.add(searchButtons, BorderLayout.EAST);
            
            topPanel.add(lblTitle, BorderLayout.NORTH);
            topPanel.add(lblTitle, BorderLayout.SOUTH);
            
            String[] columns = {
                "Student ID",
                "Student Name",
                "Book Title",
                "Condition",
            };
            
            tableModel = new DefaultTableModel(columns, 0){
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            
            tblTransactions = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(tblTransaction);
            
            JPanel bottonPanel = new JPanel();
            JButton btnBorrow = new JButton("Borrowing");
            JButton btnReturn = new JButton("Returning");
            
            bottomPanel.add(btnBorrow);
            bottomPanel.add(btnReturn);
            
            //add components
            
            add(topPanel, BorderLayout.NORTH);
            add(scrollPane, BorderLayout.CENTER);
            add(bottonPanel, BorderLayout.SOUTH);
            
            
            btnSearch.addActionListener(e -> searchTransaction());
            
            btnClear.addActionListener(e -> {txtSearch.setText(""));
            
            displayTransactions(library.getTransactions());
            
            });
            
            
            bntBorrow.addActionListener(e -> JOptionPane.showMessageDialog(this, "Borrowing Frame will be added in the next stage."));
            
            bntReturn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Returning Frame will be added in the next stage."));
               
            }
            
            private void displayTransactions(ArrayList<Transaction> records) {

            tableModel.setRowCount(0);

            for (transaction transaction : records) {

            Object[] row = {
                transaction.getStudent().getStudentId(),
                transaction.getStudent().getName(),
                transaction.getBookTitle(),
                transaction.getStatus(),
                transaction.getCondition()
            };

            tableModel.addRow(row);
            
            
            
                }
            }
            
            
            
            
            
            
            
            
    }
}

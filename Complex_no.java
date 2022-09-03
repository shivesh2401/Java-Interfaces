package complexxx;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Kumar Parth
 */
public class Complexxx implements ActionListener{
    
    Frame F = new Frame();
    Label L1 = new Label("First X");
    Label L2 = new Label("Second X");
    Label L3 = new Label("First Y");
    Label L4 = new Label("Second Y");
    Label L5 = new Label("Result");
    
    TextField T1 = new TextField();
    TextField T2 = new TextField();
    TextField T3 = new TextField();
    TextField T4 = new TextField();
    TextField T5 = new TextField();
    
    Button B1 = new Button("Add");
    Button B2 = new Button("Cancel");
    
    public Complexxx()
    {
        L1.setBounds(50,100,50,20);
        T1.setBounds(150,100,50,20);
        L2.setBounds(50,150,50,20);
        T2.setBounds(150,150,50,20);
        L3.setBounds(50,200,50,20);
        T3.setBounds(150,200,50,20);
        L4.setBounds(50,250,50,20);
        T4.setBounds(150,250,50,20);
        L5.setBounds(50,300,50,20);
        T5.setBounds(150,300,50,20);
        
        B1.setBounds(100,350,50,20);
        B2.setBounds(150,350,50,20);
        
        F.setSize(500,500);
        F.setVisible(true);
        F.setLayout(null);
        
        F.add(L1);
        F.add(L2);
        F.add(L3);
        F.add(L4);
        F.add(L5);
        F.add(T1);
        F.add(T2);
        F.add(T3);
        F.add(T4);
        F.add(T5);
        F.add(B1);
        F.add(B2);
        
        B1.addActionListener(this);
        B2.addActionListener(this);
    }
    
    /**
     * @param args the command line arguments
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B2)
        {
            System.exit(0);
        }
        
        else if(e.getSource()==B1)
        {
            int X1 = Integer.parseInt(T1.getText());
            int X2 = Integer.parseInt(T2.getText());
            int Y1 = Integer.parseInt(T3.getText());
            int Y2 = Integer.parseInt(T4.getText());
            
            String ans = (X1+X2) + "i+ " + (Y1+Y2);
            T5.setText(ans);
            
        }
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Complexxx();
    }
    
}

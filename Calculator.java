package calculatorrr;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Kumar Parth
 */
public class Calculatorrr implements ActionListener
{
    Frame F = new Frame();
    
    Label L1 = new Label("Number 1");
    Label L2 = new Label("Number 2");
    Label L3 = new Label("Result");
    
    TextField T1 = new TextField();
    TextField T2 = new TextField();
    TextField T3 = new TextField();
    
    Button B1 = new Button("+");
    Button B2 = new Button("-");
    Button B3 = new Button("*");
    Button B4 = new Button("/");
    Button B5 = new Button("%");

    public Calculatorrr() 
    {
        L1.setBounds(50,100,50,20);
        T1.setBounds(150,100,50,20);
        L2.setBounds(50,150,50,20);
        T2.setBounds(150,150,50,20);
        L3.setBounds(50,200,50,20);
        T3.setBounds(150,200,50,20);
        
        B1.setBounds(150,250,50,20);
        B2.setBounds(200,250,50,20);
        B3.setBounds(250,250,50,20);
        B4.setBounds(300,250,50,20);
        B5.setBounds(350,250,50,20);
        
        F.setSize(500,500);
        F.setLayout(null);
        F.setVisible(true);
        
        F.add(L1);
        F.add(L2);
        F.add(L3);
        F.add(T1);
        F.add(T2);
        F.add(T3);
        F.add(B1);
        F.add(B2);
        F.add(B3);
        F.add(B4);
        F.add(B5);
        
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Float a = Float.parseFloat(T1.getText());
        Float b = Float.parseFloat(T2.getText());
        
        if(e.getSource()==B1)
        {
            Float c = a+b;        
            T3.setText(Float.toString(c));
        }
        if(e.getSource()==B2)
        {
            Float c = a-b;
            T3.setText(Float.toString(c));
        }
        if(e.getSource()==B3)
        {
            Float c = a*b;
            T3.setText(Float.toString(c));
        }
        if(e.getSource()==B4)
        {
            Float c = a/b;
            T3.setText(Float.toString(c));
        }
        if(e.getSource()==B5)
        {
            Float c = a%b;
            T3.setText(Float.toString(c));
        }
        
    }
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Calculatorrr();
    }
    
}

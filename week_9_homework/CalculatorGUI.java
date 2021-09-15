import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;        //action listener is a part of this package;

/**
 * Write a description of class CalculatorGUI here.
 *
 * @author (Zhiqiang Yu)
 * @version (version 1.0 -- 12/09/2021)
 */
public class CalculatorGUI extends JFrame implements ActionListener, KeyListener
{
    JPanel redPanel;        
    JPanel greenPanel;
    JPanel bluePanel;
    
    JButton btnOne;     
    JButton btnTwo;
    JButton btnThree;
    
    JTextField textField;       
    /**
     * Constructor for objects of class CalculatorGUI
     */
    public CalculatorGUI()
    {
        super ("Albert's Calculator GUI");
        setLayout(null);        
        
        //create Panels
        redPanel = new JPanel();       
        redPanel.setLayout(null);       
        redPanel.setBackground(Color.red);      
        redPanel.setSize(100, 200);    
        redPanel.setLocation(10, 10);     
        
        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setSize(100, 200);
        greenPanel.setLocation(120, 10);
        
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setSize(100, 200);
        bluePanel.setLocation(230,10);
        
        add(redPanel);      
        add(greenPanel);
        add(bluePanel);
        
        //create button;
        btnOne = new JButton("Red");        
        redPanel.add(btnOne);       
        btnOne.setSize(70, 70);     
        btnOne.setLocation(5, 5);
        btnOne.setActionCommand("CNMD_One");
        btnOne.addActionListener(this);     //in java 'this' basicly used by the object itself; registe action listener;
        
        btnTwo = new JButton("Two");
        greenPanel.add(btnTwo);
        btnTwo.setActionCommand("CNMD_Two");
        btnTwo.addActionListener(this);
        
        btnThree = new JButton("Three");
        bluePanel.add(btnThree);
        btnThree.setActionCommand("CNMD_Three");
        btnThree.addActionListener(this);
        
        
        textField = new JTextField();       
        textField.setSize(200, 50);     
        textField.setLocation(10, 220);        
        add(textField);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);      
        setCursor(CROSSHAIR_CURSOR);        
        setPreferredSize(new Dimension(400, 300));      
        pack(); 
        
        
        addKeyListener(this);       //registe key listener;
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String cnmd = e.getActionCommand();
        if (cnmd.equals("CNMD_One"))
        {
            System.out.println("Button one was clicked!");
        }else
        if(cnmd.equals("CNMD_Two"))
        {
            System.out.println("Button two was clicked!");
        }else
        if(cnmd.equals("CNMD_Three"))
        {
            System.out.println("Button three was clicked!");
        }
        //System.out.println(e.getActionCommand());
    }
    
    public void keyPressed(KeyEvent e)
    {
        System.out.println("A key was pressed!");
    }
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void keyTyped(KeyEvent e)
    {
        
    }

    public static void main (String[] args)
    {
        CalculatorGUI frame = new CalculatorGUI();
        frame.setVisible(true);
    }
}

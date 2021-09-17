import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;        //action listener is a part of this package;

/**
 * Write a description of class CalculatorGUI here.
 *
 * @author (Zhiqiang Yu)
 * @version (version 1.0 -- 12/09/2021)
 */
public class CalculatorGUI extends JFrame implements ActionListener, KeyListener, MouseListener, WindowListener
{
    JPanel redPanel;        
    JPanel greenPanel;
    JPanel bluePanel; 
    
    JButton btnOne;     
    JButton btnTwo;
    JButton btnThree;
    
    JTextField textField;
    
    String expression = "";
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
        
        setFocusable(true);
        //addKeyListener(this);       //registe key listener;
        //bluePanel.setFocusable(true);
        //bluePanel.addMouseListener(this);
        
        addWindowListener(this);
    }
    /**
     * actionListener
     */
    public void actionPerformed(ActionEvent e)
    {
        String cnmd = e.getActionCommand();
        if (cnmd.equals("CNMD_One"))
        {
            expression = expression + "1";
            //textField.setText("1");
        }else
        if(cnmd.equals("CNMD_Two"))
        {
            expression = expression + "2";
            //textField.setText("2");
        }else
        if(cnmd.equals("CNMD_Three"))
        {
            expression = expression + "3";
            //textField.setText("3");
        }
        textField.setText(expression);
        //System.out.println(e.getActionCommand());
    }
    /**
     * keyListener
     */
    public void keyPressed(KeyEvent e)
    {
        System.out.println("A key was pressed!" + e.getKeyCode());
        /*
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_BACK_SPACE)
        {
            System.out.println("Backspace was pressed!" + e.getKeyCode());
        }
        */
    }
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void keyTyped(KeyEvent e)
    {
        
    }
    
    /**
     * mouseListener
     */
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse pressed; # of clicks: " + e.getClickCount());
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse released; # of clicks: " + e.getClickCount());
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse exited");
    }
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse clicked (# of clicks: " + e.getClickCount() + ")");
    }

    //window listener
    public void windowActivated(WindowEvent arg0) 
    {  
        System.out.println("activated");  
    }  
    
    public void windowClosed(WindowEvent arg0) 
    {  
        System.out.println("closed");  
    }
    
    public void windowClosing(WindowEvent arg0) 
    {  
        JOptionPane.showMessageDialog(this, "Are you sure you want to cloes the window?");
        //A pause so user can see the message before
        //the window actually closes.
        ActionListener task = new ActionListener() {
            boolean alreadyDisposed = false;
            public void actionPerformed(ActionEvent e) {
                if (isDisplayable()) {
                    alreadyDisposed = true;
                    dispose();
                }
            }
        };
        Timer timer = new Timer(500, task); //fire every half second
        timer.setInitialDelay(2000);        //first delay 2 seconds
        timer.setRepeats(false);
        timer.start();
        //System.out.println("closing");  
        //dispose();  
    }  
    
    public void windowDeactivated(WindowEvent arg0)     
    {  
        System.out.println("deactivated");  
    }  
    
    public void windowDeiconified(WindowEvent arg0) 
    {  
        System.out.println("deiconified");  
    }  
    
    public void windowIconified(WindowEvent arg0) 
    {  
        System.out.println("iconified");  
    }  
    
    public void windowOpened(WindowEvent arg0) 
    {  
        System.out.println("opened");  
    }  

    
    public static void main (String[] args)
    {
        CalculatorGUI frame = new CalculatorGUI();
        frame.setVisible(true);
    }
}

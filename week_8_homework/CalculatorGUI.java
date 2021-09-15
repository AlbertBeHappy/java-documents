import javax.swing.*;   //import everything that in swing libraries; it's a lazy way to import; use for testing;
import java.awt.*;   //import everything that in swing libraries;

/**
 * Write a description of class CalculatorGUI here.
 *
 * @author (Zhiqiang Yu)
 * @version (version 1.0 -- 12/09/2021)
 */
public class CalculatorGUI extends JFrame       //JFrame document is a place that should be always read when progamming;
{
    JPanel redPanel;        //define the Panel;
    JPanel greenPanel;
    JPanel bluePanel;
    
    JButton btnOne;     //define the button;
    JButton btnTwo;
    JButton btnThree;
    
    JTextField textField;       //define text feild;
    /**
     * Constructor for objects of class CalculatorGUI
     */
    public CalculatorGUI()
    {
        super ("Albert's Calculator GUI");      //name of Frame;
        setLayout(null);        //makes the Layout manager to null;
        
        //create Panels
        redPanel = new JPanel();        //create Panel from JPanel() method;
        redPanel.setLayout(null);       //if you  set the size of the button, you should set the Layout manager of Panel to null first;
        redPanel.setBackground(Color.red);       //set up the background color of the Panel;
        redPanel.setSize(100, 200);     //set the size of the Panel;
        redPanel.setLocation(10, 10);       //set the location of Panel;
        
        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setSize(100, 200);
        greenPanel.setLocation(120, 10);
        
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setSize(100, 200);
        bluePanel.setLocation(230,10);
        
        add(redPanel);      //add  Panel to the main Frame; if only add the redPanel the Panel will expend to the whole size of the window;
        add(greenPanel);
        add(bluePanel);
        
        //create button;
        btnOne = new JButton("Red");        //create button one from JButton() method;
        redPanel.add(btnOne);       //add button to the Panel;
        btnOne.setSize(70, 70);     //set the size of the button;
        btnOne.setLocation(5, 5);       //set the location of the button in Panel;
        
        btnTwo = new JButton("Two");
        greenPanel.add(btnTwo);
        
        btnThree = new JButton("Three");
        bluePanel.add(btnThree);
        
        //create the text field;
        textField = new JTextField();       //create text field one from JTextField() method;
        textField.setSize(200, 50);     //set the size of the text field;
        textField.setLocation(10, 220);        //set the location of the text field;
        add(textField);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);      //make the frame can be closed by anyway; use the button which at the bottom right corner to reflash the program;
        setCursor(CROSSHAIR_CURSOR);        //make the cursor change to be a crosshair;        
        setPreferredSize(new Dimension(400, 300));      //change the size of frame;
        pack();     //make the layout manager working;
    }

    public static void main (String[] args)
    {
        CalculatorGUI frame = new CalculatorGUI();
        frame.setVisible(true);     //make the frame visivle;
    }
}

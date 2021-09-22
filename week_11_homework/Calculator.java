import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Write a description of class Calculator here.
 * 
 * layout manager; complex layout; backspace; use array to create button;
 *
 * @author (Zhiqiang Yu)
 * @version (version week 10)
 */
public class Calculator extends JFrame implements ActionListener
{
    JTextField display;     //calculator's display;
    
    JButton[] button;
    JButton backSpace;
    String[] buttonNames = {"1","2","3","4","5","6","7","8","9","CE","0","."};
    String[] buttonCommands = {"CMD_1","CMD_2","CMD_3","CMD_4","CMD_5","CMD_6","CMD_7","CMD_8","CMD_9","CMD_CE","CMD_0","CMD_DOT"};
    
     JButton[] signButtons;
    String[] signButtonNames = {"+","<<","-","C","*","(","/",")","!","OFF"};
    String[] signButtonCommands = {"CMD_ADD","CMD_BS","CMD_SUB","CMD_CE","CMD_MUL","CMD_LPT","CMD_DIV","CMD_RPT","CMD_FCT","CMD_OFF"};
    
    String expression = "";
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        super("Simple Calculator");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        
        
        CreateCalcGUI();
    }
    
    /**
     * a method to set up the GUI
     */
    private void CreateCalcGUI()
    {
        
        JPanel panelTop = new JPanel();
        panelTop.setBackground(Color.gray);
        GridLayout panelTopLayout = new GridLayout(0,1);
        panelTop.setLayout(panelTopLayout);
        
        
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.blue);
        GridLayout panelCenterLayout = new GridLayout(4,3);
        panelCenter.setLayout(panelCenterLayout);
        
        
        BorderLayout mainLayout = new BorderLayout();
        setLayout(mainLayout);
        add(panelTop,BorderLayout.NORTH);
        add(panelCenter, BorderLayout.CENTER);
        
        //create display;
        display = new JTextField("");
        Font displayFont = new Font("SansSerif", Font.BOLD, 20);
        display.setFont(displayFont);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(100,35));
        panelTop.add(display);
        
        //create buttons
        button = new JButton[12];
        for (int i = 0; i < button.length; i++)
        {
            button[i] = new JButton(buttonNames[i]);
            button[i].setActionCommand(buttonCommands[i]);
            button[i].addActionListener(this);
            panelCenter.add(button[i]);
        }
        
        backSpace = new JButton("<<");
        backSpace.addActionListener(this);
        backSpace.setActionCommand("CMD_BS");
        add(backSpace, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String displayText;
        displayText = display.getText();
        
        String cmd = e.getActionCommand();
        switch (cmd)
        {
            case "CMD_1":
                displayText = displayText + "1";
                break;
            case "CMD_2":
                displayText = displayText + "2";
                break;
            case "CMD_3":
                displayText = displayText + "3";
                break;
            case "CMD_4":
                displayText = displayText + "4";
                break;
            case "CMD_5":
                displayText = displayText + "5";
                break;
            case "CMD_6":
                displayText = displayText + "6";
                break;
            case "CMD_7":
                displayText = displayText + "7";
                break;
            case "CMD_8":
                displayText = displayText + "8";
                break;
            case "CMD_9":
                displayText = displayText + "9";
                break;
            case "CMD_CE":
                displayText = "";
                break;
            case "CMD_0":
                if (displayText.equals("0"))
                {
                    displayText = "0";
                } else {
                displayText = displayText + "0";
                }
                break;
            case "CMD_DOT":
                if (displayText.equals(""))
                {
                    displayText = "";
                } else {
                displayText = displayText + ".";
                }
                break;
            case "CMD_BS":
                displayText = displayText.substring(0, displayText.length()-1);
                break;
        }
        display.setText(displayText);
    }
    
    public static void main (String[] arg)
    {
        Calculator calc = new Calculator();
        calc.setVisible(true);
    }
}

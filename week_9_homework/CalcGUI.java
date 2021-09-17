import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;        //action listener is a part of this package;

/**
 * Write a description of class CalculatorGUI here.
 *
 * @author (Zhiqiang Yu)
 * @version (version 1.0 -- 12/09/2021)
 */
public class CalcGUI extends JFrame implements ActionListener
{
    JPanel buttonPanel;
    JPanel textFieldPanel;
    
    JButton btn1;     
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn0;
    JButton btn10;
    JButton btn11;
    JButton btn12;
    JButton btn13;
    JButton btn14;
    JButton btn15;
    JButton btn16;
    JButton btn17;
    JButton btn18;
    JButton btn19;
    JButton btn20;
    JButton btn21;
    JButton btn22;
    JButton btn23;
    
    
    JTextField textField;
    
    String expression = "";
    /**
     * Constructor for objects of class CalculatorGUI
     */
    public CalcGUI()
    {
        super ("Albert's Calculator GUI");
        setLayout(null);
        
        //create panel
        buttonPanel = new JPanel();
        buttonPanel.setSize(400, 300);
        buttonPanel.setLocation(10, 200);
        
        //textFieldPanel = new JPanel();
        //textFieldPanel.setSize(200, 150);
        //textFieldPanel.setLocation(10, 10);
        
        add(buttonPanel);
        //add(textFieldPanel);
        
        //create button;
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton(".");
        btn12 = new JButton("+/-");
        btn13 = new JButton("=");
        btn14 = new JButton("+");
        btn15 = new JButton("-");
        btn16 = new JButton("*");
        btn17 = new JButton("/");
        btn18 = new JButton("!");
        btn19 = new JButton("<<");
        btn20 = new JButton("C");
        btn21 = new JButton("(");
        btn22 = new JButton(")");
        btn23 = new JButton("OFF");
        
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btn10);
        buttonPanel.add(btn11);
        buttonPanel.add(btn12);
        buttonPanel.add(btn13);
        buttonPanel.add(btn14);
        buttonPanel.add(btn15);
        buttonPanel.add(btn16);
        buttonPanel.add(btn17);
        buttonPanel.add(btn18);
        buttonPanel.add(btn19);
        buttonPanel.add(btn20);
        buttonPanel.add(btn21);
        buttonPanel.add(btn22);
        buttonPanel.add(btn23);
        
        btn1.setActionCommand("1");
        btn2.setActionCommand("2");
        btn3.setActionCommand("3");
        btn4.setActionCommand("4");
        btn5.setActionCommand("5");
        btn6.setActionCommand("6");
        btn7.setActionCommand("7");
        btn8.setActionCommand("8");
        btn9.setActionCommand("9");
        btn10.setActionCommand("0");
        btn11.setActionCommand(".");
        btn12.setActionCommand("+/-");
        btn13.setActionCommand("=");
        btn14.setActionCommand("+");
        btn15.setActionCommand("-");
        btn16.setActionCommand("*");
        btn17.setActionCommand("/");
        btn18.setActionCommand("!");
        btn19.setActionCommand("<<");
        btn20.setActionCommand("C");
        btn21.setActionCommand("(");
        btn22.setActionCommand(")");
        btn23.setActionCommand("OFF");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn20.addActionListener(this);
        btn21.addActionListener(this);
        btn22.addActionListener(this);
        btn23.addActionListener(this);
        
        //create text field
        textField = new JTextField();       
        textField.setSize(800, 50);     
        textField.setLocation(10, 10);        
        //textFieldPanel.add(textField);
        add(textField);
        
        //set the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);      
        setCursor(CROSSHAIR_CURSOR);        
        setPreferredSize(new Dimension(800, 600));      
        pack();
    }
    /**
     * actionListener
     */
    public void actionPerformed(ActionEvent e)
    {
        String cnmd = e.getActionCommand();
        String text = textField.getText();
        if (cnmd.equals("1"))
        {
            expression = expression + "1";
        }else
        if(cnmd.equals("2"))
        {
            expression = expression + "2";
            //textField.setText("2");
        }else
        if(cnmd.equals("3"))
        {
            expression = expression + "3";
            //textField.setText("3");
        }else
        if (cnmd.equals("4"))
        {
            expression = expression + "4";
        }else
        if (cnmd.equals("5"))
        {
            expression = expression + "5";
        }else
        if (cnmd.equals("6"))
        {
            expression = expression + "6";
        }else
        if (cnmd.equals("7"))
        {
            expression = expression + "7";
        }else
        if (cnmd.equals("8"))
        {
            expression = expression + "8";
        }else
        if (cnmd.equals("9"))
        {
            expression = expression + "9";
        }else
        if (cnmd.equals("0"))
        {
            expression = expression + "0";
        }else
        if (cnmd.equals("1"))
        {
            expression = expression + "1";
        }else
        if (cnmd.equals("."))
        {
            expression = expression + ".";
        }else
        if (cnmd.equals("+"))
        {
            expression = expression + "+";
        }else
        if (cnmd.equals("-"))
        {
            expression = expression + "-";
        }else
        if (cnmd.equals("*"))
        {
            expression = expression + "*";
        }else
        if (cnmd.equals("/"))
        {
            expression = expression + "/";
        }else
        if (cnmd.equals("!"))
        {
            expression = expression + "!";
        }else
        if (cnmd.equals("("))
        {
            expression = expression + "(";
        }else
        if (cnmd.equals(")"))
        {
            expression = expression + ")";
        }else
        if (cnmd.equals("C"))
        {
            expression = "";
        }else
        if (cnmd.equals("！"))
        {
            expression = expression + "！";
        }else
        if (cnmd.equals("OFF"))
        {
            System.exit(0);
        }else
        if (cnmd.equals("<<") && text.length() > 0)
        {
            textField.setText(text.substring(0,text.length()-1));
        }
        textField.setText(expression);
        //System.out.println(e.getActionCommand());
    }


    public static void main (String[] args)
    {
        CalcGUI frame = new CalcGUI();
        frame.setVisible(true);
    }
}

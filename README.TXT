------------------------------------------------------------------------
这是这个工程的README文件，你可以在这里描述你的工程。告诉读者（某些对这个
工程一无所知的人）所有他所需要知道的东西。你的说明通常至少应该包含以下几
个部分：
------------------------------------------------------------------------

工程名：GUI
工程的目标：
版本或者日期：
如何启动这个工程：
作者
使用指南：


Containers:

    frame
        hight level container; top-container
    panel/pane
        second level container; sub-container 
    a way to organize the components
    
Components:
    
    label
    input box
    button

Layout Manager:

    flow layout (horizontal)
    box layout (vertical)
    border layout
    grid layout
    grid bag layout
    
Event Listeners:
    
    action event | action listener
    mouse event | mouse listener & mouse motion listener
    mouse wheel event | mouse wheel listener
    key event | key listener
    item event | item listener
    text event | text listener
    adjustment event | adjustment listener
    window event | window listener
    component event | component listener
    container event | container listener
    focus event | focus listener

Java GUI libraries:
    
    AWT (Java Abstract Window Tooklkit)
        import java.atw.*
        part of JFC
    Java Swing
        import java.swing.*
        current & popular
        better look & feel
        based on AWT
    JavaFX
        import javafx.*
        becoming the standerd GUI library for Java
        
AWT libraries：

    is an API to develop GUI or window-based applications in java;
    is a part of Java Foundation Clasees (JFC);

Swing libraries:

    is a Java NATIVE API to develop GUI or window-based applications in java;
    provides the same look & feel across different platforms;

Java Swing containers:
    
    Swing introduces a number of additional containers
        root pane
        layerd pane
        content pane
        glass pane

JavaFx:
    
    a new design so doesn't fellow AWT or Swing;
    
Buliding a GUI in Java:
    
    1. create a high level container;
    2. create a layout manager for the high level container;
    3. create light-weight container;
    4. create layout managers for light-weight containers;
    5. create components;
    6. add components to the light-weight containers;
    7. add the light-weight containers to the high level container;
    8. implement required event listeners;
    9. make the high level container visible;

**********************************************************************
a small simple
**********************************************************************

1. import corresponding libraries
    java.awt.FlowLayout;
        FlowLayout manager; a part of AWT libraries;
    java.swing.JButton;
    java.swing.JFrame;
    java.swing.JLabel;
    java.swing.JPanel;
    java.swing.JPasswordField;
    java.swing.JTextField;
    java.swing.SwingUtilities;

2. "extends" 
    means create the class based on JFrame class (orgainal class); 
    makes the JFrame class like a parent class;
    basicly has all the features & all the properties that JFrame class has;
    
3. define the properties 

4. "super"
    set the title of the Frame;

5. "pack"
    organized the all the components fellowing the layout manager;

6. main method
    SwingUtilites,invokeLater(new Runnable())
    {
        @Override
        public void run()
        {
            new LoginForm().setVisible(true);
        }
    };
    // allow us to manage our form; 
    ----------------------------------------
    LoginForm form = new LoginForm();
    form.setVisible(true);  
    
**********************************************************************
**********************************************************************

in A2 build a calculator program.

1. bulid the calculator interface;
2. implement the logic; function program; make all the buttons are working;
3. create a GitHub; share the link to submit the A2

**********************************************************************
**********************************************************************



package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_1 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);
    
    private JButtonObserver but1;
    private JButtonObserver but2;
    private JButtonObserver but3;

    public IHMQuestion2_1() {
        super("IHM Question2_1");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        enHaut.setBackground(Color.blue);
        setLocation(100,100);
        pack();show();
        
       
        
        but1 = new JButtonObserver("but1", contenu);
        but2 = new JButtonObserver("but2", contenu);
        but3 = new JButtonObserver("but3", contenu);
        
        boutonA.addActionListener(but1);
        boutonA.addActionListener(but2);
        boutonA.addActionListener(but3);
        
        boutonB.addActionListener(but1);
        boutonB.addActionListener(but2);
        
        boutonC.addActionListener(but1);
        
        
    }
    
    public static void main(String[] args){
        new IHMQuestion2_1();
    }

}
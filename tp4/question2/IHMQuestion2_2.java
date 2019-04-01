package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

    private JButtonObserver but1o;
    private JButtonObserver but2o;
    private JButtonObserver but3o;
    
    private JMouseObserver mo1;
    private JMouseObserver mo2;
    private JMouseObserver mo3;
 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        
         
        but1o = new JButtonObserver("but1o", contenu);
        but2o = new JButtonObserver("but2o", contenu);
        but3o = new JButtonObserver("but3o", contenu);
        
        boutonA.addActionListener(but1o);
        boutonA.addActionListener(but2o);
        boutonA.addActionListener(but3o);
        
        boutonB.addActionListener(but1o);
        boutonB.addActionListener(but2o);
        
        boutonC.addActionListener(but1o);
        
        mo1 = new JMouseObserver("mo1", contenu);
        mo2 = new JMouseObserver("mo2", contenu);
        mo3 = new JMouseObserver("mo3", contenu);

        boutonA.addMouseListener(mo1);
        boutonB.addMouseListener(mo2);
        boutonC.addMouseListener(mo3);
        
         
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
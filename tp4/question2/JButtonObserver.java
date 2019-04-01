package question2;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

 
public class JButtonObserver implements ActionListener{ 

    private String nom;
    private TextArea contenu;

   
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    
    public void actionPerformed(ActionEvent event) {
        String message = "ObS " + this.nom + ": " + "Click" + event.getActionCommand();
        contenu.append(message + "\n");
    }
   

}

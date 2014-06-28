/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pandora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;



/**
 *
 * @author dominikmocher
 */
public class Pandora extends JApplet {
    
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } 
                catch (Exception e) {
                  System.out.println("Error happened...");
                }
                
                //Setting a Main JFrame to display the RulesEditor Panel
                //TEMPORARY CODE
                Mainframe main = new Mainframe();
                main.setSize(800,600);

                
                Rules rules = new Rules();
                RulesEditor rulesPanel = new RulesEditor();
                
                main.getjTabbedPane1().add("Regeln", rulesPanel);
                main.validate();
                
//main.setMapEditor(mapPanel);
                //main.
                //main.setRulesEditor(rulesPanel);
                  
                //methods to display the RulesEditor Panel
                //TEMPORARY CODE
                //main.add(mainframe);
                main.setVisible(true);
                //implement validate
                //main.pack(); // delete because of validate
                
                /*
                JFrame frame = new JFrame("JavaFX 2 in Swing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JApplet applet = new Pandora();
                applet.init();
                
                frame.setContentPane(applet.getContentPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                applet.start();
                
                Rules rules = new Rules();
                RulesEditor rules_editor = new RulesEditor();
                
                */
            }
        });
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                createScene();
            }
        });
    }
    
    private void createScene() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        

                
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }
    
}

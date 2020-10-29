import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel; 

  JLabel hiPerson; 

  JTextField nameBox; 

  JButton sayHelloButton; 


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true); 

    //initalize the main panel 
    mainPanel = new JPanel(); 
    //diable layout helpers 
    mainPanel.setLayout(null);  

    //create text box for user 
    nameBox = new JTextField(); 

    //set location and size 
    nameBox.setBounds(225,70,350,20); 

    //initalize Button 
    sayHelloButton = new JButton("Say Hello"); 

    //set size and location of button 
    sayHelloButton.setBounds(225,150,100,25); 

    //add action listeners to the button 
    sayHelloButton.addActionListener(this); 

    //give the button an action command 
    sayHelloButton.setActionCommand("Say hello"); 

    //create Label to output answer to screen 
    hiPerson = new JLabel(); 

    //set size and location 
    hiPerson.setBounds(225,200,100,25); 


    //add label to window 
    mainPanel.add(hiPerson); 


    //add button to the window 
    mainPanel.add(sayHelloButton);  

    //add text field to the window 
    mainPanel.add(nameBox);

    //add panel to window 
    frame.add(mainPanel); 
 
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand(); 

    if(command.equals("Say hello")){
      //get the text from text box 
      String userName = nameBox.getText(); 
      //put the answer into the label 
      hiPerson.setText("Hello " + userName);  
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The main window for dealing from a deck of cards.
 *
 *
 */
public class MainView extends JFrame{

    private Deck deck;

    public MainView(Deck deck){
            this.deck = deck;
            JLabel p1 = new JLabel("Player 1");
            JLabel p2 = new JLabel("Game Status");
            JLabel p3 = new JLabel("Player 2");
            JPanel b1 = new JPanel();
            JPanel b2 = new JPanel();
            JPanel b3 = new JPanel();
            b1.add(p1);
            b2.add(p2);
            b3.add(p3);
            JPanel main = new JPanel(new GridLayout());
            JPanel top = new JPanel(new GridLayout());
            JPanel bottom = new JPanel();
            top.add(b1);
            top.add(b2);
            top.add(b3);
            JPanel status = new JPanel();
            status.setBackground(Color.WHITE);
            CardPanel c1 = new CardPanel();
            CardPanel c2 = new CardPanel();
            main.add(c1);
            main.add(status);
            main.add(c2);
            
            
            JButton button = new JButton("New Game");
            JButton button1 = new JButton("Move");
            bottom.add(button1);
            bottom.add(button);
            button1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (! deck.isEmpty()){
                        Card card = deck.deal();
                        card.turn();
                        c1.setCard(card);
                        c2.setCard(card);
                        
                    }
                }});
            Container c = getContentPane();
            
            c.add(top, BorderLayout.NORTH);
            c.add(main, BorderLayout.CENTER);
            c.add(bottom, BorderLayout.SOUTH);
        }
    	   /*
    	    * Setup of various frame components
    	    */
//    	   this.setTitle("The Game of War");
//    	   JPanel l1 = new JPanel();
//    	   JPanel l2 = new JPanel();
//    	   JPanel l3 = new JPanel();
//    	   JPanel l4 = new JPanel();
//    	   CardPanel c1 = new CardPanel();
//    	   CardPanel c2 = new CardPanel();
//    	   JPanel statusp = new JPanel();
//    	   statusp.setBackground(Color.WHITE);
//    	   JLabel player1 = new JLabel("Player 1");
//    	   JLabel player2 = new JLabel("Player 2");
//    	   JLabel status = new JLabel("Game Status");
//    	   /*
//    	    * Configuration of the two buttons 
//    	    */
//    	   JButton button = new JButton("Move");
//    	   JButton button2 = new JButton("New Game");
//       button.addActionListener(new ActionListener(){
//    	       public void actionPerformed(ActionEvent e){
//    	    	       if (! deck.isEmpty()){
//    	    	    	       Card card = deck.deal();
//                   card.turn();
//                   c1.setCard(card);
//                   c2.setCard(card);
//                   }
//               }});
//    	   /*
//    	    * Addition of components to panels
//    	    */
//    	   l1.add(player1);
//    	   l2.add(status);
//    	   l3.add(player2);
//    	   l4.add(button);
//    	   l4.add(button2);
//    	   
//    	   /*
//    	    * Layout Setup
//    	    */
//    	   GridBagLayout layout = new GridBagLayout();
//    	   GridBagConstraints constraints = new GridBagConstraints();
//    	   Container c = getContentPane();
//    	   c.setLayout(layout);
//    	   /*
//    	    * "Player 1" Label Setup
//    	    */
//    	   constraints.gridx = 0;
//    	   constraints.gridy = 0;
//    	   layout.setConstraints(l1, constraints);
//    	   c.add(l1);
//    	   /*
//    	    * "Game Status" Label Setup
//    	    */
//    	   constraints.gridx = 1;
//    	   constraints.gridy = 0;
//    	   layout.setConstraints(l2, constraints);
//    	   c.add(l2);
//    	   /*
//    	    * "Player 2" Label Setup
//    	    */
//    	   constraints.gridx = 2;
//    	   constraints.gridy = 0;
//    	   layout.setConstraints(l3, constraints);
//    	   c.add(l3);
//    	   /*
//    	    * Card Panel 1 Setup
//    	    */
//    	   constraints.gridx = 0;
//    	   constraints.gridy = 1;
//    	   constraints.fill = GridBagConstraints.BOTH;
//    	   constraints.weighty = 1;
//    	   constraints.weightx = 1.0;
//    	   layout.setConstraints(c1, constraints);
//    	   c.add(c1);
//    	   /*
//    	    * Game Status Panel Setup
//    	    */
//    	   constraints.gridx = 1;
//    	   constraints.gridy = 1;
//    	   constraints.fill = GridBagConstraints.BOTH;
//    	   constraints.weighty = 1;
//    	   constraints.weightx = 1.0;
//    	   layout.setConstraints(statusp, constraints);
//    	   c.add(statusp);
//    	   /*
//    	    * Card Panel 2 Setup
//    	    */
//    	   constraints.gridx = 2;
//    	   constraints.gridy = 1;
//    	   constraints.fill = GridBagConstraints.BOTH;
//    	   constraints.weighty = 1;
//    	   constraints.weightx = 1.0; 	
//    	   layout.setConstraints(c2, constraints);
//    	   c.add(c2);
//    	   /*
//    	    * Button Panel Setup
//    	    */
//    	   constraints.gridx = 0;
//    	   constraints.gridy = 2;
//    	   constraints.gridwidth = 3;
//    	   constraints.weighty = 0.0;
//    	   layout.setConstraints(l4, constraints);
//    	   c.add(l4);
        
        
        
    }

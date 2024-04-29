import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends Army implements ActionListener,KeyListener
{
    
    JFrame frame;
    JPanel panel;
    JTextField text,textArmySize;
    JButton TBut,ZBut,RBut,MBut,BatBut;

    public GUI()
    {

        defineArmies();

        
        frame = new JFrame("Battle of ALO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setResizable(false);
        frame.setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        

        panel=new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0,0,800,800);
        panel.setLayout(new BorderLayout());



        TBut=new JButton("TMM");
        TBut.addActionListener(this);
        TBut.setLocation(90, 500);
        TBut.setSize(100,50);
        TBut.setFont(new Font("Algiers",Font.CENTER_BASELINE,15));
        TBut.setOpaque(false);
        TBut.setContentAreaFilled(false);
        TBut.setForeground(Color.WHITE);


        ZBut=new JButton("ZS5Z");
        ZBut.addActionListener(this);
        ZBut.setLocation(240, 500);
        ZBut.setSize(100, 50);
        ZBut.setFont(new Font("Algiers",Font.CENTER_BASELINE,15));
        ZBut.setOpaque(false);
        ZBut.setContentAreaFilled(false);
        ZBut.setForeground(Color.WHITE);


        RBut=new JButton("Ramphashats");
        RBut.addActionListener(this);
        RBut.setLocation(390, 500);
        RBut.setSize(200, 50);
        RBut.setFont(new Font("Algiers",Font.CENTER_BASELINE,15));
        RBut.setOpaque(false);
        RBut.setContentAreaFilled(false);
        RBut.setForeground(Color.WHITE);


        MBut=new JButton("MGang");
        MBut.addActionListener(this);
        MBut.setLocation(640, 500);
        MBut.setSize(100, 50);
        MBut.setFont(new Font("Algiers",Font.CENTER_BASELINE,15));
        MBut.setOpaque(false);
        MBut.setContentAreaFilled(false);
        MBut.setForeground(Color.WHITE);

        BatBut=new JButton("Deploy army");
        BatBut.addActionListener(this);
        BatBut.setLocation(290,600);
        BatBut.setSize(200, 50);
        BatBut.setFont(new Font("Ariel",Font.CENTER_BASELINE,20));
        BatBut.setVisible(false);
        BatBut.setOpaque(false);
        BatBut.setContentAreaFilled(false);
        BatBut.setForeground(Color.WHITE);


        text=new JTextField();
        text.setFont(new Font("Times New Roman",Font.BOLD,25));
        text.setEditable(false);
        text.setOpaque(false);
        text.setForeground(Color.WHITE);
        text.setHorizontalAlignment(JTextField.CENTER);

        textArmySize=new JTextField();
        textArmySize.setFont(new Font("Times New Roman",Font.BOLD,25));
        textArmySize.setEditable(false);
        textArmySize.setOpaque(false);
        textArmySize.setForeground(Color.WHITE);
        textArmySize.setHorizontalAlignment(JTextField.CENTER);
        textArmySize.addKeyListener(this);

        panel.add(TBut);
        panel.add(ZBut);
        panel.add(RBut);
        panel.add(MBut);
        panel.add(BatBut);
        panel.add(text, BorderLayout.CENTER);
        panel.add(textArmySize, BorderLayout.SOUTH);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        text.setText("Choose your Faction");
        
    }




    public void endGame()
    {
        stats();
        if(size>5000)
        {
            text.setText("ENEMY WON!!!!!! "+" YOUR ARMY LOST DUE TO LACK OF COOPERATION!!!!!!");
        }

        else if(UserHealth==EnemyHealth)
        {
            text.setText("DRAW!!!!! "+" NO CLEAR WINNER EMERGED!!!!!");
        }

        else 
        {
            text.setText((UserHealth>EnemyHealth?"YOU":"ENEMY")+" WON!!!!!!!!");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==TBut)
        {
            choice=1;
        }
        if(e.getSource()==ZBut)
        {
            choice=2;
        }
        if(e.getSource()==RBut)
        {
            choice=3;
        }
        if(e.getSource()==MBut)
        {
            choice=4;
        }


        panel.remove(TBut);
        panel.remove(ZBut);
        panel.remove(RBut);
        panel.remove(MBut);

        
        text.setText("Enter your army size");

        textArmySize.setEditable(true);
        textArmySize.requestFocus();

        if(e.getSource()==BatBut)
        {
            delay();

            panel.remove(BatBut);
            panel.revalidate();
            panel.repaint();
            endGame();
        }
    }
    
    public void keyPressed(KeyEvent f)
    {
        if (f.getKeyCode() == KeyEvent.VK_ENTER) 
        {
            size=Integer.parseInt(textArmySize.getText());
            text.setText("Your Opponent is "+Enemy+" .  Your army is ready to fight!!");
            BatBut.setVisible(true);
            panel.remove(textArmySize);
        }
    }
            

    public void keyTyped(KeyEvent g) {
        

    }

    public void keyReleased(KeyEvent h) {
        

    }
}
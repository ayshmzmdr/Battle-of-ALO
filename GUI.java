import java.awt.*;

import javax.swing.*;
public class GUI extends Army
{
    
    JFrame frame;
    JPanel panel;
    JTextField text;

    public GUI()
    {
        frame=new JFrame("Battle of ALO");
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

        text=new JTextField();
        text.setFont(new Font("Times New Roman",Font.BOLD,25));
        text.setEditable(false);
        text.setOpaque(false);
        text.setForeground(Color.WHITE);
        text.setHorizontalAlignment(JTextField.CENTER);

        panel.add(text, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);


        UserHealth=UserDef-EnemyAtt;
        EnemyHealth=EnemyDef-UserAtt;


        text.setText("TAKING POSITION");
        for(int i=0;i<5;i++)
        {
            delay();
            text.setText(text.getText()+".");
        }


        

        text.setText("DESTROYING ENEMY FLANKS");
        for(int i=0;i<5;i++)
        {
            delay();
            text.setText(text.getText()+".");
        }


       

        text.setText("DESTROYING ENEMY SUPPORT VEHICLES");
        for(int i=0;i<5;i++)
        {
            delay();
            text.setText(text.getText()+".");
        }

       
        
        text.setText("DESTROYING THE FINAL WAVE");
        for(int i=0;i<5;i++)
        {
            delay();
            text.setText(text.getText()+".");
        }

       

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
}
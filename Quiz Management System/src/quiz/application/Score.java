package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    JButton submit, exit;

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 200);
        add(image);
        
        
        JLabel heading = new JLabel("Thank You " + name + " for participating in Quiz Competition");
        heading.setBounds(20, 50, 1000, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
        heading.setForeground(new Color(255, 000, 000));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(400, 200, 300, 30);
        lblscore.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
        lblscore.setForeground(new Color(255, 000, 000));
        add(lblscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(340, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        exit = new JButton("Exit");
        exit.setBounds(500, 270, 120, 30);
        exit.setBackground(new Color(255, 000, 000));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setLocation(300, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
    
    if (ae.getSource() == submit) {
            setVisible(false);
            new Login();
        } else {
            setVisible(false);
        }
}
    public static void main(String[] args) {
        new Score("", 0);
    }
}

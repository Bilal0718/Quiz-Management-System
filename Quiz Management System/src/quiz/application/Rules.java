package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Competition");
        heading.setBounds(20, 30, 1000, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
           "<html>"+ "<strong>"+
                "1. Participants must answer all the questions presented to them." + "<br><br>" +
                "2. Participants must answer the questions individually without seeking help or discussing with others. Collaboration or sharing answers is strictly prohibited." + "<br><br>" +
                "3. Participants should concentrate on answering the questions and avoid distractions from others. Do not engage in unnecessary interactions or distractions during the quiz." + "<br><br>" +
                "4. Think carefully before answering each question and provide the most accurate response. Avoid guessing or random answers. Only answer if you are reasonably confident in your knowledge." + "<br><br>" +
                "5. Be prepared for challenging questions. The quiz game may include difficult or tricky questions to test your knowledge and problem-solving abilities." + "<br><br>" +
            "<html>"
        );
        rules.setForeground(new Color(255, 000, 000));
        add(rules);
        
        JLabel lblscore = new JLabel("🙂 Good Luck 🙂");
        lblscore.setBounds(275, 410, 300, 85);
        lblscore.setFont(new Font("Tahome", Font.BOLD, 26));
        lblscore.setForeground(new Color(255, 255, 0));
        add(lblscore);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(255, 000, 000));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("");
    }
}

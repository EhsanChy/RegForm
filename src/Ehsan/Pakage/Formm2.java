package Ehsan.Pakage;
import java.awt.*;
import javax.swing.*;
public class Formm2 extends JFrame{
    public Formm2(){
        setSize(550,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,5,500,60);
        panel1.setBackground(new Color(59, 255, 0));

        JLabel headerTxt = new JLabel("Registration Form");
        headerTxt.setFont(new Font("Times New Roman",Font.BOLD,25));
        panel1.add(headerTxt);

        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0,70,500,425);
        inputPanel.setBackground(new Color(15, 15, 73, 255));
        inputPanel.setLayout(null);

        Font labelFont = new Font("Arial",Font.ROMAN_BASELINE,20);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(130,10,100,25);
        nameLabel.setFont(labelFont);
        inputPanel.add(nameLabel);
        nameLabel.setForeground(Color.cyan);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200,10,200,25);
        inputPanel.add(nameTxt);
        nameTxt.setBackground(new Color(96, 96, 96));
        nameTxt.setForeground(new Color(106, 226, 253));

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(130,50,100,25);
        emailLabel.setFont(labelFont);
        inputPanel.add(emailLabel);
        emailLabel.setForeground(Color.cyan);

        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(200,50,200,25);
        inputPanel.add(emailTxt);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(90,90,100,25);
        passwordLabel.setFont(labelFont);
        inputPanel.add(passwordLabel);
        passwordLabel.setForeground(Color.cyan);

        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(200,90,200,25);
        inputPanel.add(passwordTxt);

        JLabel conpassLabel = new JLabel("   Confirm Password:");
        conpassLabel.setBounds(20,130,180,25);
        conpassLabel.setFont(labelFont);
        inputPanel.add(conpassLabel);
        conpassLabel.setForeground(Color.cyan);

        JTextField conpassTxt = new JTextField();
        conpassTxt.setBounds(200,130,200,25);
        inputPanel.add(conpassTxt);

        JLabel mobileLabel = new JLabel("Mobile: ");
        mobileLabel.setBounds(125,170,100,25);
        mobileLabel.setFont(labelFont);
        inputPanel.add(mobileLabel);
        mobileLabel.setForeground(Color.cyan);

        JTextField mobileTxt = new JTextField();
        mobileTxt.setBounds(200,170,200,25);
        inputPanel.add(mobileTxt);

        JLabel addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(115,210,100,25);
        addressLabel.setFont(labelFont);
        inputPanel.add(addressLabel);
        addressLabel.setForeground(Color.cyan);

        JTextField addressTxt = new JTextField();
        addressTxt.setBounds(200,210,200,25);
        inputPanel.add(addressTxt);

        JLabel clickLabel = new JLabel("Click Register Button: ");
        clickLabel.setBounds(80,290,210,25);
        clickLabel.setFont(labelFont);
        clickLabel.setForeground(Color.cyan);
        inputPanel.add(clickLabel);

        Cursor cr = new Cursor(Cursor.HAND_CURSOR);

        JButton logingButton = new JButton("Register");
        logingButton.setBounds(300,285,100,35);
        logingButton.setBackground(new Color(152,116,86));
        logingButton.setCursor(cr);
        inputPanel.add(logingButton);

        add(panel1);
        add(inputPanel);
    }

    public static void main(String[] args) {
        Formm2 ee = new Formm2();
    }
}

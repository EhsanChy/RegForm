package Ehsan.Pakage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegisterForm extends JFrame{
    public RegisterForm(){
        setSize(500,440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        JPanel headerPanel = new JPanel();
        headerPanel.setBounds(0,5,500,60);
        headerPanel.setBackground(Color.magenta);

        JLabel headerTxt = new JLabel("Registration Form");
        headerTxt.setFont(new Font("Arial",Font.BOLD,30));
        headerPanel.add(headerTxt);

        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0,70,500,425);
        inputPanel.setBackground(new Color(169,213,37));
        inputPanel.setLayout(null);

        Font labelFont = new Font("Arial",Font.BOLD,18);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(130,10,100,25);
        nameLabel.setFont(labelFont);
        inputPanel.add(nameLabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200,10,200,25);
        inputPanel.add(nameTxt);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(130,50,100,25);
        emailLabel.setFont(labelFont);
        inputPanel.add(emailLabel);

        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(200,50,200,25);
        inputPanel.add(emailTxt);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(90,90,100,25);
        passwordLabel.setFont(labelFont);
        inputPanel.add(passwordLabel);

        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(200,90,200,25);
        inputPanel.add(passwordTxt);

        JLabel conpassLabel = new JLabel("Confirm Password: ");
        conpassLabel.setBounds(20,130,180,25);
        conpassLabel.setFont(labelFont);
        inputPanel.add(conpassLabel);

        JTextField conpassTxt = new JTextField();
        conpassTxt.setBounds(200,130,200,25);
        inputPanel.add(conpassTxt);

        JLabel mobileLabel = new JLabel("Mobile: ");
        mobileLabel.setBounds(125,170,100,25);
        mobileLabel.setFont(labelFont);
        inputPanel.add(mobileLabel);

        JTextField mobileTxt = new JTextField();
        mobileTxt.setBounds(200,170,200,25);
        inputPanel.add(mobileTxt);

        JLabel addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(115,210,100,25);
        addressLabel.setFont(labelFont);
        inputPanel.add(addressLabel);

        JTextField addressTxt = new JTextField();
        addressTxt.setBounds(200,210,200,25);
        inputPanel.add(addressTxt);

        JLabel clickLabel = new JLabel("Click Register Button: ");
        clickLabel.setBounds(80,290,210,25);
        clickLabel.setFont(labelFont);
        inputPanel.add(clickLabel);

        JButton logingButton = new JButton("Register");
        logingButton.setBounds(300,285,100,35);
        logingButton.setBackground(Color.pink);
        inputPanel.add(logingButton);
        setVisible(true);

        logingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nameTxt.getText();
                String email = emailTxt.getText();
                String pass = passwordTxt.getText();
                String conPass = passwordTxt.getText();
                String mobile = passwordTxt.getText();
                String address = addressTxt.getText();

                try {
                    DbConnect db = new DbConnect();
                    String queryInsert= "INSERT INTO `ehsan`(`Name`, `E-Mail`, `Password`, `Mobile`, `Address`) VALUES ('" + userName + "','" + email + "','" + pass + "','" + mobile + "','" + address + "')";
                    db.RegisterInsert(queryInsert);
                }catch (Exception e2){

                }
            }
        });

        add(headerPanel);
        add(inputPanel);
    }
}
package GUI;

import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {
    private JLabel login, user, pwd;
    private JTextField username;
    private JPasswordField password;

    public SwingFrame(){
        setSize(400,500);
        setLayout(null);
        component();
        component1();
    }
    private void component(){
        login = new JLabel("LOGIN");
        String name = "serif";
        int style = Font.BOLD;
        int size = 24;
        int x = 150; int y = 80;
        int width = 400; int height = 35;
        login.setBounds(x,y,width,height);
        Font font = new Font(name, style, size);
        login.setFont(font);
        add(login);
    }
    private void component1(){
        username = new JTextField("Masukkan Username...");
        username.setBounds(100,180,200,35);
        password = new JPasswordField();
        password.setBounds(100, 280,200,35);
        add(username);
        add(password);
    }
    public static void main(String[] args){
        SwingFrame sf = new SwingFrame();
        sf.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {

    public void makeSwing() {
         final JFrame window = new JFrame("Welcome");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(Color.white);
        window.setLayout(new GridBagLayout());

         JLabel loginLabel = new JLabel("Input login:");
        JLabel passLabel = new JLabel("Input password:");

        JButton okButton = new JButton();
        okButton.setIcon(new ImageIcon(getClass().getResource("/image/okbutton.png")));

         final JTextField loginTextField = new JTextField(10);
         final JPasswordField passwordField = new JPasswordField(4);


        window.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(passLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(loginTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(okButton, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.pack();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Swing2 s2 = new Swing2();
                char[] p = passwordField.getPassword();
                String pass=String.valueOf(p);
                if(s2.getName().equals(loginTextField.getText()) && s2.getPassword().equals(pass) ){
                    window.setVisible(false);
                    s2.makeSwing();
                }
            }
        });

    }



}

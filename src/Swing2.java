import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 {
    private String name="Sergey";
    private String password="1111";


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void makeSwing() {
        JFrame window = new JFrame("Welcome "+getName());
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(Color.white);
        window.setLocationRelativeTo(null);
        window.setLayout(new GridBagLayout());

         JLabel balanceLabel = new JLabel("Balance:");
        JLabel actionLabel = new JLabel("Action:");

        JButton addButton = new JButton("Add");
        JButton resButton = new JButton("Res");

         final JTextField balance = new JTextField("500",6);
         final JTextField action=new JTextField(4);
        balance.setEditable(false);

        window.add(balanceLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(actionLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(balance, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(action, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(addButton, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        window.add(resButton, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.pack();
        window.setVisible(true);

    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int bal = Integer.parseInt(balance.getText());
            int act = Integer.parseInt(action.getText());
            bal+=act;
            balance.setText(""+bal);
        }
    });

resButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int bal = Integer.parseInt(balance.getText());
        int act = Integer.parseInt(action.getText());
        bal-=act;
        balance.setText(""+bal);
    }
});


    }

}

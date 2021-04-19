import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome_page {
    private JButton booksButton;
    private JButton audioBooksButton;
    private JButton imagesButton;
    private JButton videosButton;
    private JPanel panel;


    public welcome_page() {

        booksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new welcome_page().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

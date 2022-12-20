package lab5.number13.number14;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class classs {
    public static void main(String args[]) {
        String[] strings = new String[1];
        strings[0] = "C:\\Users\\GANSOR\\Downloads\\maxresdefault (4).png";

        Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));

        JPanel mainPanel = new JPanel();


        mainPanel.add(jLabel);

        JFrame frame = new JFrame("Меню");
        frame.setPreferredSize(new Dimension(1280,720));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        JPanel panel= new JPanel();
        JPanel panel2= new JPanel();
        JButton button1 = new JButton("Красная");
        JButton button2 = new JButton("Синяя");
        panel.setBorder( new EmptyBorder(302, 80, 100, 500) );
        button1.setPreferredSize( new Dimension(100, 45) );
        panel.add(button1);
        frame.getContentPane().add(panel);
        frame.pack();
        button2.setPreferredSize( new Dimension(100, 45) );
        panel2.setBorder( new EmptyBorder(328, 400, 140, 20) );
        panel2.add(button2);
        frame.getContentPane().add(panel2);
        frame.pack();
        frame.setVisible(true);
        ActionListener Listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] strings = new String[1];
                strings[0] = "C:\\Users\\GANSOR\\Downloads\\rick-roll-rick-ashley (1).gif";

                Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
                JLabel jLabel = new JLabel(new ImageIcon(bgImage));

                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BorderLayout());
                mainPanel.add(jLabel);
                JFrame frame = new JFrame("Never Gonna Give You Up");
                frame.setPreferredSize(new Dimension(557, 677));
                frame.add(mainPanel, BorderLayout.CENTER);

                frame.setVisible(true);

            }
        };
        ActionListener Listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] strings = new String[1];
                strings[0] = "C:\\Users\\GANSOR\\Downloads\\Russkiy_krol (1).gif";

                Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
                JLabel jLabel = new JLabel(new ImageIcon(bgImage));
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BorderLayout());
                mainPanel.add(jLabel);
                JFrame frame = new JFrame("Russian kroll");
                frame.setPreferredSize(new Dimension(256, 279));
                frame.add(mainPanel, BorderLayout.CENTER);
                frame.pack();
                frame.setVisible(true);

            }
        };
        button1.addActionListener(Listener2);
        button2.addActionListener(Listener1);
    }
}

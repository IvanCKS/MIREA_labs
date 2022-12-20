package soft;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Start {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Тест");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder( new EmptyBorder(289, 480, 800, 500) );
        panel.setPreferredSize( new Dimension(1280,720));
        Font BigFontTR = new Font("TimesRoman", Font.BOLD, 40);
        JButton button1 = new JButton(" СТАРТ");
        button1.setContentAreaFilled(false);
        button1.setFont(BigFontTR);
        button1.setPreferredSize( new Dimension(200, 100) );
        panel.add(button1);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.pack();
        ActionListener Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(button1);
                Container container = frame.getContentPane();
                JPanel imagePanel = new JPanel();
                JPanel buttonPanel = new JPanel();
                JPanel buttonPanel2 = new JPanel();
                JPanel buttonPanel3 = new JPanel();
                buttonPanel.setOpaque(false);
                buttonPanel2.setOpaque(false);
                buttonPanel3.setOpaque(false);
                JPanel overlayPanel = new JPanel();
                LayoutManager overlay = new OverlayLayout(overlayPanel);
                overlayPanel.setLayout(overlay);
                imagePanel.add(getImage());
                JButton button = getButton();
                JButton button2 = getButton2();
                JButton button3 = getButton3();
                buttonPanel.add(button);
                buttonPanel2.add(button2);
                buttonPanel3.add(button3);
                buttonPanel.setBorder(new EmptyBorder(300, 100, 100, 40));
                buttonPanel2.setBorder(new EmptyBorder(360, 100, 100, 40));
                buttonPanel3.setBorder(new EmptyBorder(420, 100, 100, 40));
                overlayPanel.add(buttonPanel);
                overlayPanel.add(buttonPanel2);
                overlayPanel.add(buttonPanel3);
                overlayPanel.add(imagePanel);
                container.add(overlayPanel);
                frame.setVisible(true);

            }
            private JButton getButton() {

                Font BigFontTR3 = new Font("TimesRoman", Font.BOLD, 40);
                JButton button4 = new JButton("НАЧАЛО");
                button4.setFont(BigFontTR3);
                button4.setPreferredSize(new Dimension(500, 50));
                return button4;
            }
            private JButton getButton2() {
                Font BigFontTR3 = new Font("TimesRoman", Font.BOLD, 40);
                JButton button4 = new JButton("НАСТРОЙКИ");
                button4.setFont(BigFontTR3);
                button4.setPreferredSize(new Dimension(500, 50));
                return button4;
            }
            private JButton getButton3() {
                Font BigFontTR3 = new Font("TimesRoman", Font.BOLD, 40);
                JButton button4 = new JButton("ВЫХОД");
                button4.setFont(BigFontTR3);
                button4.setPreferredSize(new Dimension(500, 50));
                return button4;
            }

            private JLabel getImage() {
                Image bgImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\GANSOR\\Downloads\\4a996f52167099.590792faf158c.png");
                return new JLabel(new ImageIcon(bgImage));
            }
        };


        button1.addActionListener(Listener);
        frame.setResizable(false);
    }
}
//package soft;
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//public class ButStart {
//    public static void main(String[] args){
//
//        Menu program = new Menu();
//        SwingUtilities.invokeLater(program);
//
//    }
//
//
//    public void run() {
//
//        JFrame frame = new JFrame () ;
//        Get_size get_size = new Get_size() ;
//        get_size.Size_screen() ;
//        int h = (int)height ;
//        int w = (int) width;
//        frame.setSize(w , h );
//
//        JPanel panel = new JPanel();
//
//        //Create the first  button
//        JButton appointment = new JButton("Appointment menu & Diary");
//        appointment.setPreferredSize(new Dimension(500,32));
//        appointment.setFont(new Font("Algerian", Font.PLAIN , 24));
//        panel.add(appointment) ;
//
//        //Create the second  button
//        JButton patient_profile = new JButton("Patient Profile");
//        patient_profile.setPreferredSize(new Dimension(300, 32));
//        patient_profile.setFont(new Font("Algerian", Font.PLAIN , 24));
//        panel.add(patient_profile) ;
//
//
//        JPanel over = new JPanel();
//        LayoutManager overlay = new OverlayLayout(over);
//        over.setLayout(overlay);
//
//        JPanel imagen1 = new JPanel();
//        ImageIcon image = new ImageIcon("menu.jpg") ;
//
//
//
//        imagen1.add(new JLabel(image));
//
//        over.add(imagen1);
//        over.add(panel);
//        frame.add(over);
//
//
//
//        //sets the size of the frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //makes it so you can close
//        frame.setVisible(true);
//
//        // Set the frame of the size non-resizable
//        frame.setResizable(false);
//    }
//
//}

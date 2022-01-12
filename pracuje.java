import javax.swing.*;
import java.awt.event.ActionEvent;

public class pracuje {
    JFrame frame;
    JLabel pracuje;
    JButton exit;
    pracuje()
    {
        frame=new JFrame();
        pracuje=new JLabel("Pracuje");
        pracuje.setBounds(0,0,100,40);
        frame.add(pracuje);
        exit=new JButton("Ok");
        exit.setBounds(25,50,50,20);
        frame.add(exit);
        exit.addActionListener(ActionEvent->{frame.dispose();});
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

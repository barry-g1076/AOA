package RecommendDegreesOfFreedom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RDF extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JFrame f = new JFrame("Recomend Degrees of Freedom");//creating instance of JFrame

        JButton b1=new JButton("Launch Recommendation System");//creating instance of JButton
        JButton b2=new JButton("Calculate Degrees of Separation");//creating instance of JButton
        JButton b3=new JButton("Calculate Average Degree of Separation");
        JLabel rdflabel = new JLabel("Recommendation System and Degrees Of Separation Calculator");
        JLabel name1 = new JLabel("Person 1:");
        JLabel name2 = new JLabel("Person 2:");
        JTextField nameX = new JTextField("");
        nameX.addActionListener(e -> {
            String nameXText = nameX.getText();
            System.out.println(nameXText);
        });
        JTextField nameY = new JTextField("");
        nameY.addActionListener(e -> {
            String nameYText = nameY.getText();
            System.out.println(nameYText);
        });


        ActionListener b1Listener = e -> {
            InfoReader inforead = new InfoReader();
            inforead.ReadInfo();
            System.out.println("Loaded info actionPerformed");
        };
        b1.setBounds(150,100,300, 60);//x axis, y axis, width, height
        b1.addActionListener(b1Listener);
        ActionListener b2Listner = e -> System.out.println("DOS Button clicked");
        b2.setBounds(150,280,300, 30);//x axis, y axis
        b2.addActionListener(b2Listner);
        b3.setBounds(150,380,300, 60);//x axis, y axis
        ActionListener b3Listener = e -> System.out.println("ADOS Button clicked");
        b3.addActionListener(b3Listener);


        rdflabel.setBounds(100,10,400,30);
        name1.setBounds(60,240,75,30);
        name2.setBounds(360,240,75,30);
        nameX.setBounds(120,240,100,30);
        nameY.setBounds(420,240,100,30);

        f.setResizable(false);

        f.add(b1);//adding button in JFrame
        f.add(b2);//adding button in JFrame
        f.add(b3);//adding button in JFrame

        f.add(rdflabel);//adding
        f.add(name1);
        f.add(name2);
        f.add(nameX);
        f.add(nameY);

        f.setLayout(null);//using no layout managers
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);//400 width and 500 height
        f.setVisible(true);//making the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

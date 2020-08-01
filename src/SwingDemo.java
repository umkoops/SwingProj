import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("A Ssimple swing Program");
        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Swing powers the modern Java Gui.");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}

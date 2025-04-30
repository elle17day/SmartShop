import javax.swing.JOptionPane;

public class reportFeedback extends JOptionPane {
    private static final long serialVersionUID = 1206896304408616778L;
    

    reportFeedback() {
        JOptionPane.showMessageDialog(null, "Report successfully created!", "Report Created", JOptionPane.INFORMATION_MESSAGE);
    }
}
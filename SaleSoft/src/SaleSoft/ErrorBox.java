import javax.swing.JOptionPane;

public class ErrorBox extends JOptionPane {
	private static final long serialVersionUID = -6232326267230593258L;
	
	ErrorBox() {
		JOptionPane.showMessageDialog(null, "Error with last request please retry.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
	}
}
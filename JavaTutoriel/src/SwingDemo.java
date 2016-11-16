import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SwingDemo {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setName("Fita Tech");
		jf.setTitle("Fita Tech");;
		jf.setSize(400, 200);
		JPanel jp = new JPanel();
		JButton jbutton = new JButton("Click Me");
		jbutton.setSize(50, 35);
	
		Container c = jf.getContentPane();
		c.add(jp);
		jf.setVisible(true);
		
	}

}

import java.awt.Button;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame {
	
	private static Button button;
	private static Board b;
	
	public static void main(String[] args) throws IOException {
		
		b = new Board();
		
		JFrame frame = new JFrame();
		frame.setTitle("Platformer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(544, 388);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		button = new Button("Play");
		
		JLabel contentPane = new JLabel();
		contentPane.setLayout(new GridBagLayout());
		contentPane.setIcon(b.returnIcon());
		contentPane.add(button);
		frame.setContentPane(contentPane);
		
		frame.setVisible(true);
		
	}
	
}

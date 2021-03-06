import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class Frame implements ActionListener
{
	private static Button button;
	private static Board b;
	private static JFrame frame;
	private static JLabel contentPane;
	
	public static void main(String[] args) throws IOException
	{
		b = new Board("/asset/title.png");
		
		frame = new JFrame();
		frame.setTitle("Platformer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1088, 740);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		Dimension gbc = new Dimension(200, 100);
		
		button = new Button("Play");
		button.setPreferredSize(gbc);
		button.setFont(new Font("Roboto", Font.BOLD, 40));
		
		contentPane = new JLabel();
		contentPane.setLayout(new GridBagLayout());
		contentPane.setIcon(b.returnIcon());
		contentPane.add(button);
		frame.setContentPane(contentPane);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.setVisible(false);
				FrameTest f = new FrameTest();
			}
		});
		
		contentPane = new JLabel();
		contentPane.setLayout(new GridBagLayout());
		contentPane.setIcon(b.returnIcon());
		contentPane.add(button);
		frame.setContentPane(contentPane);
		
		frame.setVisible(true);
	}
	
}
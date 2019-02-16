package memeYourProfessor;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class GUI_run {

	public static void main(String[] args) throws IOException {
		//This will be where we launch the GUI
		
		//here's a test comment
		//abigail's test
		//imported test

			JFrame main_frame = new JFrame();
			main_frame.setTitle("Meme Your Professor");
			main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel top_panel = new JPanel();
			top_panel.setLayout(new BorderLayout());
			//ImageIcon kris = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
			//JLabel view = new JLabel(kris);
			//top_panel.add(view, BorderLayout.CENTER);
			GUI_view memeWidget = new GUI_view();
			top_panel.add(memeWidget);
			main_frame.setContentPane(top_panel);

			main_frame.pack();
			main_frame.setVisible(true);
	}

}

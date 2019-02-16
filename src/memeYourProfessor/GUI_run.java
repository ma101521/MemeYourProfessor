package memeYourProfessor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_run {

	public static void main(String[] args) {
		//This will be where we launch the GUI

			JFrame main_frame = new JFrame();
			main_frame.setTitle("Meme Your Professor");
			main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel top_panel = new JPanel();
			top_panel.setLayout(new BorderLayout());
			//top_panel.add(view, BorderLayout.CENTER);
			main_frame.setContentPane(top_panel);

			main_frame.pack();
			main_frame.setVisible(true);
	}

}

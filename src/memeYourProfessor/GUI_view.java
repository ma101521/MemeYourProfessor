package memeYourProfessor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI_view extends JPanel implements ChangeListener{

	public GUI_view() throws IOException {
		
		setLayout(new BorderLayout());
		
		JPanel thumbnails = new JPanel();
		thumbnails.setLayout(new GridLayout(4, 2));
		thumbnails.setPreferredSize(new Dimension(400, 400));
		
		
		ImageIcon image1 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb1 = new JLabel(image1);
		thumbnails.add(thumb1);
		
		ImageIcon image2 = new ImageIcon(new URL("https://csdl-images.computer.org/mags/mu/2007/03/figures/u3012a2.gif"));
		JLabel thumb2 = new JLabel(image2);
		thumbnails.add(thumb2);
		
		ImageIcon image3 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb3 = new JLabel(image3);
		thumbnails.add(thumb3);
		
		ImageIcon image4 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb4 = new JLabel(image4);
		thumbnails.add(thumb4);
		
		ImageIcon image5 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb5 = new JLabel(image5);
		thumbnails.add(thumb5);
		
		ImageIcon image6 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb6 = new JLabel(image6);
		thumbnails.add(thumb6);
		
		ImageIcon image7 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb7 = new JLabel(image7);
		thumbnails.add(thumb7);
		
		ImageIcon image8 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb8 = new JLabel(image8);
		thumbnails.add(thumb8);
		
		
		
		
		JPanel full_image = new JPanel();
		full_image.setPreferredSize(new Dimension(400, 400));
		full_image.setLayout(new BorderLayout());
		ImageIcon main_image = new ImageIcon(new URL("https://csdl-images.computer.org/mags/mu/2007/03/figures/u3012a2.gif"));
		JLabel main = new JLabel(main_image);
		full_image.add(main, BorderLayout.CENTER);
		
		
		
		
		JPanel meme_options = new JPanel();
		meme_options.setLayout(new BorderLayout());
		JLabel scenarios = new JLabel("Meme Scenarios");
		meme_options.add(scenarios, BorderLayout.CENTER);
		String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};
		JComboBox dropdown = new JComboBox(options);
		dropdown.setPreferredSize(new Dimension(400, 40));
		meme_options.add(dropdown, BorderLayout.EAST);
		
		
		add(thumbnails, BorderLayout.WEST);
		add(full_image, BorderLayout.EAST);
		add(meme_options, BorderLayout.SOUTH);
		
		
		
		
		
	}
}

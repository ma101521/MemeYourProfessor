package memeYourProfessor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
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
//hi

public class GUI_view extends JPanel implements MouseListener{
	
	private JPanel full_image;

	public GUI_view() throws IOException {
		
		//Marisa's comment  
		
		setLayout(new BorderLayout());
		
		JPanel thumbnails = new JPanel();
		thumbnails.setLayout(new GridLayout(4, 2));
		thumbnails.setPreferredSize(new Dimension(400, 500));
		
		
		JPanel panel1 = new JPanel(new BorderLayout());
		ImageIcon image1 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb1 = new JLabel(image1);
		JLabel caption1 = new JLabel("Kris Jordan - Comp Sci");
		panel1.add(thumb1, BorderLayout.CENTER);
		panel1.add(caption1, BorderLayout.SOUTH);
		panel1.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            System.out.println("Click works"); 
	            full_image.removeAll();
	            full_image.add(thumb1, BorderLayout.CENTER);
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel1);
		
		JPanel panel2 = new JPanel(new BorderLayout());
		ImageIcon image2 = new ImageIcon(new URL("https://csdl-images.computer.org/mags/mu/2007/03/figures/u3012a2.gif"));
		JLabel thumb2 = new JLabel(image2);
		JLabel caption2 = new JLabel("KMP - Comp Sci");
		panel2.add(thumb2, BorderLayout.CENTER);
		panel2.add(caption2, BorderLayout.SOUTH);
		thumbnails.add(panel2);
		
		JPanel panel3 = new JPanel(new BorderLayout());
		ImageIcon image3 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb3 = new JLabel(image3);
		JLabel caption3 = new JLabel("Joaquin Drut - Physics");
		panel3.add(thumb3, BorderLayout.CENTER);
		panel3.add(caption3, BorderLayout.SOUTH);
		thumbnails.add(panel3);
		
		JPanel panel4 = new JPanel(new BorderLayout());
		ImageIcon image4 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb4 = new JLabel(image4);
		JLabel caption4 = new JLabel("Sean Washberg - Physics");
		panel4.add(thumb4, BorderLayout.CENTER);
		panel4.add(caption4, BorderLayout.SOUTH);
		thumbnails.add(panel4);
		
		JPanel panel5 = new JPanel(new BorderLayout());
		ImageIcon image5 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb5 = new JLabel(image5);
		JLabel caption5 = new JLabel("Amy Oldenburg - Physics");
		panel5.add(thumb5, BorderLayout.CENTER);
		panel5.add(caption5, BorderLayout.SOUTH);
		thumbnails.add(panel5);
		
		JPanel panel6 = new JPanel(new BorderLayout());
		ImageIcon image6 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb6 = new JLabel(image6);
		JLabel caption6 = new JLabel("Jack Ng - Physics");
		panel6.add(thumb6, BorderLayout.CENTER);
		panel6.add(caption6, BorderLayout.SOUTH);
		thumbnails.add(panel6);
		
		JPanel panel7 = new JPanel(new BorderLayout());
		ImageIcon image7 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb7 = new JLabel(image7);
		JLabel caption7 = new JLabel("Christian Illiadis - Physics");
		panel7.add(thumb7, BorderLayout.CENTER);
		panel7.add(caption7, BorderLayout.SOUTH);
		thumbnails.add(panel7);
		
		JPanel panel8 = new JPanel(new BorderLayout());
		ImageIcon image8 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb8 = new JLabel(image8);
		JLabel caption8 = new JLabel("David Plaisted - Comp Sci");
		panel8.add(thumb8, BorderLayout.CENTER);
		panel8.add(caption8, BorderLayout.SOUTH);
		thumbnails.add(panel8);
		
		
		
		
		full_image = new JPanel();
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

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

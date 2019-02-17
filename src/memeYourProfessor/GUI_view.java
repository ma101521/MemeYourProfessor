package memeYourProfessor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//hi

public class GUI_view extends JPanel implements MouseListener, ItemListener{
	
	private JPanel full_image;
	private String thumbnail_flag;

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
	            full_image.removeAll();
	            full_image.add(thumb1, BorderLayout.CENTER);
	            thumbnail_flag = "Kris";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel1);
		
		JPanel panel2 = new JPanel(new BorderLayout());
		BufferedImage img2 = null;
		try {
		    img2 = ImageIO.read(new URL("https://csdl-images.computer.org/mags/mu/2007/03/figures/u3012a2.gif"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg2 = img2.getScaledInstance(100, -50, Image.SCALE_SMOOTH);
		ImageIcon image2 = new ImageIcon(dimg2);
		JLabel thumb2 = new JLabel(image2);
		JLabel caption2 = new JLabel("KMP - Comp Sci");
		panel2.add(thumb2, BorderLayout.CENTER);
		panel2.add(caption2, BorderLayout.SOUTH);
		panel2.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb2, BorderLayout.CENTER);
	            thumbnail_flag = "KMP";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel2);
		
		JPanel panel3 = new JPanel(new BorderLayout());
		BufferedImage img3 = null;
		try {
		    img3 = ImageIO.read(new URL("https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-9/215253_19775370672_6693_n.jpg?_nc_cat=106&_nc_ht=scontent-iad3-1.xx&oh=63c26226e2f5b16e8a41304cd55c28ec&oe=5CFBABB0"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg3 = img3.getScaledInstance(200, -50, Image.SCALE_SMOOTH);

		ImageIcon image3 = new ImageIcon(dimg3);
		JLabel thumb3 = new JLabel(image3);
		JLabel caption3 = new JLabel("Joaquin Drut - Physics");
		panel3.add(thumb3, BorderLayout.CENTER);
		panel3.add(caption3, BorderLayout.SOUTH);
		panel3.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb3, BorderLayout.CENTER);
	            thumbnail_flag = "Joaquin";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel3);
		
		JPanel panel4 = new JPanel(new BorderLayout());
		ImageIcon image4 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb4 = new JLabel(image4);
		JLabel caption4 = new JLabel("Sean Washberg - Physics");
		panel4.add(thumb4, BorderLayout.CENTER);
		panel4.add(caption4, BorderLayout.SOUTH);
		panel4.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb4, BorderLayout.CENTER);
	            thumbnail_flag = "Sean";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel4);
		
		JPanel panel5 = new JPanel(new BorderLayout());
		ImageIcon image5 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb5 = new JLabel(image5);
		JLabel caption5 = new JLabel("Amy Oldenburg - Physics");
		panel5.add(thumb5, BorderLayout.CENTER);
		panel5.add(caption5, BorderLayout.SOUTH);
		panel5.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb5, BorderLayout.CENTER);
	            thumbnail_flag = "Amy";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel5);
		
		JPanel panel6 = new JPanel(new BorderLayout());
		ImageIcon image6 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb6 = new JLabel(image6);
		JLabel caption6 = new JLabel("Jack Ng - Physics");
		panel6.add(thumb6, BorderLayout.CENTER);
		panel6.add(caption6, BorderLayout.SOUTH);
		panel6.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb6, BorderLayout.CENTER);
	            thumbnail_flag = "Jack";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel6);
		
		JPanel panel7 = new JPanel(new BorderLayout());
		ImageIcon image7 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb7 = new JLabel(image7);
		JLabel caption7 = new JLabel("Christian Illiadis - Physics");
		panel7.add(thumb7, BorderLayout.CENTER);
		panel7.add(caption7, BorderLayout.SOUTH);
		panel7.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb7, BorderLayout.CENTER);
	            thumbnail_flag = "Christian";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel7);
		
		JPanel panel8 = new JPanel(new BorderLayout());
		ImageIcon image8 = new ImageIcon(new URL("https://cs.unc.edu/wp-content/blogs.dir/130/files/2015/08/kris_jordan-wpcf_120x176.jpg"));
		JLabel thumb8 = new JLabel(image8);
		JLabel caption8 = new JLabel("David Plaisted - Comp Sci");
		panel8.add(thumb8, BorderLayout.CENTER);
		panel8.add(caption8, BorderLayout.SOUTH);
		panel8.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	            full_image.removeAll();
	            full_image.add(thumb8, BorderLayout.CENTER);
	            thumbnail_flag = "David";
	            full_image.revalidate();
	            full_image.repaint();
	          } 
	        }); 
		thumbnails.add(panel8);
		
		
		
		
		full_image = new JPanel();
		full_image.setPreferredSize(new Dimension(400, 400));
		full_image.setLayout(new BorderLayout());
		ImageIcon main_image = new ImageIcon(new URL("https://csdl-images.computer.org/mags/mu/2007/03/figures/u3012a2.gif"));
		JLabel main = new JLabel(main_image);
		full_image.add(main, BorderLayout.CENTER);
		
		
		
		
		JPanel meme_options = new JPanel();
		meme_options.setLayout(new BorderLayout());
		JLabel scenarios = new JLabel("When your professor...");
		meme_options.add(scenarios, BorderLayout.CENTER);
		String[] options = {"Select a Meme", "gives the most boring lecture ever", "doesn't think you have a life", "hands back your test grades", "is the GOAT"};
		JComboBox dropdown = new JComboBox(options);
		dropdown.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//System.out.println(dropdown.getSelectedItem());
					if(thumbnail_flag == "Kris" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Kris Levine.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Kris" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Kris Oprah.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Kris" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Kris Oprah.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					
				}
				if(e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("deselected");
				}
			}
		});
		dropdown.setPreferredSize(new Dimension(400, 40));
		meme_options.add(dropdown, BorderLayout.EAST);
		
		
		add(thumbnails, BorderLayout.WEST);
		add(full_image, BorderLayout.EAST);
		add(meme_options, BorderLayout.SOUTH);
		
		
		
		
		
	}



}

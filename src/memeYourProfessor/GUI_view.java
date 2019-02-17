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
		ImageIcon image4 = new ImageIcon(new URL("https://physics.unc.edu/files/2018/04/Washburn-150x150.png"));
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
		ImageIcon image5 = new ImageIcon(new URL("https://physics.unc.edu/files/2018/04/Oldenburg-150x150.jpeg"));
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
		BufferedImage img6 = null;
		try {
		    img6 = ImageIO.read(new URL("https://physics.unc.edu/files/2018/04/Ng-150x150.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg6 = img6.getScaledInstance(100, -50, Image.SCALE_SMOOTH);

		ImageIcon image6 = new ImageIcon(dimg6);
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
		ImageIcon image7 = new ImageIcon(new URL("https://physics.unc.edu/files/2018/04/Iliadis-150x150.jpeg"));
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
		ImageIcon image8 = new ImageIcon(new URL("https://cs.unc.edu/files/2013/12/plaisted.jpeg"));
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
		
		BufferedImage Levine1 = null;
		try {
		    Levine1 = ImageIO.read(this.getClass().getResource("../Amy Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine1 = Levine1.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Amy_levine = new ImageIcon(dLevine1);		
		
BufferedImage Levine2 = null;
		try {
		    Levine2 = ImageIO.read(this.getClass().getResource("../Illiadis Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine2 = Levine2.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Illiadis_levine = new ImageIcon(dLevine2);	

BufferedImage Levine3 = null;
		try {
		    Levine3 = ImageIO.read(this.getClass().getResource("../Joaquim Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine3 = Levine3.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Joaquim_levine = new ImageIcon(dLevine3);		

BufferedImage Levine4 = null;
		try {
		    Levine4 = ImageIO.read(this.getClass().getResource("../KMP Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine4 = Levine4.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon KMP_levine = new ImageIcon(dLevine4);		

BufferedImage Levine5 = null;
		try {
		    Levine5 = ImageIO.read(this.getClass().getResource("../Kris Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine5 = Levine5.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Kris_levine = new ImageIcon(dLevine5);	
		
BufferedImage Levine6 = null;
		try {
		    Levine6 = ImageIO.read(this.getClass().getResource("../Ng Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine6 = Levine6.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Ng_levine = new ImageIcon(dLevine6);		

BufferedImage Levine7 = null;
		try {
		    Levine7 = ImageIO.read(this.getClass().getResource("../Plastaid Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine7 = Levine7.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Plastaid_levine = new ImageIcon(dLevine7);	

BufferedImage Levine8 = null;
		try {
		    Levine8 = ImageIO.read(this.getClass().getResource("../Sean Levine.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dLevine8 = Levine8.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Sean_levine = new ImageIcon(dLevine8);		
	

BufferedImage Oprah1 = null;
		try {
		    Oprah1 = ImageIO.read(this.getClass().getResource("../KMP Oprah.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah1 = Oprah1.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon KMP_Oprah = new ImageIcon(dOprah1);	


BufferedImage Oprah2 = null;
		try {
		    Oprah2 = ImageIO.read(this.getClass().getResource("../Kris Oprah.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah2 = Oprah2.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Kris_Oprah = new ImageIcon(dOprah2);	

BufferedImage Oprah3 = null;
		try {
		    Oprah3 = ImageIO.read(this.getClass().getResource("../Ng Oprah.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah3 = Oprah3.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Ng_Oprah = new ImageIcon(dOprah3);	

BufferedImage Oprah4 = null;
		try {
		    Oprah4 = ImageIO.read(this.getClass().getResource("../Oprah Amy.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah4 = Oprah4.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Amy_Oprah = new ImageIcon(dOprah4);	
		

BufferedImage Oprah5 = null;
		try {
		    Oprah5 = ImageIO.read(this.getClass().getResource("../Oprah Illiadis.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah5 = Oprah5.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Illiadis_Oprah = new ImageIcon(dOprah5);	
		
BufferedImage Oprah6 = null;
		try {
		    Oprah6 = ImageIO.read(this.getClass().getResource("../Oprah Joaquin.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah6 = Oprah6.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Joaquin_Oprah = new ImageIcon(dOprah6);	

BufferedImage Oprah7 = null;
		try {
		    Oprah7 = ImageIO.read(this.getClass().getResource("../Plaistaid Oprah.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah7 = Oprah7.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Plaistaid_Oprah = new ImageIcon(dOprah7);	
		
BufferedImage Oprah8 = null;
		try {
		    Oprah8 = ImageIO.read(this.getClass().getResource("../sean Oprah.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dOprah8 = Oprah8.getScaledInstance(350, -50, Image.SCALE_SMOOTH);
		ImageIcon Sean_Oprah = new ImageIcon(dOprah8);	

		
		BufferedImage aut1 = null;
		try {
		    aut1 = ImageIO.read(this.getClass().getResource("../David_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut1 = aut1.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon David_Office = new ImageIcon(daut1);		
		
		BufferedImage aut2 = null;
		try {
		    aut2 = ImageIO.read(this.getClass().getResource("../Drut_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut2 = aut2.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon Amy_Office = new ImageIcon(daut2);	
		
		BufferedImage aut3 = null;
		try {
		    aut3 = ImageIO.read(this.getClass().getResource("../Drut_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut3 = aut3.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon Drut_Office = new ImageIcon(daut3);		

		BufferedImage aut4 = null;
		try {
		    aut4 = ImageIO.read(this.getClass().getResource("../Iliadis_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut4 = aut4.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon Iliadis_Office = new ImageIcon(daut4);
		
		BufferedImage aut5 = null;
		try {
		    aut5 = ImageIO.read(this.getClass().getResource("../KMP_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut5 = aut5.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon KMP_Office = new ImageIcon(daut5);		
		
		BufferedImage aut6 = null;
		try {
		    aut6 = ImageIO.read(this.getClass().getResource("../Kris_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut6 = aut6.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon Kris_Office = new ImageIcon(daut6);		
		
		BufferedImage aut7 = null;
		try {
		    aut7 = ImageIO.read(this.getClass().getResource("../Ng_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut7 = aut7.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon Ng_Office = new ImageIcon(daut7);		

		BufferedImage aut8 = null;
		try {
		    aut8 = ImageIO.read(this.getClass().getResource("../Sean_Office.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image daut8 = aut8.getScaledInstance(400, -50, Image.SCALE_SMOOTH);
		ImageIcon Sean_Office = new ImageIcon(daut8);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
						JLabel meme1Label = new JLabel(Kris_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Kris" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Kris Oprah.png"));
						JLabel meme1Label = new JLabel(Kris_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Kris" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Kris_Office.png"));
						JLabel meme1Label = new JLabel(Kris_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Kris" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Kris_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "KMP" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../KMP Oprah.png"));
						JLabel meme1Label = new JLabel(KMP_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "KMP" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../KMP_Office.png"));
						JLabel meme1Label = new JLabel(KMP_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "KMP" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../KMP Levine.png"));
						JLabel meme1Label = new JLabel(KMP_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "KMP" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../KMP_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Joaquin" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Oprah Joaquin.png"));
						JLabel meme1Label = new JLabel(Joaquin_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Joaquin" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Joaquim Levine.png"));
						JLabel meme1Label = new JLabel(Joaquim_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Joaquin" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Drut_Office.png"));
						JLabel meme1Label = new JLabel(Drut_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Joaquin" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Drut_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Sean" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../sean Oprah.png"));
						JLabel meme1Label = new JLabel(Sean_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Sean" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Sean Levine.png"));
						JLabel meme1Label = new JLabel(Sean_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Sean" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Sean_Office.png"));
						JLabel meme1Label = new JLabel(Sean_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Sean" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Sean_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Amy" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Oprah Amy.png"));
						JLabel meme1Label = new JLabel(Amy_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Amy" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Amy Levine.png"));
						JLabel meme1Label = new JLabel(Amy_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Amy" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Amy_Office.png"));
						JLabel meme1Label = new JLabel(Amy_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Amy" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Amy_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Jack" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Ng Oprah.png"));
						JLabel meme1Label = new JLabel(Ng_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Jack" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Ng Levine.png"));
						JLabel meme1Label = new JLabel(Ng_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Jack" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Ng_Office.png"));
						JLabel meme1Label = new JLabel(Ng_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Jack" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Ng_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Christian" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Oprah Illiadis.png"));
						JLabel meme1Label = new JLabel(Illiadis_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Christian" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Illiadis Levine.png"));
						JLabel meme1Label = new JLabel(Illiadis_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Christian" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Iliadis_Office.png"));
						JLabel meme1Label = new JLabel(Iliadis_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "Christian" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Iliadis_Drake.png"));
						JLabel meme1Label = new JLabel(meme1);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "David" && dropdown.getSelectedItem().equals("doesn't think you have a life")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Plastaid Oprah.png"));
						JLabel meme1Label = new JLabel(Plaistaid_Oprah);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "David" && dropdown.getSelectedItem().equals("gives the most boring lecture ever")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../Plaistaid Levine.png"));
						JLabel meme1Label = new JLabel(Plastaid_levine);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "David" && dropdown.getSelectedItem().equals("hands back your test grades")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../David_Office.png"));
						JLabel meme1Label = new JLabel(David_Office);
						full_image.add(meme1Label, BorderLayout.CENTER);
			            full_image.revalidate();
			            full_image.repaint();
					}
					if(thumbnail_flag == "David" && dropdown.getSelectedItem().equals("is the GOAT")) {
						full_image.removeAll();
						ImageIcon meme1 = new ImageIcon(this.getClass().getResource("../David_Drake.png"));
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

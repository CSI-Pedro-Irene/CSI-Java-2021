package csi.irene.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import csi.irene.life.Loan;
import csi.irene.pkg.Animal;

public class Dogpound extends JPanel implements ActionListener {

	List<Dog> dogs = new ArrayList<Dog>();
	
	
	
	private int B_WIDTH = 900;
	private int B_HEIGHT = 900;

	private boolean inGame = true;

	private Image corgi;

	public Dogpound() {
		dogs.add(new Corgi());

		initBoard();
	}

	private void initBoard() {

		setBackground(new Color(40, 160, 180));
		setFocusable(true);

		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		loadImages();

	}
	
	
	

	
	
	

	private void loadImages() {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {

		if (inGame) {

		}

		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(dogs.get(0).icon.getImage(), 0, 0, null);
	}

	
}
package csi.irene.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import csi.irene.life.Loan;
import csi.irene.pkg.Animal;

public class Dogpound extends JPanel implements ActionListener {

	List<Dog> dog = new ArrayList<Dog>();

	private int corgi;
	private int B_WIDTH = 700;
	private int B_HEIGHT = 700;
	private final int DOG_SIZE = 20;
	private final int ALL_DOGS = 120;
	private boolean inGame = true;
	private final int x[] = new int[ALL_DOGS];
	private final int y[] = new int[ALL_DOGS];
	Random random;

	private boolean leftDirection = false;
	private boolean rightDirection = true;
	private boolean upDirection = false;
	private boolean downDirection = false;
	private boolean isRunning = true;

	private final int DELAY = 100;
	private Timer timer;

	private int count;

	public Dogpound() {

		dog.add(new Corgi());

		initBoard();
	}

	private void initBoard() {

		setBackground(new Color(30, 180, 130));
		setFocusable(true);

		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		initGame();

	}

	private void initGame() {

		corgi = 1;

		for (int z = 0; z < corgi; z++) {
			x[z] = 50 - z * 10;
			y[z] = 50;
		}
		timer = new Timer(DELAY, this);
		timer.start();

	}

	private void move() {

		for (int z = corgi; z > 0; z--) {
			x[z] = x[(z - 1)];
			y[z] = y[(z - 1)];
		}

		if (leftDirection) {
			x[0] -= DOG_SIZE;
		}

		if (rightDirection) {
			x[0] += DOG_SIZE;
		}

		if (upDirection) {
			y[0] -= DOG_SIZE;
		}

		if (downDirection) {
			y[0] += DOG_SIZE;
		}

		count++;
		Random rd = new Random();
		Random rand = new Random();

		int randomNum = rand.nextInt((50 - 3) + 3) + 3;
	

	 	if (count % randomNum == 2	) {
			upDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
			leftDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
		}


	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		super.paintComponent(g);

		doDrawing(g);

	}

	private void doDrawing(Graphics g) {

		if (isRunning) {
			for (int z = 0; z < corgi; z++) {
				if (z == 0) {
					g.drawImage(dog.get(0).icon.getImage(), x[z], y[z], this);

				}
			}

			Toolkit.getDefaultToolkit().sync();
		}
	}

	private void checkCollision() {

		for (int z = corgi; z > 0; z--) {

			if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
				isRunning = false;
			}
		}
		Random rd = new Random();

		if (y[0] >= B_HEIGHT) {

			upDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
			leftDirection = rd.nextBoolean();
			downDirection = false;
		}

		if (y[0] < 0) {

			leftDirection = rd.nextBoolean();
			upDirection = false;
			downDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
		}

		if (x[0] >= B_WIDTH) {

			upDirection = rd.nextBoolean();
			rightDirection = false;
			leftDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
		}

		if (x[0] < 0) {

			leftDirection = false;
			upDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
		}

		if (!isRunning) {
			timer.stop();
		}
	}

	private class TAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

			int key = e.getKeyCode();

			if ((key == KeyEvent.VK_S) && (!upDirection)) {
				downDirection = true;
				rightDirection = false;
				leftDirection = false;
			}

			if ((key == KeyEvent.VK_A) && (!rightDirection)) {
				leftDirection = true;
				upDirection = false;
				downDirection = false;
			}

			if ((key == KeyEvent.VK_D) && (!leftDirection)) {
				rightDirection = true;
				upDirection = false;
				downDirection = false;
			}

			if ((key == KeyEvent.VK_W) && (!downDirection)) {
				upDirection = true;
				rightDirection = false;
				leftDirection = false;
			}
			if ((key == KeyEvent.VK_ENTER && (!isRunning))) {

			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (isRunning) {
			checkCollision();
			move();
		}
		repaint();
	}

}
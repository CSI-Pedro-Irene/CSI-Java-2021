package csi.irene.inheritance;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Dog {

	String Hair;
	int Size;
	Boolean wild = true;
	boolean Gender = true;
	ImageIcon icon;

	public Dog() {
	}

	public Dog(String hair, int size, Boolean wild, boolean gender, String directory) {
		super();
		Hair = hair;
		Size = size;
		this.wild = wild;
		Gender = gender;
	   this.icon = new ImageIcon(getClass().getResource("src/csi/irene/inheritance/Picturas/MediumCorgi.png"));
	}

	public class Shit {

		String size;
		boolean smelly;
		String color;

		public Shit(String size, boolean smelly, String color) {
			super();
			this.size = size;
			this.smelly = smelly;
			this.color = color;
		}
	}

	public class Food {
		boolean moist;
		boolean musty;
		boolean bad;

		public Food(boolean moist, boolean musty, boolean bad) {
			super();
			this.moist = moist;
			this.musty = musty;
			this.bad = bad;
		}

	}

	public class Size {
		boolean loud;
		boolean annoying;

		public Size(boolean loud, boolean annoying) {
			super();
			this.loud = loud;
			this.annoying = annoying;
		}

	}

	public void piss() {
		if (Gender == true) {
			System.out.println("Raise leg");
		}

		System.out.println("piss sounds");
	}

	Shit eat(Food f)

	{
		return null;
	}

	void Die() {
	}

	Noise Bark() {
		return new Noise();

	}

	void Wagtail() {
		new Noise();
		System.out.println("wag wag");

		return;
	}

	public void Mate(Dog D) {
	}

}

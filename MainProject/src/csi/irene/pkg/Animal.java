/**
 * 
 */
package csi.irene.pkg;

/**
 * @author pedro
 *
 */
public class Animal {
	static String name;
	int age;
	String scientificName;// Getters and Setters
	Taxonomy taxonomy;

//  Constructors
	public Animal(String name, int age, String scientificName) {
		Animal.name = name;
		this.age = age;
		this.scientificName = scientificName;
	}

	public Animal() {
	}

	public Animal(Taxonomy taxonomy, String name, int age, String scientificName) {
		Animal.name = name;
		this.age = age;
		this.scientificName = scientificName;
		this.taxonomy = taxonomy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Animal.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	   public String toString() {
	    	String s = String.format("""
	    			Name: %s
	    			Age: %d
	    			ScientificName: %s
	    			Taxonomy: %s
	    			""", 
	    			name,
	    			age,
	    			scientificName, 
	    			taxonomy);
	    	return s;	
	    }
	

//  Main Method
	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("Capybara");
		a.setAge(8);
		a.setScientificName("Hydrochoerus hydrochaeris");
		

		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge());
		System.out.println("Scientific Name: " + a.getScientificName());
		System.out.println();
		
		
		Animal a2 = new Animal("Kiwi", 25, "Apteryx");

		System.out.println("Name:" + Animal.name);
		System.out.println("Age:" + a2.age);
		System.out.println("Scientific Name:" + a2.scientificName);
		Taxonomy taxonomy = new Taxonomy("Eukaryote", "Animalia", "Chordata", "Mammalia", "Carnivora", "Canidae",
				"Canis", "Canis Lupus");
		System.out.println();
		
		
		Animal a3 = new Animal(taxonomy, "Dog", 10, "Canis lupus familiaris");

		System.out.println(a3);

	}
}

package csi.irene.pkg;

public class AnimalFarm {
	static Animal[] animals;

//Main Method
	public static void main(String[] args) {
		animals = new Animal[5];
		animals[0] = new Animal(new Taxonomy("Animalia", "Chordata", "Aves", "Apterygiformes", "Apterygidae", "Apteryx","Apteryx mantelli,"), "Kiwi", 25, "Apteryx");
		animals[1] = new Animal(new Taxonomy("Animalia", "Chordata", "Mammalia", "Rodentia", "Caviidae", "Hydrochoerus", "Hydrochoerus hydrochaeris"),"Capybara", 8, "Hydrochoerus hydrochaeris");
        animals[2] = new Animal(new Taxonomy("Animalia", "Chordata", "Mammalia", "Rodentia", "Caviidae", "Cavia", "Cavia porcellanus" ),"Guinea Pig", 5,"Cavia porcellus" );
		animals[3] = new Animal(new Taxonomy("Animalia", "Chordata", "Mammalia", "Erinaceomorpha","Erinaceidae", "Erinaceus","	Erinaceus europaeus" ), "Eurpoean hedgehog", 2, "Erinaceus europaeus" );

		System.out.println(animals[0]);
		System.out.println(animals[1]);
        System.out.println(animals[2]);
        System.out.println(animals[3]);
	
	
	}

}

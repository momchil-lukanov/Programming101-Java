package fastAndFurious;

public class Main {

	public static void main(String[] args) {
		Car vw = new Volkswagen(false);
		Car bmw = new BMW(false);
		Car sk = new Skoda(false);
		Car h = new Honda(false);
		Car audi1 = new Audi(false);
		System.out.println(vw.isEcoFriendly(false));
		System.out.println(bmw.isEcoFriendly(false));
		System.out.println(sk.isEcoFriendly(false));
		System.out.println(h.isEcoFriendly(false));
		System.out.println(audi1.isEcoFriendly(false));
		Audi audi2 = new Audi(true);
		System.out.println(audi2.mileage);
	}

}

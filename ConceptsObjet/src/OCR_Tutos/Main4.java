package OCR_Tutos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Main4 {

	public static void main(String[] args) {
		List<CD> list = new ArrayList<CD>();
		list.add(new CD("Les arcandiers", "7€", 7d));
		list.add(new CD("Frank Zappa", "Tinseltown rebellion", 10.25d));
		list.add(new CD("Frank Zappa", "Bongo Fury", 10.25d));
		list.add(new CD("King Crimson", "red", 15.30d));
		list.add(new CD("Joe Zawinul", "World tour", 12.15d));


		System.out.println("\nAvant le tri : ");
		Iterator<CD> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		Collections.sort(list);

		System.out.println("\nAprès le tri : ");
		it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}
}
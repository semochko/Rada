package rada;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Deputy> deputies = new ArrayList<>();
		deputies.add(new Deputy());
		deputies.add(new Deputy());

		for (Deputy deputy : deputies) {
			System.out.println(deputy.name + ", " + deputy.gender + ", " + deputy.age + ", " + deputy.grafter);
		}
	}
}

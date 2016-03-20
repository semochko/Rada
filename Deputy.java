package rada;

/**
 * 
 * @author Ivan
 *
 */

public class Deputy {
	String name;
	String gender;
	int age;
	boolean grafter;

	public Deputy(String name, String gender, int age, int bride) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		if(bride > 50_000) {
			grafter = true;
			System.out.println("Deputy" + name + " was caught on a bribe of $ "+ bride + ". It has to be prisoners.");
		} else if (bride > 0) {
			grafter = true;
		} else {
			grafter = false;
		}
		
	}

}

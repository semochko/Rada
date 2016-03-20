package rada;

package rada;


import java.util.List;
import java.util.Scanner;

public class UserMenu {

	public void Menu(){
		System.out.println("1 - Output the full list of deputies");
		System.out.println("2 - give bribe deputy");
		System.out.println("3 - Output all deputys bribe's in fraction");
		System.out.println("4 - Output the biggest bribe's in fraction");
		System.out.println("5 - Output all deputys bribe's in rada");
		System.out.println("6 - Output the biggest bribe's in rada");
		System.out.println("7 - exit");
		
		
	}
	
	public void outputTheFullListOfDeputies(List<Deputy> deputies){
		System.out.println("you chosen 1 - Output the full list of deputies");
		
		for(Deputy deputy : deputies){
			System.out.println("Name: " + deputy.name + " gender: " + deputy.gender + " age: " + deputy.age +" fraction: "+deputy.fraction);
		}
	}
	
	public double giveBribeDeputy(Deputy deputy){
		double bribe=0;
		System.out.println("you chosen 2 - give bribe deputy");
		System.out.println("how many $ you want give");
		Scanner re = new Scanner(System.in);
		try {
			bribe= re.nextDouble();
			if(deputy.grafter){
				System.out.println("this deputy is arrested");
			}else{
				System.out.println("this deputy is honest");
			}
			
		} catch (Exception e) {
			System.out.println("error input");
		}
		return bribe;
			
		
	
	}
	
	public void outputAllDeputysBribeInFaction(List<Deputy> deputies){
		System.out.println("you chosen 3 - Output all deputys bribe's in fraction");
		System.out.println("list of fraction");
		System.out.println("list    need    to   write !!!!!!!!!!!!");
		Scanner sc = new Scanner(System.in);
		String fraction = sc.nextLine();
		boolean flag=true;
		for(Deputy deputy : deputies){
		if (deputy.grafter&&(deputy.fraction.equals(fraction))){
			System.out.println("Name: " + deputy.name + " gender: " + deputy.gender + " age: " + deputy.age +" fraction: "+deputy.fraction);
			flag = false;
			
		}
		}
		if(flag){
			System.out.println("list is empty or error enter fractoin");
		}
	}
	
	public void outputTheBiggestBribeInFraction(List<Deputy> deputies){
		System.out.println("you chosen 4 - Output the biggest bribe's in fraction");
		System.out.println("list of fraction");
		System.out.println("list    need    to   write !!!!!!!!!!!!");
		Scanner sc = new Scanner(System.in);
		String fraction = sc.nextLine();
		boolean flag=true;
		double bribe = 0;
		for (Deputy deputyArrray : deputies) {
		
		if (deputyArrray.grafter&&(bribe<deputyArrray.bribe)&&(fraction==deputyArrray.fraction)){
			bribe = deputyArrray.bribe;
			
		}
		}
		for (Deputy deputyArrray : deputies) {
		if (deputyArrray.bribe == bribe)
		{
			System.out.println("Name: " + deputyArrray.name + " gender: " + deputyArrray.gender + " age: " + deputyArrray.age +" fraction: "+deputyArrray.fraction);
		}
		}
		if(flag){
			System.out.println("list is empty or error enter fractoin");
		}
	}
	
	public void outputAllDeputysBribeInRada(List<Deputy> deputies){
		System.out.println("you chosen 5 - Output all deputys bribe's in rada");
	
		for (Deputy deputy : deputies) {
		if (deputy.grafter){
			System.out.println("Name: " + deputy.name + " gender: " + deputy.gender + " age: " + deputy.age);
		}}
	}
	
	public void outputTheBiggestBribeInRada(List<Deputy> deputies){
		System.out.println("you chosen 6 - Output the biggest bribe's in rada");
		boolean flag=true;
		
		double bribe = 0;
		for (Deputy deputy : deputies) {
		
		if (deputy.grafter&&(bribe<deputy.bribe)){
			bribe = deputy.bribe;
			
		}
		}
		for (Deputy deputy : deputies) {
		if (deputy.bribe == bribe)
		{
			System.out.println("Name: " + deputy.name + " gender: " + deputy.gender + " age: " + deputy.age +" fraction: "+deputy.fraction);
		}
		}
		if(flag){
			System.out.println("list is empty or error enter fractoin");
		}
	}
	
	
}

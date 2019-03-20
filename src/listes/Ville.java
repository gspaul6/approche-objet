package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ville2> mickey = new ArrayList<>();
		mickey.add(new Ville2("Carcassonne", 47800));
		mickey.add(new Ville2("Narbonne", 53400));
		mickey.add(new Ville2("Lyon", 484000));
		mickey.add(new Ville2("Foix", 9700));
		mickey.add(new Ville2("Pau", 77200));
		mickey.add(new Ville2("Marseille", 850700));
		mickey.add(new Ville2("Tarbes", 40600));

		// Research the city with highest population
		int max = 0;
		String dodo = null;
		for (Ville2 value : mickey) {

			if (value.getNbdhabitants() > max) {
				max = value.getNbdhabitants();
				dodo = value.toString();
			}

		}

		System.out.println("the city with highest population" + dodo);

		// Supprimez the city with the lowest population
		int min=mickey.get(0).getNbdhabitants();
		String dodo2 = null;
		for (Ville2 value : mickey) {

			if (value.getNbdhabitants() < min) {
				min = value.getNbdhabitants();
				dodo2 = value.toString();
			}
         
		}
		for(int i=0;i<mickey.size();i++)
		{
			if(mickey.get(i).getNbdhabitants()==min)	
			{
				mickey.remove(i);
			}
		}
		
		for(Ville2 valuer : mickey)
		{
		System.out.println("the city with highest population" + valuer);
		}
		// Modify the city with 100,000 and put them in majuscule
		
		//int minus=mickey.get(0).getNbdhabitants();
		String poto = null;
		
		for (Ville2 value : mickey) {

			for(int i=0;i<mickey.size();i++)
				{
					Ville2 ville2 = mickey.get(i);
					if(ville2.getNbdhabitants()>100000)	
					{
															
						
						ville2.setNom(ville2.getNom().toUpperCase());
						//tom.set(i, tom.get(i).toUpperCase());
					}
				}
				
			}
         
		
		for(int i=0;i<mickey.size();i++)
		{
			if(mickey.get(i).getNbdhabitants()==min)	
			{
				mickey.remove(i);
			}
		}
		System.out.println();
		for(Ville2 valuer : mickey)
		{
			
		System.out.println("the city with highest population" +" "+ valuer);
		}
		
	}
}

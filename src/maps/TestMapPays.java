package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import listes.PaysMan;

public class TestMapPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the object maps

		// Hashmaps for testing pays.
		Map<String, PaysMan> map1 = new HashMap<>();

		map1.put("USA", new PaysMan("USA", 327167434, 55805.204));
		map1.put("France", new PaysMan("France", 67795000, 38476.7));
		map1.put("Allemagne", new PaysMan("Allemagne", 82979100, 47589.972));
		map1.put("UK", new PaysMan("UK", 65105246, 43770.688));
		map1.put("Italie", new PaysMan("Italie", 60483973, 29866));
		map1.put("Japon", new PaysMan("Japon", 126168156, 39058.5));
		map1.put("Chine", new PaysMan("Chine", 1417913092, 7989.72));
		map1.put("Russie", new PaysMan("Russie", 146880400, 11099.20));
		map1.put("Inde", new PaysMan("Inde", 1296834042, 1626.982));

		System.out.println("After invoking put() method ");
		for (Map.Entry m : map1.entrySet()) {
			System.out.print(m.getKey() + " ");
		}
		System.out.println();                                          
		System.out.println("getting all the values");
		
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		//delete the one with lowest population
		Iterator jal = map1.values().iterator();
		while(jal.hasNext())
		{int min=0;
			PaysMan timothy=(PaysMan)jal.next();
			if(timothy.getNbdhabitants()<min)
			{
				min=timothy.getNbdhabitants();
			}
			
		}jal.remove();
	
			
		
	for (Map.Entry m : map1.entrySet()) {
		
		System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	}



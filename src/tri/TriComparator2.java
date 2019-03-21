package tri;

import java.util.Comparator;

import listes.PaysMan;

public class TriComparator2 implements Comparator<PaysMan>{

	@Override
	public int compare(PaysMan o1, PaysMan o2) {
		// TODO Auto-generated method stub
		if(o1.getNbdhabitants()==o2.getNbdhabitants())
			
			return 0;
			else if(o1.getNbdhabitants()>o2.getNbdhabitants())
				
				return 1;
			else 
				return-1;
		}
	}



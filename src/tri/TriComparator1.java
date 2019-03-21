package tri;

import java.util.Comparator;

import listes.PaysMan;

public class TriComparator1 implements Comparator<PaysMan> {

	@Override
	public int compare(PaysMan a1, PaysMan a2) {
		// TODO Auto-generated method stub
		if (a1.getPib() == a2.getPib()) {

			return 0;
		} else if (a1.getPib() > a2.getPib()) {

			return 1;
		} else {
			return -1;
		}

	}

}

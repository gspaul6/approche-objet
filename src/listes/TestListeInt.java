package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestListeInt {
	public static ArrayList<Integer> pep = new ArrayList<Integer>();
	public static Integer[] tableau = { -1, 5, 7, 3, -2, 4, 8, 5 };
    
	public static List<Integer> entierrs = new ArrayList<>();
	
	//public static List<Integer> entierrs = Arrays.asList(tableau);
	public static void Afficher() {
		
		Iterator<Integer> itrint = entierrs.iterator();
		while (itrint.hasNext()) {
			System.out.print(itrint.next()+ " ");
		}
	}

	// reseach an integer
	public static void recherchez() {
		Integer maxi = entierrs.get(0);
		Iterator<Integer> temp1 = entierrs.iterator();
		while (temp1.hasNext()) {
			int val = temp1.next();
			if (val > maxi) {
				maxi = val;
			}

		}
		
		System.out.println("the biggest number "+maxi);

	}
	// entierrs.foreach(value -> System.out.println(value));
	public static void supprimez() {
		Integer maxi = entierrs.get(0);
		Iterator<Integer> temp1 = entierrs.iterator();
		while (temp1.hasNext()) {
			int val = temp1.next();
			if (val < maxi) {
				maxi = val;
			}

		}
		System.out.println("the number that will be removed is ="+" "+maxi);
        entierrs.remove(new Integer(maxi));
        System.out.println("The list aftr removing is :");
        Afficher();
	}
	public static void modify() {
		Integer maxi = entierrs.get(0);
		Iterator<Integer> temp1 = entierrs.iterator();
		while (temp1.hasNext()) {
			int val = temp1.next();
			if (val < 0) {
           Integer lol=	entierrs.indexOf(val);
				maxi = -(val);
				entierrs.set(lol, maxi);
				
			}

		}
		 System.out.println(); 
		 System.out.println("The list after modify :");
        Afficher();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		/**
		 * for (int i =0;i<8;i++) { System.out.println("enter an integer"); int
		 * b=scan.nextInt(); pep.add(b); }
		 **/

//		System.out.println("showing another list");
//		for (Integer ti : entierrs) {
//			System.out.print(ti + " ");
//		}
		// Afficher();
		entierrs.add(-1);
		entierrs.add(5);
		entierrs.add(7);
		entierrs.add(3);
		entierrs.add(-2);
		entierrs.add(4);
		entierrs.add(8);
		entierrs.add(5);
		recherchez();
		supprimez();
		modify();
	}

}

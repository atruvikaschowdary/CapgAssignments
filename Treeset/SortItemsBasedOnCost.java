package treesetex;

import java.util.Comparator;

public class SortItemsBasedOnCost implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o2.getCost() - o1.getCost();
	}
	
	

}

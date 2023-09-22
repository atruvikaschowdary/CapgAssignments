package treesetex;

import java.util.Comparator;

public class SortBasedOnType implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getCategory().compareTo(o2.getCategory());
	}
	
	

}

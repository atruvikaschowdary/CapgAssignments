package treesetex;

import java.util.Objects;

public class Food implements Comparable<Food> {

	private String item;
	private int cost;
	private String category;

	public Food(String item, int cost, String category) {
		super();
		this.item = item;
		this.cost = cost;
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, cost, item);
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Food)
		{
			Food food = (Food)obj;
			
			boolean a = food.item.equals(this.getItem());

			boolean b = food.cost==this.cost;

			boolean c = food.category.equals(this.getCategory());

			return a && b && c ;
			
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Food [item=" + item + ", cost=" + cost + ", category=" + category + "]";
	}
	@Override  // default
	public int compareTo(Food food) {
		
		return this.getItem().compareTo(food.getItem());
	}

}

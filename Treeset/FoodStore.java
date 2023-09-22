package treesetex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class FoodStore {

	public static void main(String[] args) {

		Map<Food, List<Review>> map = new HashMap<>();
		TreeSet<Food> allitems = new TreeSet<>();

		Food f1 = new Food("Biryani", 100, "Non veg");
		Food f2 = new Food("palav", 70, "veg");
		Food f3 = new Food("Burger", 120, "veg");
		Food f4 = new Food("chapathi", 110, "veg");
		Food f5 = new Food("chicken", 200, "Non veg");

		allitems.add(f1);
		allitems.add(f2);
		allitems.add(f3);
		allitems.add(f4);
		allitems.add(f5);

		List<Review> revList1 = new ArrayList<>();

		Review r1A = new Review("A", 3, "Satisfied");
		Review r1B = new Review("B", 4, "Very Good");
		Review r1C = new Review("C", 2, "Not Good ");

		revList1.add(r1A);
		revList1.add(r1B);
		revList1.add(r1C);
		map.put(f1, revList1);

		List<Review> revList2 = new ArrayList<>();
		List<Review> revList3 = new ArrayList<>();
		List<Review> revList4 = new ArrayList<>();
		List<Review> revList5 = new ArrayList<>();

		Review r2 = new Review("xyz", 4, "Very Good");
		Review r3 = new Review("fgh", 2, "Not Good ");
		Review r4 = new Review("kjj", 4, "Very Good");
		Review r5 = new Review("osj", 5, "Excellent");

		revList2.add(r2);
		revList3.add(r3);
		revList4.add(r4);
		revList5.add(r5);

		map.put(f2, revList2);
		map.put(f3, revList3);
		map.put(f4, revList4);
		map.put(f5, revList5);

		for (Map.Entry<Food, List<Review>> entry : map.entrySet()) {
			Food key = entry.getKey();
			List<Review> value = entry.getValue();

			System.out.println("---- " + key.getItem() + "-------");
			System.out.println("Price rs. " + key.getCost());
			System.out.println("Category " + key.getCategory());

			System.out.println(" --- Reviews ---");
			for (Review review : value) {
				
				System.out.println("user-name: "+review.getUserName()+"\n");

                System.out.print("Points: ");
				for (int i = 0; i < review.getPoint(); i++) {
					System.out.print("*");
				}

				System.out.print(review.getComments() + "\n");
			}
			System.out.println("\n\n");
		}

		for (Food food : allitems) {
			System.out.println(food);
		}

		System.out.println("---  Foods ( High to low)  ----------");
		getFoodsBasedOnPriceHighToLow(allitems);

		System.out.println("---  Foods ( Based  on Type)  ----------");
		getFoodsBasedOnType(allitems);
	}

	private static void getFoodsBasedOnType(TreeSet<Food> allitems) {
		// TODO Auto-generated method stub

		List<Food> tempList = new ArrayList<>();// or pass as constructor argument
		tempList.addAll(allitems);

		SortBasedOnType sortCode = new SortBasedOnType();
		Collections.sort(tempList, sortCode);

		for (Food food : tempList) {
			System.out.println(food);
		}
	}

	private static void getFoodsBasedOnPriceHighToLow(TreeSet<Food> allitems) {
		// TODO Auto-generated method stub
		List<Food> tempList = new ArrayList<>();// or pass as constructor argument
		tempList.addAll(allitems);

		SortItemsBasedOnCost sortCode = new SortItemsBasedOnCost();
		Collections.sort(tempList, sortCode);

		for (Food food : tempList) {
			System.out.println(food);
		}

	}

}

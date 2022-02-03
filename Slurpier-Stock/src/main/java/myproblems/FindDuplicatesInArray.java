package myproblems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {
	
	public boolean findDuplicates(List<Integer> arrayList) {
		Set<Integer> removedDuplicateList = new HashSet();
		
		arrayList.forEach(value -> removedDuplicateList.add(value));
		
		if(removedDuplicateList.size() == arrayList.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		FindDuplicatesInArray findDuplicatesInArray = new FindDuplicatesInArray();
		System.out.println(findDuplicatesInArray.findDuplicates(List.of(1,5,6,7,4)));
	}

}

package myproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxCombination {
	
	public void findMaxvalues(List<Integer> values, int sumValue) {
		
		List<CombinationValues> combinations = new ArrayList();
		
		List<Integer> listContainesLesserValues = values.stream()
									.filter(value -> value < sumValue)
									.collect(Collectors.toList());
		
		for(int i = 0; i < listContainesLesserValues.size(); i++) {
			for(int j = i+1; j < listContainesLesserValues.size(); j++) {
				if(listContainesLesserValues.get(i) + listContainesLesserValues.get(j) == sumValue) {
					combinations.add(
							new CombinationValues(listContainesLesserValues.get(i),listContainesLesserValues.get(j)));
				}
			}
		}
		List<Integer> firstHighestValue = new ArrayList();
		List<Integer> secondHighestValue = new ArrayList();
		
		combinations.stream().map(value -> {
			firstHighestValue.add(value.firstValue);
		secondHighestValue.add(value.SecondValue);
		});
		
		//get the highest combination
		for(int k = 0 ;k < combinations.size(); k++) {
			for (int m = k+1; m < combinations.size(); m ++) {
				if(combinations.get(k).firstValue > combinations.get(m).firstValue) {
					combinations.remove(k);
				}
			}
		}
		System.out.print(combinations.get(0).firstValue + " "+ combinations.get(0).SecondValue);
		
		
	}
	
	public static void main(String args[]) {
		
		FindMaxCombination findMaxCombination = new FindMaxCombination();
		findMaxCombination.findMaxvalues(List.of(2,3,1,5, 6, 10, 11, 12), 16);
	}

}
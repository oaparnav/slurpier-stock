package myproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PossibleCombinationsOfNumberToStrings {
	
	Map<Integer,String> numbersToAlphabets = new HashMap();
	
	public PossibleCombinationsOfNumberToStrings() {
		numbersToAlphabets.put(1, "A");
		numbersToAlphabets.put(2, "B");
		numbersToAlphabets.put(3, "C");
		numbersToAlphabets.put(4, "D");
		numbersToAlphabets.put(5, "E");
		numbersToAlphabets.put(6, "F");
		numbersToAlphabets.put(7, "G");
		numbersToAlphabets.put(8, "H");
		numbersToAlphabets.put(9, "I");
		numbersToAlphabets.put(10, "J");
		numbersToAlphabets.put(11, "K");
		numbersToAlphabets.put(12, "L");
		numbersToAlphabets.put(13, "M");
		numbersToAlphabets.put(14, "N");
		numbersToAlphabets.put(15, "O");
		numbersToAlphabets.put(16, "P");
		numbersToAlphabets.put(17, "Q");
		numbersToAlphabets.put(18, "R");
		numbersToAlphabets.put(19, "S");
		numbersToAlphabets.put(20, "T");
		numbersToAlphabets.put(21, "U");
		numbersToAlphabets.put(22, "V");
		numbersToAlphabets.put(23, "W");
		numbersToAlphabets.put(24, "X");
		numbersToAlphabets.put(25, "Y");
		numbersToAlphabets.put(26, "Z");
	}
	
	public void findPossibleCobminations(int number) {
		LinkedList<Integer> seperateNumbers = new LinkedList();
		
		while(number > 0) {
			seperateNumbers.push(number%10);
			number = number /10;
		}
		
		List<String> combinations = getcombinations(seperateNumbers);
		
		
		combinations.forEach(val -> System.out.println(val));
		
	}
	
	private List<String> getcombinations(List<Integer> seperateNumbers) {
		List<String> value = new ArrayList();
		for(int i = 0; i < seperateNumbers.size(); i++) {
			for(int j = i+1; j < seperateNumbers.size(); j++) {
				int comb = Integer.parseInt((Integer.toString(seperateNumbers.get(i))
						+Integer.toString(seperateNumbers.get(j))));
				value.add(numbersToAlphabets.get(comb));
				
			}
			int comb = Integer.parseInt((Integer.toString(seperateNumbers.get(i))));
			value.add(numbersToAlphabets.get(comb));
		}
		return value;
	}

	public static void main(String args[]) {
		PossibleCombinationsOfNumberToStrings method = new PossibleCombinationsOfNumberToStrings();
		method.findPossibleCobminations(23);
		
	}

}

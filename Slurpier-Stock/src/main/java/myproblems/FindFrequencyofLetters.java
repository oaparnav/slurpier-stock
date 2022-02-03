package myproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyofLetters {
	
	public HashMap<String, Integer> sortFrequency(String word) {
		
		List<String> wordList = Arrays.asList(word.split(""));
		HashMap<String, Integer> wordsMap = new HashMap();
		
		convertToRecurssion(wordList, wordsMap);
		
		LinkedHashMap<String, Integer> wordsHashMap = wordsMap.entrySet().stream()
						   .sorted((int1, int2) -> int1.getValue().compareTo(int2.getValue()))
						   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
								   (e1, e2) -> e1, LinkedHashMap :: new));
		wordsHashMap.entrySet().forEach(val -> {
			System.out.println(val.getKey() + " , " +val.getValue());
		});
		return null;
	}
	
	private void convertToRecurssion(List<String> wordList, HashMap<String, Integer> wordsMap) {
		for(int i = 0; i < wordList.size(); i++) {
			wordsMap.put(wordList.get(i), innerLoopRecurssion(wordList.size()-1,i,0,wordList));
		}
	}
	
	private int innerLoopRecurssion(int number, int ivalue, int count,  List<String> wordList) {
		if(number >= 0) {
			if(wordList.get(ivalue).equalsIgnoreCase(wordList.get(number))) {
				count++;
			}
			return innerLoopRecurssion(number-1, ivalue, count, wordList);
		} 
		return count;
	}

	public static void main(String args[]) {
		FindFrequencyofLetters findFrequencyofLetters = new FindFrequencyofLetters();
		findFrequencyofLetters.sortFrequency("aabbc");
	}

}

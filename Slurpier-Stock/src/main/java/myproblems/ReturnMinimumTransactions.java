package myproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReturnMinimumTransactions {
	
	public int minimumTransactions(List<Money> moneyList, int withdrawlAmmount) {
		
		moneyList.sort(Comparator.comparing(Money::getRupees));
		
		int count = 0;
		int totalAmount = 0;
		for(int i = moneyList.size()-1; i >= 0 ; i--) {
			Money money = moneyList.get(i);
			for(int j = 1; j <= money.getCount(); j++) {
				if(totalAmount >= withdrawlAmmount) {
					break;
				} else {
					if(totalAmount + money.getRupees() <= withdrawlAmmount) {
					totalAmount = totalAmount + money.getRupees();
					count++;
					}
				}
			}
		}
		if(totalAmount == withdrawlAmmount)
			return count;
		else
			return 0;
	}
	
	public static void main(String args[]) {
		ReturnMinimumTransactions trasactions = new ReturnMinimumTransactions();
		List<Money> moneyList = new ArrayList();
		moneyList.add(new Money(100, 10));
		moneyList.add(new Money(500, 2));
		moneyList.add(new Money(2000, 2));
		moneyList.add(new Money(1000, 2));
		System.out.println(trasactions.minimumTransactions(
				moneyList, 30000));
		
	}

}

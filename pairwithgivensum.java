package example;

import java.util.*;

public class pairwithgivensum {
	public static void pairfound(int a[],int sum,int length) {
		Map<Integer,Integer> pair =new HashMap<>();
		
		for(int i=0;i<length;i++) {
			if(pair.containsKey(sum-a[i]))
				System.out.println("pair found at : "+ i + " and "+ pair.get( sum-a[i]));
			pair.put(a[i], i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a[]=new int[] {8,7,2,5,3,1};
		int sum=10;
		int length=a.length;
		pairfound(a,sum,length);
		
	}

}

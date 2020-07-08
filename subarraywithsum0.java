package example;

import java.util.*;

//subarray with sum zero

public class subarraywithsum0 {
	
	public static boolean subarray(int a[],int length) {
		Set <Integer> array=new HashSet<>();
		array.add(0);int m=0;
		int sum=0;
		for(int i=0;i<length;i++) {
			sum+=a[i];
			if(array.contains(sum)) {
				return true;
			}
			else {
				array.add(sum);
			}
			
			
		}
		return false;
	}

	public static void main(String[] args) {
		int a[]=new int[] {3,4,-7,3,1,3,1,-4,-2,-2};
		int length=a.length;
		if(subarray(a,length)) {
			System.out.println("subarray with zero exists");
		}
		else {
			System.out.println("subarray with zero doent exists");
		}
	}

}

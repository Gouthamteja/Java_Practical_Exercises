package inheritance_and_classes;

import java.util.Scanner;

public class PE5 {
	public static boolean checkConsecutive(String[] arr) {
		if(arr.length < 2) return true;
		int[] nums = new int[arr.length];
		try{
			for(int i = 0; i < arr.length; i++){
				nums[i] = Integer.parseInt(arr[i]);
			} 
			boolean ret = Math.abs(nums[0]-nums[1]) == 1;
			for(int i = 1; i < arr.length-1; i++){
				ret = ret && Math.abs(nums[i]-nums[i+1]) == 1;
				if(!ret) return false;
			} 
			return true;
		}catch(Exception e) {
			System.out.println("Entered values are not integer.");
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
        String[] arr = sc.nextLine().split(",");
        System.out.println("Is consecutive? " + checkConsecutive(arr));
	}

}

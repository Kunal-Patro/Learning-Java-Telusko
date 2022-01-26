/*
 * Enhanced-for loop or for-each loop perform automated for loop task over whole indexes/range. 
 */
public class EnhancedForLoop
{
	public static void main(String[] args)
	{
		int nums1[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int k : nums1) // each value on index starting from 0 to last index, is assigned to k
		{
			System.out.print(" " + k);
		}
		System.out.println("");

		// 2-D Jagged array

		int nums2[][] = {
					{1,2,3,4},
					{5,6,7},
					{8,9},
					{10}
				};
		for(int k[] : nums2) // each index of nums2 will return an one-D array itself
		{
			for(int l : k)
			{
				System.out.print(" " + l);
			}
			System.out.println("");
		}
	}
}

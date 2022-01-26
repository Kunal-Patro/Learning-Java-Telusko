/*
 * Array is set of same type of objects having continous memory location.
 * There are differnt types of array below
 * 1. 1-D array
 * 2. 2-D array
 * 3. Jagged array (2-D array with different number of elements in rows)
 * .length variable is used to get number of elements in particular row.
 * Below is different initialization of arrays.
 */
class Student
{
	int rollno;
	String name;
}
public class Arrays
{
	public static void main(String[] args)
	{
		// 1-D Array

		int[] nums = new int[8];
		nums[0] = 9;
		nums[1] = 10;
		nums[2] = 12;
		nums[3] = 19;
		nums[7] = 25;

		int[] nums1 = {45,30,4,6,10};

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		Student[] s = new Student[4];

		Student[] s_array = {s1,s2,s3,s4};

		// 2-D Array

		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,10,11,12};

		int nums2[][] = { a,b,c};

		int[][] nums3 = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				};

		// Jagged Array

		int nums4[][] = {
					{1,2,3,4},
					{5,6,7},
					{8,9,10,11,12}
				};

		for(int i = 0; i<nums4.length; i++)
		{
			for(int j = 0; j<nums4[i].length; j++)
			{
				System.out.print(" " + nums4[i][j]);
			}
			System.out.println("");
		}

	}
}

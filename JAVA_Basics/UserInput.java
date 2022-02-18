/*
 * Java provides 2 classes for taking user input
 * 1. BufferedReader
 * 2. Scanner
 * Scanner has 2 advantage over BufferedReader
 * 1. Scanner doesn't require exception handeling externally whereas buffered reader did.
 * 2. While using scanner we don't have to convert string to integer as we do in buffered reader.
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput
{
	public static void main(String[] args)
	{
		System.out.println("Enter your choice");
		System.out.println("1. BufferedReader");
		System.out.println("2. Scanner");
		UserInput ui = new UserInput();
		Scanner stream = new Scanner(System.in);
		int choice = stream.nextInt();
		if(choice == 1)
			ui.bufferReading();
		else if(choice == 2)
			ui.scanning();
		else
			return ;
	}
	public void bufferReading()
	{
		System.out.println("Enter a number is Buffer reader: ");
                int n = 0;
                BufferedReader br = null;
                try
                {
                        br = new BufferedReader(new InputStreamReader(System.in));
                        n = Integer.parseInt(br.readLine());
                        br.close();
			System.out.println("Number in BufferedReader is " + n);
                }
                catch(Exception e)
                {
                        System.out.println("Error: " + e.getMessage());
                }

	}
	public void scanning()
	{
		System.out.println("Enter a number in Scanner: ");
                Scanner sc = new Scanner(System.in);
                int k = sc.nextInt();
                System.out.println("Number in Scanner is " + k);

	}
}

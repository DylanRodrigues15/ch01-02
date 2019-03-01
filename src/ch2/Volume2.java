package ch2;
import java.util.Scanner;
/**
 * Jan. 30, 2018
 * @author Dylan Rodrigues
 * Program prints out the price per ounce for a six pack of cans.
 */

public class Volume2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the price for a six pack: "); //read price per pack
		double packPrice  = in.nextDouble();
		
		System.out.print("Enter the volume for each can in ounces: "); //read can volume
		double canVolume = in.nextDouble();
		
		//compute pack volume
		final double CANS_PER_PACK = 6;
		double packVolume = canVolume * CANS_PER_PACK;
		
		//Compute and print the price per ounce
		
		double pricePerOunce = packPrice / packVolume;
		System.out.printf("Price per ounce: %8.2f", pricePerOunce);
		System.out.println();
		
	}

}

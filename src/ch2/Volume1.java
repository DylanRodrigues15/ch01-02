package ch2;

public class Volume1 {

	public static void main(String[] args) {
		int cansPerPack = 6;
		final double CAN_VOLUME = 0.355;
		double totalVolume = cansPerPack * CAN_VOLUME;
		
		System.out.print("A six pack of 12-ounce cans contain ");
		System.out.print(totalVolume);
		System.out.println(" liters");
		
		final double BOTTLE_VOLUME = 2;
		totalVolume = totalVolume + BOTTLE_VOLUME;
		
		System.out.print("A six pack and a two liter bottle contain ");
		System.out.print(totalVolume);
		System.out.println(" liters.");
		

	}

}

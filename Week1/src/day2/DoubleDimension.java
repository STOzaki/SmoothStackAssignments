package day2;
import java.util.Random;

public class DoubleDimension {

	private int[][] double_array;
	private int first_dim_length;
	private int second_dim_length;
	
	public DoubleDimension(int first_dim_length, int second_dim_length) {
		this.first_dim_length = first_dim_length;
		this.second_dim_length = second_dim_length;
		double_array = new int[first_dim_length][second_dim_length];
		RandomizeArray();
		
	}
	
	private void RandomizeArray() {
		Random rand = new Random();
		for(int i = 0; i < first_dim_length; i++) {
			for(int j = 0; j < second_dim_length; j++) {
				double_array[i][j] = rand.nextInt();
			}
		}
	}
	
	public int[] FindMax() {
		// NOTE: if it cannot find anything greater than 0, which is nearly impossible, it will return -1
		int max_number = Integer.MIN_VALUE;
		int first_pos = -1;
		int second_pos = -1;
		int[] result = new int[3];
		for(int i = 0; i < first_dim_length; i++) {
			for(int j = 0; j < second_dim_length; j++) {
				if(double_array[i][j] > max_number) {
					max_number = double_array[i][j];
					first_pos = i;
					second_pos = j;
				}
			}
		}
		result[0] = max_number;
		result[1] = first_pos;
		result[2] = second_pos;
		return result;
		
	}

	public static void main(String[] args) {
		int[][] double_array = new int[3][5];
		double_array[0][0] = 14;
		DoubleDimension test = new DoubleDimension(100, 100);
		int[] answer = test.FindMax();
		System.out.println("The max number is " + answer[0] + ".");
		System.out.println("The first position of the array is " + answer[1] + ".");
		System.out.println("The second position of the array is " + answer[2] + ".");
	}
}

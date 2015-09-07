package homework;
import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {

	public static void main(String[] args) {
		//ArrayList<Integer> matrix = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int dim = input.nextInt();
		createArray(dim);
		input.close();
	}
	
	// This method creates an array with specified dimensions and populates it with random 0's and 1's
	public static void createArray(int dim) {
		int[][] grid  = new int[dim][dim];
		for(int row = 0; row < grid.length;row++) {
			for (int column = 0; column < grid[row].length; column++) {
				grid[row][column] = (int)(Math.random() * 2);
			}
		}
		printArray(grid);
		rowChecker(grid);
	}
	
	public static void printArray(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				System.out.print(grid[row][column]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	public static void rowChecker(int[][] grid) {
		ArrayList<Integer> rowIndex = new ArrayList<>();
		int maximus = 0;
		int counter = 0;
		for (int row = 0; row < grid.length; row++) {
			counter = 0;
			for (int column = 0; column < grid[row].length; column++) {
				if (grid[row][column] > 0) {
					counter++;
				}
				if (counter > maximus) {
					maximus = counter;
				}
				rowIndex.add(row, counter);
			}	
		}
		System.out.print("The largest rows are ");
		for (int i = 0; i < grid.length; i++) {
			if (rowIndex.get(i) == maximus) {
				System.out.print(i + " ");
			}
		}
		columnChecker(grid);
	}
	
	
	public static void columnChecker(int[][] grid) {
		ArrayList<Integer> columnIndex = new ArrayList<>();
		int maximus = 0;
		int counter = 0;
		for (int row = 0; row < grid.length; row++) {
			counter = 0;
			for (int column = 0; column < grid.length; column++) {
				if (grid[column][row] > 0) {
					counter++;
				}
				if (counter > maximus) {
					maximus = counter;
				}
				columnIndex.add(row, counter);
			}
			
		}
		System.out.println();
		System.out.print("The largest columns are ");
		for (int i = 0; i < grid.length; i++) {
			if (columnIndex.get(i) == maximus) {
				System.out.print(i + " ");
			}
		}
	}
}
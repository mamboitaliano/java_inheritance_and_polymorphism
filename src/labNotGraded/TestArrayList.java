package labNotGraded;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList<>();
		
		// Add some cities in the list
		cityList.add("Sacramento");
		cityList.add("Washington DC");
		cityList.add("Bethesda");
		cityList.add("Fairfax");
		cityList.add("Reston");
		cityList.add("Merrifield");
		
		// Call the size() method on the ArrayList class to get Java to tell you the number of elements (cities) in your ArrayList
		System.out.println("Number of cities in this list: " + cityList.size());
		System.out.println();
		
		// Display list
		System.out.println("C  I  T  Y     L  I  S  T  ");
		for (int i = 0; i < cityList.size(); i++)
		{
			System.out.println(cityList.get(i));
		}
		System.out.println();
		selectTask(cityList);
		
	}
	
	public static void selectTask(ArrayList<String> cityList) {
		// Task selection dialog
		System.out.println();
		System.out.println("What do you want to do? Options:");
		System.out.println("1. Check whether a specified city is in the list");
		System.out.println("2. Add a specified city to the list");
		System.out.println("3. Remove a city from the list");
		
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		if (selection == 1) 
		{
			checkIfCityInList(cityList);
		}
		else if (selection == 2)
		{
			addCity(cityList);
		}
		else if (selection == 3)
		{
			removeCity(cityList);
		}
		input.close();
	}
	
	// Check if the specified city is in the ArrayList
	public static void checkIfCityInList(ArrayList<String> cityList) {
		
		System.out.println("Enter a city name to check whether it is in the list");
		Scanner input = new Scanner(System.in);
		String cityname = input.next();
		
		if (cityList.contains(cityname) == true)
		{
			System.out.print(cityname + " is in the list. Its position in the list is " + cityList.indexOf(cityname));
		}
		else 
		{
			System.out.println("Sorry, " + cityname + " was not found in the list");
			// add option to add city to list
		}
		System.out.println();
		selectTask(cityList);
		input.close();
	}
	
	// Check city location method
	public static int checkCityLocationInList(ArrayList<String> cityList) {
		System.out.print("Enter a city name: ");
		Scanner input = new Scanner(System.in);
		input.close();
		String cityname = input.next();
		return cityList.indexOf(cityname);
	}
	
	// Add city method
	public static void addCity(ArrayList<String> cityList) {
		System.out.print("Enter a city name: ");
		Scanner input = new Scanner(System.in);
		String cityname = input.next();
		
		if (cityList.contains(cityname) == true)
		{
			System.out.println("This city is already listed at index position " + cityList.indexOf(cityname));
		}
		else
		{
			System.out.print("At what index position do you want this city to be inserted?  ");
			Scanner inputindex = new Scanner(System.in);
			int cityIndexPosition = inputindex.nextInt();
			inputindex.close();
			System.out.println();
			
			cityList.add(cityIndexPosition, cityname);
			System.out.println("Your city has been added to the list. Here is your new list: ");
			for (int i = 0; i < cityList.size(); i++)
			{
				System.out.println(cityList.get(i));
			}
		}
		selectTask(cityList);
		input.close();
	}
	
	// Remove a city from the list
	public static void removeCity(ArrayList<String> cityList) {
		System.out.print("Enter a city name: ");
		Scanner input = new Scanner(System.in);
		String cityname = input.next();
		int cityIndexNo = 0;
		
		for (int x = 0; x < cityList.size(); x++) 
		{
			if (cityname == cityList.get(x))
			{
				cityIndexNo = x;
			}
		}
		
		if (cityList.contains(cityIndexNo) == false) 
		{
			System.out.print("This city is not part of the list. Cannot remove something that isn't there.");
		}
		else 
		{
			cityList.remove(cityIndexNo);
			System.out.println("Specified city has been removed from the list. Here is your new list: ");
			for (int i = 0; i < cityList.size(); i++)
			{
				System.out.println(cityList.get(i));
			}
		}
		System.out.println();
		selectTask(cityList);
		input.close();
	}

}

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Swamp {

	public static void main(String[] args) {
		SwampMap Grid = new SwampMap(4, 4);
		Player Godwin = new Player(1, 5);
		Treasure Food = new Treasure(2, 2);
		Treasure water = new Treasure(3, 3);

		Scanner input = new Scanner(System.in);
		String name = JOptionPane.showInputDialog(null, "Enter your name:");
		System.out.println("Hello :" + name);

		System.out.println("Welcome to your doom, try and find your way out of the swamp by entering directions and distances you want to go in. ");
		System.out.println("Find the treasure on your way : )");
		
		System.out.println("Enter the distance you want to move in (Between 1-5m):");

		int meters = input.nextInt();

		System.out
				.println("Enter the direction you want to move in (North=1, East=2, South=3 and West=4:");
		int direction = input.nextInt();

		while ((Godwin.getX() != 2) && (Godwin.getY() != 2)){
			System.out.println("Enter the distance you want to move in (Between 1-5m):");

			int meters1 = input.nextInt();

			System.out
					.println("Enter the direction you want to move in (North=1, East=2, South=3 and West=4:");
			int direction1 = input.nextInt();
			
			//if(Godwin.getX() == 1)
			
		

			}
			

		input.close();

		/*
		 * int swampMap[][] = new int [5][5];
		 * 
		 * int place = 10;
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { }
		 * 
		 * 
		 * swampMap[i] = i + 1 ;
		 * 
		 * 
		 * swampMap[i][j] = place; place += 10;
		 * 
		 * if(i == meters - 1 && j == direction){
		 * 
		 * System.out.println("You have moved 1 meter towards the north");
		 */

	}

}

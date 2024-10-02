import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	private ArrayList<String> actions = new ArrayList<String>();

	GameMenu(ArrayList<String> arrList){
	this.actions = arrList;
}

	public void displayMenu(){
		for(int i = 0; i < actions.size();i++){
			System.out.println(actions.get(i));
		}
	}

	public int getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();

		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());
		return choice;
	}

} 
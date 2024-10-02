import java.util.ArrayList;
import java.util.Scanner;

public class MainTask4{

public static void main(String[] args){

	ArrayList<String> actions = new ArrayList<String>();
	actions.add("1) Start game");
	actions.add("2) Resume game");
	actions.add("3) Pause game");
	actions.add("4) End game");

	GameMenu game = new GameMenu(actions);

	int userChoice = game.getAction();

	doAction(userChoice);
}
	
public static void doAction(int choice){

	switch(choice){
case 1:
	System.out.println("Starting the game now");
	break;
case 2:
	System.out.println("Fetching previously saves game data");
	break;
case 3:
	System.out.println("Game paused");
	break;
case 4:
	System.out.println("Ending game");
	break;
default:
	System.out.println("Your choice is not available");
}

}

}
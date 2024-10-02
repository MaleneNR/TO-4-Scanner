class Main{

public static void main(String[] args){
	Team team1 = new Team("Wupwup WinnerTeam");
	Team team2 = new Team("Team2");
	Team team3 = new Team("Team3");
	Team team4 = new Team("Team4");
	Team team5 = new Team("Team5");

	team1.addPlayer("Anton");
	team1.addPlayer("Theis");
	team1.addPlayer("Bent");


	team1.setRank(10);
	team2.setRank(8);
	team3.setRank(6);
	team4.setRank(4);
	team5.setRank(2);

	System.out.println(team1);
	System.out.println(team2);
	System.out.println(team3);
	System.out.println(team4);
	System.out.println(team5);

}

}
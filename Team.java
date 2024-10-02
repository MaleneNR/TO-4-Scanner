import java.util.ArrayList;

class Team{
	private String teamName;
	private int teamRank;
	private ArrayList<String> players = new ArrayList<String>();

	public Team(String teamName){
		this.teamName = teamName;
	}


	public void addPlayer(String playername){
		players.add(playername);
	}


	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}


	public String toString(){
		String s = "Team: " + teamName + ", Rank:" + teamRank + "\n\n";
		for (int i = 0; i < players.size();i++){
			s+= "Player"+ (i+1) + " " + players.get(i) + "\n";
		}
				return s;
	}

}
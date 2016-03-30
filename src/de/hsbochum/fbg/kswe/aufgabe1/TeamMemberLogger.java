package de.hsbochum.fbg.kswe.aufgabe1;

public class TeamMemberLogger {
	
	public static void main(String[] args) {
		TeamMemberLogger tml = new TeamMemberLogger();
		tml.loadTeamMembers();
		tml.doLog();
	}

	private void loadTeamMembers() {
		
	}

	private void doLog() {
		int memberCount = 0;
		System.out.println(String.format("%s Mitglieder insgesamt:", memberCount));
		System.out.println("Noch keine Mitglieder");
		//TODO list team members
	}
	
}
